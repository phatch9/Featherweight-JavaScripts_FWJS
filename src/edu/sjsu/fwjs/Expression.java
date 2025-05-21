package edu.sjsu.fwjs;

import java.util.ArrayList;
import java.util.List;

public interface Expression {
    public Value evaluate(Environment env);
}

class ValueExpr implements Expression {
    private Value val;
    public ValueExpr(Value v) { this.val = v; }
    public Value evaluate(Environment env) { return this.val; }
}

class VarExpr implements Expression {
    private String varName;
    public VarExpr(String varName) { this.varName = varName; }
    public Value evaluate(Environment env) { return env.resolveVar(varName); }
}

class PrintExpr implements Expression {
    private Expression exp;
    public PrintExpr(Expression exp) { this.exp = exp; }
    public Value evaluate(Environment env) {
        Value v = exp.evaluate(env);
        System.out.println(v.toString());
        return v;
    }
}

class BinOpExpr implements Expression {
    private Op op;
    private Expression e1;
    private Expression e2;

    public BinOpExpr(Op op, Expression e1, Expression e2) {
        this.op = op;
        this.e1 = e1;
        this.e2 = e2;
    }

    public Value evaluate(Environment env) {
        Value a = e1.evaluate(env);
        Value b = e2.evaluate(env);

        // Handle equality for all types
        if (op == Op.EQ) {
            return new BoolVal(a.equals(b));
        }

        // Handle arithmetic operations
        if (op == Op.ADD) {
            // Handle cases where either operand might be a closure (treat as 0)
            int left = a instanceof IntVal ? ((IntVal)a).toInt() : 0;
            int right = b instanceof IntVal ? ((IntVal)b).toInt() : 0;
            return new IntVal(left + right);
        }

        // For other operations, require both to be IntVal
        if (a instanceof IntVal && b instanceof IntVal) {
            int n1 = ((IntVal)a).toInt();
            int n2 = ((IntVal)b).toInt();
            
            switch(op) {
                case SUBTRACT: return new IntVal(n1 - n2);
                case MULTIPLY: return new IntVal(n1 * n2);
                case DIVIDE: return new IntVal(n1 / n2);
                case MOD: return new IntVal(n1 % n2);
                case GT: return new BoolVal(n1 > n2);
                case GE: return new BoolVal(n1 >= n2);
                case LT: return new BoolVal(n1 < n2);
                case LE: return new BoolVal(n1 <= n2);
                default: throw new RuntimeException("Unsupported operation: " + op);
            }
        }

        throw new RuntimeException(String.format(
            "Unsupported operation between %s and %s with operator %s",
            a.getClass().getSimpleName(), 
            b.getClass().getSimpleName(),
            op));
    }
}

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
        Value condVal = cond.evaluate(env);
        boolean condition;
        
        if (condVal instanceof BoolVal) {
            condition = ((BoolVal)condVal).toBoolean();
        } else if (condVal instanceof IntVal) {
            condition = ((IntVal)condVal).toInt() != 0;
        } else {
            condition = !(condVal instanceof NullVal);
        }
        
        if (condition) {
            return thn != null ? thn.evaluate(env) : new NullVal();
        } else {
            return els != null ? els.evaluate(env) : new NullVal();
        }
    }
}

class WhileExpr implements Expression {
    private Expression cond;
    private Expression body;
    public WhileExpr(Expression cond, Expression body) {
        this.cond = cond;
        this.body = body;
    }
    public Value evaluate(Environment env) {
        while (true) {
            Value c = cond.evaluate(env);
            if (!(c instanceof BoolVal)) {
                throw new RuntimeException("While condition must evaluate to BoolVal");
            }
            if (!((BoolVal)c).toBoolean()) break;
            body.evaluate(env);
        }
        return new NullVal();
    }
}

class SeqExpr implements Expression {
    private Expression e1;
    private Expression e2;
    public SeqExpr(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    public Value evaluate(Environment env) {
        e1.evaluate(env);
        return e2.evaluate(env);
    }
}

class VarDeclExpr implements Expression {
    private String varName;
    private Expression exp;
    public VarDeclExpr(String varName, Expression exp) {
        this.varName = varName;
        this.exp = exp;
    }
    public Value evaluate(Environment env) {
        Value v = exp.evaluate(env);
        env.createVar(varName, v);
        return v;
    }
}

class AssignExpr implements Expression {
    private String varName;
    private Expression e;
    public AssignExpr(String varName, Expression e) {
        this.varName = varName;
        this.e = e;
    }
    public Value evaluate(Environment env) {
        Value v = e.evaluate(env);
        env.updateVar(varName, v);
        return v;
    }
}

class FunctionDeclExpr implements Expression {
    private List<String> params;
    private Expression body;
    public FunctionDeclExpr(List<String> params, Expression body) {
        this.params = params;
        this.body = body;
    }
    public Value evaluate(Environment env) {
        return new ClosureVal(params, body, env);
    }
}

class FunctionAppExpr implements Expression {
    private Expression f;
    private List<Expression> args;
    public FunctionAppExpr(Expression f, List<Expression> args) {
        this.f = f;
        this.args = args;
    }
    public Value evaluate(Environment env) {
        Value funcVal = f.evaluate(env);
        if (funcVal instanceof NullVal) {
            return new NullVal(); // or throw an exception if preferred
        }
        if (!(funcVal instanceof ClosureVal)) {
            throw new RuntimeException("Attempt to call non-function value: " + funcVal);
        }
        ClosureVal closure = (ClosureVal)funcVal;
        List<Value> argVals = new ArrayList<>();
        for (Expression arg : args) {
            argVals.add(arg.evaluate(env));
        }
        return closure.apply(argVals);
    }
}