// Generated from /Users/phch/Documents/Featherweight-JavaScripts_FWJS/FeatherweightJavaScript.g4 by ANTLR 4.13.1
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FeatherweightJavaScriptParser}.
 */
public interface FeatherweightJavaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FeatherweightJavaScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FeatherweightJavaScriptParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FeatherweightJavaScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FeatherweightJavaScriptParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bareExpr}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bareExpr}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThen}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(FeatherweightJavaScriptParser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThen}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(FeatherweightJavaScriptParser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(FeatherweightJavaScriptParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(FeatherweightJavaScriptParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FeatherweightJavaScriptParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FeatherweightJavaScriptParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(FeatherweightJavaScriptParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(FeatherweightJavaScriptParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDec}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(FeatherweightJavaScriptParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDec}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(FeatherweightJavaScriptParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDec}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDec(FeatherweightJavaScriptParser.FunctionDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDec}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDec(FeatherweightJavaScriptParser.FunctionDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(FeatherweightJavaScriptParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(FeatherweightJavaScriptParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionApp}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApp(FeatherweightJavaScriptParser.FunctionAppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionApp}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApp(FeatherweightJavaScriptParser.FunctionAppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(FeatherweightJavaScriptParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(FeatherweightJavaScriptParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNull(FeatherweightJavaScriptParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNull(FeatherweightJavaScriptParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(FeatherweightJavaScriptParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(FeatherweightJavaScriptParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(FeatherweightJavaScriptParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(FeatherweightJavaScriptParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality(FeatherweightJavaScriptParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality(FeatherweightJavaScriptParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(FeatherweightJavaScriptParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(FeatherweightJavaScriptParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assiState}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssiState(FeatherweightJavaScriptParser.AssiStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assiState}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssiState(FeatherweightJavaScriptParser.AssiStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpBlock}
	 * labeled alternative in {@link FeatherweightJavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx);
}