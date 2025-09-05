// Generated from /Users/phch/Documents/Featherweight-JavaScripts_FWJS/FeatherweightJavaScript.g4 by ANTLR 4.13.1
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FeatherweightJavaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, FUNCTION=4, VAR=5, PRINT=6, INT=7, BOOL=8, NULL=9, 
		STRING=10, MUL=11, DIV=12, SEPARATOR=13, ADD=14, SUB=15, MOD=16, BIGGER=17, 
		SMALLER=18, BIGOREQL=19, SMALLOREQL=20, SAME=21, EQL=22, COMMA=23, LPAREN=24, 
		RPAREN=25, LBRACE=26, RBRACE=27, ID=28, NEWLINE=29, LINE_COMMENT=30, WS=31, 
		BLOCK_COMMENT=32;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_block = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'function'", "'var'", "'print'", 
			null, null, "'null'", null, "'*'", "'/'", "';'", "'+'", "'-'", "'%'", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'='", "','", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "FUNCTION", "VAR", "PRINT", "INT", "BOOL", 
			"NULL", "STRING", "MUL", "DIV", "SEPARATOR", "ADD", "SUB", "MOD", "BIGGER", 
			"SMALLER", "BIGOREQL", "SMALLOREQL", "SAME", "EQL", "COMMA", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "ID", "NEWLINE", "LINE_COMMENT", "WS", 
			"BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FeatherweightJavaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FeatherweightJavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 285221882L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(FeatherweightJavaScriptParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(FeatherweightJavaScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FeatherweightJavaScriptParser.RPAREN, 0); }
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenElseContext extends StatContext {
		public TerminalNode IF() { return getToken(FeatherweightJavaScriptParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(FeatherweightJavaScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FeatherweightJavaScriptParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FeatherweightJavaScriptParser.ELSE, 0); }
		public IfThenElseContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitIfThenElse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenContext extends StatContext {
		public TerminalNode IF() { return getToken(FeatherweightJavaScriptParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(FeatherweightJavaScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FeatherweightJavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfThenContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitIfThen(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends StatContext {
		public TerminalNode WHILE() { return getToken(FeatherweightJavaScriptParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(FeatherweightJavaScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FeatherweightJavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitWhile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDecContext extends StatContext {
		public TerminalNode VAR() { return getToken(FeatherweightJavaScriptParser.VAR, 0); }
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public TerminalNode EQL() { return getToken(FeatherweightJavaScriptParser.EQL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public VarDecContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitVarDec(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BareExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public BareExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterBareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitBareExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyContext extends StatContext {
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public EmptyContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitEmpty(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				expr(0);
				setState(14);
				match(SEPARATOR);
				}
				break;
			case 2:
				_localctx = new IfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(IF);
				setState(17);
				match(LPAREN);
				setState(18);
				expr(0);
				setState(19);
				match(RPAREN);
				setState(20);
				block();
				setState(21);
				match(ELSE);
				setState(22);
				block();
				}
				break;
			case 3:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(IF);
				setState(25);
				match(LPAREN);
				setState(26);
				expr(0);
				setState(27);
				match(RPAREN);
				setState(28);
				block();
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				match(WHILE);
				setState(31);
				match(LPAREN);
				setState(32);
				expr(0);
				setState(33);
				match(RPAREN);
				setState(34);
				block();
				}
				break;
			case 5:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				match(PRINT);
				setState(37);
				match(LPAREN);
				setState(38);
				expr(0);
				setState(39);
				match(RPAREN);
				setState(40);
				match(SEPARATOR);
				}
				break;
			case 6:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				match(SEPARATOR);
				}
				break;
			case 7:
				_localctx = new VarDecContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				match(VAR);
				setState(44);
				match(ID);
				setState(45);
				match(EQL);
				setState(46);
				expr(0);
				setState(47);
				match(SEPARATOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDecContext extends ExprContext {
		public TerminalNode FUNCTION() { return getToken(FeatherweightJavaScriptParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(FeatherweightJavaScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FeatherweightJavaScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(FeatherweightJavaScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FeatherweightJavaScriptParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FeatherweightJavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FeatherweightJavaScriptParser.COMMA, i);
		}
		public FunctionDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterFunctionDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitFunctionDec(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(FeatherweightJavaScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(FeatherweightJavaScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FeatherweightJavaScriptParser.MOD, 0); }
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitMulDivMod(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(FeatherweightJavaScriptParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FeatherweightJavaScriptParser.RPAREN, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitParens(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAppContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(FeatherweightJavaScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FeatherweightJavaScriptParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FeatherweightJavaScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FeatherweightJavaScriptParser.COMMA, i);
		}
		public FunctionAppContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterFunctionApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitFunctionApp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(FeatherweightJavaScriptParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitBool(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends ExprContext {
		public TerminalNode NULL() { return getToken(FeatherweightJavaScriptParser.NULL, 0); }
		public NullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitNull(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(FeatherweightJavaScriptParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(FeatherweightJavaScriptParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitAddSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SMALLER() { return getToken(FeatherweightJavaScriptParser.SMALLER, 0); }
		public TerminalNode SMALLOREQL() { return getToken(FeatherweightJavaScriptParser.SMALLOREQL, 0); }
		public TerminalNode BIGGER() { return getToken(FeatherweightJavaScriptParser.BIGGER, 0); }
		public TerminalNode BIGOREQL() { return getToken(FeatherweightJavaScriptParser.BIGOREQL, 0); }
		public TerminalNode SAME() { return getToken(FeatherweightJavaScriptParser.SAME, 0); }
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitEquality(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(FeatherweightJavaScriptParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitInt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssiStateContext extends ExprContext {
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public TerminalNode EQL() { return getToken(FeatherweightJavaScriptParser.EQL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssiStateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterAssiState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitAssiState(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				match(FUNCTION);
				setState(53);
				match(LPAREN);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(54);
					match(ID);
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(55);
						match(COMMA);
						setState(56);
						match(ID);
						}
						}
						setState(61);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(64);
				match(RPAREN);
				setState(65);
				block();
				}
				break;
			case 2:
				{
				_localctx = new AssiStateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(ID);
				setState(67);
				match(EQL);
				setState(68);
				expr(6);
				}
				break;
			case 3:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(BOOL);
				}
				break;
			case 5:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(NULL);
				}
				break;
			case 6:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(LPAREN);
				setState(73);
				expr(0);
				setState(74);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(80);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 71680L) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(83);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(86);
						((EqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) ) {
							((EqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new FunctionAppContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(89);
						match(LPAREN);
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285213584L) != 0)) {
							{
							setState(90);
							expr(0);
							setState(95);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(91);
								match(COMMA);
								setState(92);
								expr(0);
								}
								}
								setState(97);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(100);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullBlockContext extends BlockContext {
		public TerminalNode LBRACE() { return getToken(FeatherweightJavaScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FeatherweightJavaScriptParser.RBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FullBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterFullBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitFullBlock(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpBlockContext extends BlockContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public SimpBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterSimpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitSimpBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new FullBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(LBRACE);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285221882L) != 0)) {
					{
					{
					setState(107);
					stat();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(RBRACE);
				}
				break;
			case IF:
			case WHILE:
			case FUNCTION:
			case VAR:
			case PRINT:
			case INT:
			case BOOL:
			case NULL:
			case SEPARATOR:
			case LPAREN:
			case ID:
				_localctx = new SimpBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 v\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b\u0000"+
		"\u000b\u0000\f\u0000\u000b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002:\b\u0002"+
		"\n\u0002\f\u0002=\t\u0002\u0003\u0002?\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"N\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002^\b\u0002\n\u0002\f\u0002"+
		"a\t\u0002\u0003\u0002c\b\u0002\u0001\u0002\u0005\u0002f\b\u0002\n\u0002"+
		"\f\u0002i\t\u0002\u0001\u0003\u0001\u0003\u0005\u0003m\b\u0003\n\u0003"+
		"\f\u0003p\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0003"+
		"\u0000\u0001\u0004\u0004\u0000\u0002\u0004\u0006\u0000\u0003\u0002\u0000"+
		"\u000b\f\u0010\u0010\u0001\u0000\u000e\u000f\u0001\u0000\u0011\u0015\u0088"+
		"\u0000\t\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004"+
		"M\u0001\u0000\u0000\u0000\u0006s\u0001\u0000\u0000\u0000\b\n\u0003\u0002"+
		"\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000"+
		"\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u0001"+
		"\u0001\u0000\u0000\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u000f\u0005"+
		"\r\u0000\u0000\u000f2\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0001"+
		"\u0000\u0000\u0011\u0012\u0005\u0018\u0000\u0000\u0012\u0013\u0003\u0004"+
		"\u0002\u0000\u0013\u0014\u0005\u0019\u0000\u0000\u0014\u0015\u0003\u0006"+
		"\u0003\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0003\u0006"+
		"\u0003\u0000\u00172\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0001\u0000"+
		"\u0000\u0019\u001a\u0005\u0018\u0000\u0000\u001a\u001b\u0003\u0004\u0002"+
		"\u0000\u001b\u001c\u0005\u0019\u0000\u0000\u001c\u001d\u0003\u0006\u0003"+
		"\u0000\u001d2\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0003\u0000\u0000"+
		"\u001f \u0005\u0018\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\u0019"+
		"\u0000\u0000\"#\u0003\u0006\u0003\u0000#2\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0006\u0000\u0000%&\u0005\u0018\u0000\u0000&\'\u0003\u0004\u0002\u0000"+
		"\'(\u0005\u0019\u0000\u0000()\u0005\r\u0000\u0000)2\u0001\u0000\u0000"+
		"\u0000*2\u0005\r\u0000\u0000+,\u0005\u0005\u0000\u0000,-\u0005\u001c\u0000"+
		"\u0000-.\u0005\u0016\u0000\u0000./\u0003\u0004\u0002\u0000/0\u0005\r\u0000"+
		"\u000002\u0001\u0000\u0000\u00001\r\u0001\u0000\u0000\u00001\u0010\u0001"+
		"\u0000\u0000\u00001\u0018\u0001\u0000\u0000\u00001\u001e\u0001\u0000\u0000"+
		"\u00001$\u0001\u0000\u0000\u00001*\u0001\u0000\u0000\u00001+\u0001\u0000"+
		"\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0006\u0002\uffff\uffff"+
		"\u000045\u0005\u0004\u0000\u00005>\u0005\u0018\u0000\u00006;\u0005\u001c"+
		"\u0000\u000078\u0005\u0017\u0000\u00008:\u0005\u001c\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>6\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0019\u0000\u0000AN\u0003\u0006\u0003\u0000BC\u0005"+
		"\u001c\u0000\u0000CD\u0005\u0016\u0000\u0000DN\u0003\u0004\u0002\u0006"+
		"EN\u0005\u0007\u0000\u0000FN\u0005\b\u0000\u0000GN\u0005\t\u0000\u0000"+
		"HI\u0005\u0018\u0000\u0000IJ\u0003\u0004\u0002\u0000JK\u0005\u0019\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LN\u0005\u001c\u0000\u0000M3\u0001\u0000"+
		"\u0000\u0000MB\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000MF\u0001"+
		"\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000Ng\u0001\u0000\u0000\u0000OP\n\u000b\u0000\u0000"+
		"PQ\u0007\u0000\u0000\u0000Qf\u0003\u0004\u0002\fRS\n\n\u0000\u0000ST\u0007"+
		"\u0001\u0000\u0000Tf\u0003\u0004\u0002\u000bUV\n\t\u0000\u0000VW\u0007"+
		"\u0002\u0000\u0000Wf\u0003\u0004\u0002\nXY\n\u0007\u0000\u0000Yb\u0005"+
		"\u0018\u0000\u0000Z_\u0003\u0004\u0002\u0000[\\\u0005\u0017\u0000\u0000"+
		"\\^\u0003\u0004\u0002\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bZ\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0005\u0019\u0000\u0000"+
		"eO\u0001\u0000\u0000\u0000eR\u0001\u0000\u0000\u0000eU\u0001\u0000\u0000"+
		"\u0000eX\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0005\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jn\u0005\u001a\u0000\u0000km\u0003\u0002\u0001"+
		"\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qt\u0005\u001b\u0000\u0000rt\u0003\u0002\u0001\u0000"+
		"sj\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0007\u0001\u0000"+
		"\u0000\u0000\u000b\u000b1;>M_begns";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}