package edu.sjsu.fwjs;

import java.util.ArrayList;
import java.util.List;

/**
 * FWJS expressions.
 */
public interface Expression {
    /**
     * Evaluate the expression in the context of the specified environment.
     */
    public Value evaluate(Environment env);
}

// NOTE: Using package access so that all implementations of Expression
// can be included in the same file.
/**
 * FWJS constants.
 */
class ValueExpr implements Expression {
    private Value val;
    public ValueExpr(Value v) {
        this.val = v;
    }
    public Value evaluate(Environment env) {
        return this.val;
    }
}

/**
 * Expressions that are a FWJS variable.
 */
class VarExpr implements Expression {
    private String varName;
    public VarExpr(String varName) {
        this.varName = varName;
    }
    public Value evaluate(Environment env) {
        Value v = env.resolveVar(varName);
        return v;
    }
}

/**
 * A print expression.
 */
class PrintExpr implements Expression {
    private Expression exp;
    public PrintExpr(Expression exp) {
        this.exp = exp;
    }
    public Value evaluate(Environment env) {
        Value v = exp.evaluate(env);
        System.out.println(v.toString());
        return v;
    }
}
/**
 * Binary operators (+, -, *, etc).
 * Currently only numbers are supported.
 */
class BinOpExpr implements Expression {
    private Op op;
    private Expression e1;
    private Expression e2;
    public BinOpExpr(Op op, Expression e1, Expression e2) {
        this.op = op;
        this.e1 = e1;
        this.e2 = e2;
    }

    @SuppressWarnings("incomplete-switch")
    public Value evaluate(Environment env) {
        Value a = this.e1.evaluate(env);
        Value b = this.e2.evaluate(env);
        
        switch(this.op) {
            case ADD:
                // Handle string concatenation
                if (a instanceof StringVal || b instanceof StringVal) {
                    String str1 = (a instanceof StringVal) ? ((StringVal) a).getString() : a.toString();
                    String str2 = (b instanceof StringVal) ? ((StringVal) b).getString() : b.toString();
                    return new StringVal(str1 + str2);
                }
                // Handle integer addition
                else if (a instanceof IntVal && b instanceof IntVal) {
                    int result = ((IntVal) a).toInt() + ((IntVal) b).toInt();
                    return new IntVal(result);
                }
                break;

            case SUBTRACT:
                if (a instanceof IntVal && b instanceof IntVal) {
                    int result = ((IntVal) a).toInt() - ((IntVal) b).toInt();
                    return new IntVal(result);
                }
                break;

            case MULTIPLY:
                if (a instanceof IntVal && b instanceof IntVal) {
                    int result = ((IntVal) a).toInt() * ((IntVal) b).toInt();
                    return new IntVal(result);
                }
                break;

            case DIVIDE:
                if (a instanceof IntVal && b instanceof IntVal) {
                    int result = ((IntVal) a).toInt() / ((IntVal) b).toInt();
                    return new IntVal(result);
                }
                break;

            case MOD:
                if (a instanceof IntVal && b instanceof IntVal) {
                    int result = ((IntVal) a).toInt() % ((IntVal) b).toInt();
                    return new IntVal(result);
                }
                break;

            case GT:
                if (a instanceof IntVal && b instanceof IntVal) {
                    boolean result = ((IntVal) a).toInt() > ((IntVal) b).toInt();
                    return new BoolVal(result);
                } else if (a instanceof StringVal && b instanceof StringVal) {
                    boolean result = ((StringVal) a).getString().compareTo(((StringVal) b).getString()) > 0;
                    return new BoolVal(result);
                }
                break;

            case GE:
                if (a instanceof IntVal && b instanceof IntVal) {
                    boolean result = ((IntVal) a).toInt() >= ((IntVal) b).toInt();
                    return new BoolVal(result);
                } else if (a instanceof StringVal && b instanceof StringVal) {
                    boolean result = ((StringVal) a).getString().compareTo(((StringVal) b).getString()) >= 0;
                    return new BoolVal(result);
                }
                break;

            case LT:
                if (a instanceof IntVal && b instanceof IntVal) {
                    boolean result = ((IntVal) a).toInt() < ((IntVal) b).toInt();
                    return new BoolVal(result);
                } else if (a instanceof StringVal && b instanceof StringVal) {
                    boolean result = ((StringVal) a).getString().compareTo(((StringVal) b).getString()) < 0;
                    return new BoolVal(result);
                }
                break;

            case LE:
                if (a instanceof IntVal && b instanceof IntVal) {
                    boolean result = ((IntVal) a).toInt() <= ((IntVal) b).toInt();
                    return new BoolVal(result);
                } else if (a instanceof StringVal && b instanceof StringVal) {
                    boolean result = ((StringVal) a).getString().compareTo(((StringVal) b).getString()) <= 0;
                    return new BoolVal(result);
                }
                break;

            case EQ:
                // Use the equals method for proper comparison
                return new BoolVal(a.equals(b));

            default:
                return new NullVal();
        }
        return new NullVal();
    }
}
/**
 * If-then-else expressions.
 * Unlike JS, if expressions return a value.
 */
class IfExpr implements Expression {
    private Expression cond;
    private Expression thn;
    private Expression els;
    public IfExpr(Expression cond, Expression thn, Expression els) {
        this.cond = cond;
        this.thn = thn;
        this.els = els;
    }
    public Value evaluate(Environment env) {
        Value c = this.cond.evaluate(env);
        Value t = this.thn.evaluate(env);
        Value e = this.els.evaluate(env);
        BoolVal condition = (BoolVal) c;
        if(condition.toBoolean() == true)
            return t;
        else
            return e;
    }
}

/**
 * While statements (treated as expressions in FWJS, unlike JS).
 */
class WhileExpr implements Expression {
    private Expression cond;
    private Expression body;
    public WhileExpr(Expression cond, Expression body) {
        this.cond = cond;
        this.body = body;
    }
    public Value evaluate(Environment env) {
        while (true) {
            // Evaluate the condition
            Value c = this.cond.evaluate(env);
            
            // Check if the condition is a BoolVal and if it's true
            if (c instanceof BoolVal) {
                BoolVal condition = (BoolVal) c;
                if (!condition.toBoolean()) {
                    break; // Exit the loop if the condition is false
                }
            } else {
                // Handle error: condition should be a BoolVal
                throw new RuntimeException("Condition must be a BoolVal.");
            }

            // Evaluate and execute the body of the while loop
            body.evaluate(env);
        }
        return null;
    }
}

/**
 * Sequence expressions (i.e. 2 back-to-back expressions).
 */
class SeqExpr implements Expression {
    private Expression e1;
    private Expression e2;
    public SeqExpr(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    public Value evaluate(Environment env) {
        Value a = this.e1.evaluate(env);
        Value b = this.e2.evaluate(env);
        return b;
    }
}

/**
 * Declaring a variable in the local scope.
 */
class VarDeclExpr implements Expression {
    private String varName;
    private Expression exp;
    public VarDeclExpr(String varName, Expression exp) {
        this.varName = varName;
        this.exp = exp;
    }
    public Value evaluate(Environment env) {
        // YOUR CODE HERE
        // create the variable in the current environment
        // return it
        env.createVar(varName, exp.evaluate(env));
        return env.resolveVar(varName);
    }
}

/**
 * Updating an existing variable.
 * If the variable is not set already, it is added
 * to the global scope.
 */
class AssignExpr implements Expression {
    private String varName;
    private Expression e;
    public AssignExpr(String varName, Expression e) {
        this.varName = varName;
        this.e = e;
    }
    public Value evaluate(Environment env) {
        Value vari = e.evaluate(env);
        env.updateVar(varName, vari);
        return env.resolveVar(varName);
    }
}

/**
 * A function declaration, which evaluates to a closure.
 */
class FunctionDeclExpr implements Expression {
    private List<String> params;
    private Expression body;
    public FunctionDeclExpr(List<String> params, Expression body) {
        this.params = params;
        this.body = body;
    }
    public Value evaluate(Environment env) {
        // YOUR CODE HERE
        // Create the closure
        // Return closure
        ClosureVal closure = new ClosureVal(params, body, env);
        return closure;
    }
}

/**
 * Function application.
 */
class FunctionAppExpr implements Expression {
    private Expression f;
    private List<Expression> args;
    public FunctionAppExpr(Expression f, List<Expression> args) {
        this.f = f;
        this.args = args;
    }
    public Value evaluate(Environment env) {
        // YOUR CODE HERE
        // make new list by evaluating the list of expressions
        List<Value> argList = new ArrayList<>();
        // Create new closure
        ClosureVal closure = (ClosureVal) f.evaluate(env);
        // Evaluate all the expressions in the list
        // Place in List of Values
        for(Expression arg : args)
            argList.add(arg.evaluate(env));
        // Apply closure
        return closure.apply(argList);
    }
}