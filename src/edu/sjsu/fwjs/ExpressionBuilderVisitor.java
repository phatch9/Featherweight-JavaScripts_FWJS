/* This file for later testing in Task 3
 * Will be comment out to avoid conflictt
 */

// package edu.sjsu.fwjs;

// import java.util.ArrayList;
// import java.util.List;
// import org.antlr.v4.runtime.tree.TerminalNode;
// import edu.sjsu.fwjs.parser.FeatherweightJavaScriptBaseVisitor;
// import edu.sjsu.fwjs.parser.FeatherweightJavaScriptParser;

// public class ExpressionBuilderVisitor extends FeatherweightJavaScriptBaseVisitor<Expression> {

//     @Override
//     public Expression visitProg(FeatherweightJavaScriptParser.ProgContext ctx) {
//         List<Expression> stmts = new ArrayList<Expression>();
//         for (int i = 0; i < ctx.stat().size(); i++) {
//             Expression exp = visit(ctx.stat(i));
//             if (exp != null) stmts.add(exp);
//         }
//         return stmts.isEmpty() ? new ValueExpr(new NullVal()) : listToSeqExp(stmts);
//     }

//     @Override
//     public Expression visitBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx) {
//         return visit(ctx.expr());
//     }

//     @Override
//     public Expression visitIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx) {
//         Expression cond = visit(ctx.expr());
//         Expression thn = visit(ctx.block(0));
//         Expression els = visit(ctx.block(1));
//         return new IfExpr(cond, thn, els);
//     }

//     @Override
//     public Expression visitIfThen(FeatherweightJavaScriptParser.IfThenContext ctx) {
//         Expression cond = visit(ctx.expr());
//         Expression thn = visit(ctx.block());
//         return new IfExpr(cond, thn, new ValueExpr(new NullVal()));
//     }

//     @Override
//     public Expression visitFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx) {
//         List<Expression> stmts = new ArrayList<Expression>();
//         for (int i = 1; i < ctx.getChildCount() - 1; i++) {
//             Expression exp = visit(ctx.getChild(i));
//             if (exp != null) stmts.add(exp);
//         }
//         return listToSeqExp(stmts);
//     }

//     @Override
//     public Expression visitSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx) {
//         return visit(ctx.stat());
//     }

//     @Override
//     public Expression visitPrint(FeatherweightJavaScriptParser.PrintContext ctx) {
//         return new PrintExpr(visit(ctx.expr()));
//     }

//     @Override
//     public Expression visitWhile(FeatherweightJavaScriptParser.WhileContext ctx) {
//         Expression cond = visit(ctx.expr());
//         Expression body = visit(ctx.block());
//         return new WhileExpr(cond, body);
//     }

//     @Override
//     public Expression visitVarDec(FeatherweightJavaScriptParser.VarDecContext ctx) {
//         String varName = ctx.ID().getText();
//         Expression value = visit(ctx.expr());
//         return new VarDeclExpr(varName, value);
//     }

//     @Override
//     public Expression visitAssiState(FeatherweightJavaScriptParser.AssiStateContext ctx) {
//         String varName = ctx.ID().getText();
//         Expression value = visit(ctx.expr());
//         return new AssignExpr(varName, value);
//     }

//     @Override
//     public Expression visitAddSub(FeatherweightJavaScriptParser.AddSubContext ctx) {
//         Expression left = visit(ctx.expr(0));
//         Expression right = visit(ctx.expr(1));
//         Op op = ctx.op.getType() == FeatherweightJavaScriptParser.ADD ? Op.ADD : Op.SUBTRACT;
//         return new BinOpExpr(op, left, right);
//     }

//     @Override
//     public Expression visitMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx) {
//         Expression left = visit(ctx.expr(0));
//         Expression right = visit(ctx.expr(1));
//         Op op;
//         switch (ctx.op.getType()) {
//             case FeatherweightJavaScriptParser.MUL: op = Op.MULTIPLY; break;
//             case FeatherweightJavaScriptParser.DIV: op = Op.DIVIDE; break;
//             case FeatherweightJavaScriptParser.MOD: op = Op.MOD; break;
//             default: throw new RuntimeException("Unknown arithmetic operator");
//         }
//         return new BinOpExpr(op, left, right);
//     }

//     @Override
//     public Expression visitEquality(FeatherweightJavaScriptParser.EqualityContext ctx) {
//         Expression left = visit(ctx.expr(0));
//         Expression right = visit(ctx.expr(1));
//         Op op;
//         switch (ctx.op.getType()) {
//             case FeatherweightJavaScriptParser.SAME: op = Op.EQ; break;
//             case FeatherweightJavaScriptParser.BIGGER: op = Op.GT; break;
//             case FeatherweightJavaScriptParser.BIGOREQL: op = Op.GE; break;
//             case FeatherweightJavaScriptParser.SMALLER: op = Op.LT; break;
//             case FeatherweightJavaScriptParser.SMALLOREQL: op = Op.LE; break;
//             default: throw new RuntimeException("Unknown comparison operator");
//         }
//         return new BinOpExpr(op, left, right);
//     }

//     @Override
//     public Expression visitFunctionDec(FeatherweightJavaScriptParser.FunctionDecContext ctx) {
//         List<String> params = new ArrayList<>();
//         if (ctx.ID() != null) {
//             for (TerminalNode idNode : ctx.ID()) {
//                 params.add(idNode.getText());
//             }
//         }
//         Expression body = visit(ctx.block());
//         return new FunctionDeclExpr(params, body);
//     }

//     @Override
//     public Expression visitFunctionApp(FeatherweightJavaScriptParser.FunctionAppContext ctx) {
//         Expression func = visit(ctx.expr(0)); 
//         List<Expression> args = new ArrayList<>();
//         for (int i = 1; i < ctx.expr().size(); i++) {
//             args.add(visit(ctx.expr(i)));
//         }
//         return new FunctionAppExpr(func, args);
//     }

//     @Override
//     public Expression visitInt(FeatherweightJavaScriptParser.IntContext ctx) {
//         int val = Integer.parseInt(ctx.INT().getText());
//         return new ValueExpr(new IntVal(val));
//     }

//     @Override
//     public Expression visitBool(FeatherweightJavaScriptParser.BoolContext ctx) {
//         return new ValueExpr(new BoolVal(ctx.BOOL().getText().equals("true")));
//     }

//     @Override
//     public Expression visitNull(FeatherweightJavaScriptParser.NullContext ctx) {
//         return new ValueExpr(new NullVal());
//     }

//     @Override
//     public Expression visitParens(FeatherweightJavaScriptParser.ParensContext ctx) {
//         return visit(ctx.expr());
//     }

//     @Override
//     public Expression visitId(FeatherweightJavaScriptParser.IdContext ctx) {
//         return new VarExpr(ctx.ID().getText());
//     }

//     @Override
//     public Expression visitEmpty(FeatherweightJavaScriptParser.EmptyContext ctx) {
//         return new ValueExpr(new NullVal());
//     }

//     /**
//      * Helper to convert a list of expressions into nested SeqExprs.
//      */
//     private Expression listToSeqExp(List<Expression> stmts) {
//         if (stmts.isEmpty()) return new ValueExpr(new NullVal());
//         Expression exp = stmts.get(0);
//         for (int i = 1; i < stmts.size(); i++) {
//             exp = new SeqExpr(exp, stmts.get(i));
//         }
//         return exp;
//     }
// }
