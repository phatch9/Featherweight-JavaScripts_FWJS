// Generated from FeatherweightJavaScript.g4 by ANTLR 4.13.2
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FeatherweightJavaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, FUNCTION=4, VAR=5, PRINT=6, INT=7, BOOL=8, NULL=9, 
		MUL=10, DIV=11, SEPARATOR=12, ADD=13, SUB=14, MOD=15, BIGGER=16, SMALLER=17, 
		BIGOREQL=18, SMALLOREQL=19, SAME=20, EQL=21, COMMA=22, LPAREN=23, RPAREN=24, 
		LBRACE=25, RBRACE=26, ID=27, NEWLINE=28, LINE_COMMENT=29, WS=30, BLOCK_COMMENT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHILE", "FUNCTION", "VAR", "PRINT", "INT", "BOOL", "NULL", 
			"MUL", "DIV", "SEPARATOR", "ADD", "SUB", "MOD", "BIGGER", "SMALLER", 
			"BIGOREQL", "SMALLOREQL", "SAME", "EQL", "COMMA", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "ID", "NEWLINE", "LINE_COMMENT", "WS", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'function'", "'var'", "'print'", 
			null, null, "'null'", "'*'", "'/'", "';'", "'+'", "'-'", "'%'", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'='", "','", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "FUNCTION", "VAR", "PRINT", "INT", "BOOL", 
			"NULL", "MUL", "DIV", "SEPARATOR", "ADD", "SUB", "MOD", "BIGGER", "SMALLER", 
			"BIGOREQL", "SMALLOREQL", "SAME", "EQL", "COMMA", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "ID", "NEWLINE", "LINE_COMMENT", "WS", "BLOCK_COMMENT"
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


	public FeatherweightJavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FeatherweightJavaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u00ce\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006c\b\u0006\n\u0006\f\u0006f\t\u0006\u0001\u0006"+
		"\u0003\u0006i\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"t\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u00a2"+
		"\b\u001a\n\u001a\f\u001a\u00a5\t\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u00a9\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00b3\b\u001c\n\u001c"+
		"\f\u001c\u00b6\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d"+
		"\u00bb\b\u001d\u000b\u001d\f\u001d\u00bc\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u00c5\b\u001e\n"+
		"\u001e\f\u001e\u00c8\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u00c6\u0000\u001f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u0006\u0001\u000019\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\n\n\r\r\u0002\u0000"+
		"\t\t  \u00d5\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003"+
		"B\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000\u0007M\u0001"+
		"\u0000\u0000\u0000\tV\u0001\u0000\u0000\u0000\u000bZ\u0001\u0000\u0000"+
		"\u0000\rh\u0001\u0000\u0000\u0000\u000fs\u0001\u0000\u0000\u0000\u0011"+
		"u\u0001\u0000\u0000\u0000\u0013z\u0001\u0000\u0000\u0000\u0015|\u0001"+
		"\u0000\u0000\u0000\u0017~\u0001\u0000\u0000\u0000\u0019\u0080\u0001\u0000"+
		"\u0000\u0000\u001b\u0082\u0001\u0000\u0000\u0000\u001d\u0084\u0001\u0000"+
		"\u0000\u0000\u001f\u0086\u0001\u0000\u0000\u0000!\u0088\u0001\u0000\u0000"+
		"\u0000#\u008a\u0001\u0000\u0000\u0000%\u008d\u0001\u0000\u0000\u0000\'"+
		"\u0090\u0001\u0000\u0000\u0000)\u0093\u0001\u0000\u0000\u0000+\u0095\u0001"+
		"\u0000\u0000\u0000-\u0097\u0001\u0000\u0000\u0000/\u0099\u0001\u0000\u0000"+
		"\u00001\u009b\u0001\u0000\u0000\u00003\u009d\u0001\u0000\u0000\u00005"+
		"\u009f\u0001\u0000\u0000\u00007\u00a8\u0001\u0000\u0000\u00009\u00ae\u0001"+
		"\u0000\u0000\u0000;\u00ba\u0001\u0000\u0000\u0000=\u00c0\u0001\u0000\u0000"+
		"\u0000?@\u0005i\u0000\u0000@A\u0005f\u0000\u0000A\u0002\u0001\u0000\u0000"+
		"\u0000BC\u0005e\u0000\u0000CD\u0005l\u0000\u0000DE\u0005s\u0000\u0000"+
		"EF\u0005e\u0000\u0000F\u0004\u0001\u0000\u0000\u0000GH\u0005w\u0000\u0000"+
		"HI\u0005h\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005l\u0000\u0000KL\u0005"+
		"e\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005f\u0000\u0000NO\u0005"+
		"u\u0000\u0000OP\u0005n\u0000\u0000PQ\u0005c\u0000\u0000QR\u0005t\u0000"+
		"\u0000RS\u0005i\u0000\u0000ST\u0005o\u0000\u0000TU\u0005n\u0000\u0000"+
		"U\b\u0001\u0000\u0000\u0000VW\u0005v\u0000\u0000WX\u0005a\u0000\u0000"+
		"XY\u0005r\u0000\u0000Y\n\u0001\u0000\u0000\u0000Z[\u0005p\u0000\u0000"+
		"[\\\u0005r\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005n\u0000\u0000^_\u0005"+
		"t\u0000\u0000_\f\u0001\u0000\u0000\u0000`d\u0007\u0000\u0000\u0000ac\u0007"+
		"\u0001\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ei\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gi\u00050\u0000\u0000h`\u0001\u0000\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000i\u000e\u0001\u0000\u0000\u0000jk\u0005"+
		"t\u0000\u0000kl\u0005r\u0000\u0000lm\u0005u\u0000\u0000mt\u0005e\u0000"+
		"\u0000no\u0005f\u0000\u0000op\u0005a\u0000\u0000pq\u0005l\u0000\u0000"+
		"qr\u0005s\u0000\u0000rt\u0005e\u0000\u0000sj\u0001\u0000\u0000\u0000s"+
		"n\u0001\u0000\u0000\u0000t\u0010\u0001\u0000\u0000\u0000uv\u0005n\u0000"+
		"\u0000vw\u0005u\u0000\u0000wx\u0005l\u0000\u0000xy\u0005l\u0000\u0000"+
		"y\u0012\u0001\u0000\u0000\u0000z{\u0005*\u0000\u0000{\u0014\u0001\u0000"+
		"\u0000\u0000|}\u0005/\u0000\u0000}\u0016\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005;\u0000\u0000\u007f\u0018\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"+\u0000\u0000\u0081\u001a\u0001\u0000\u0000\u0000\u0082\u0083\u0005-\u0000"+
		"\u0000\u0083\u001c\u0001\u0000\u0000\u0000\u0084\u0085\u0005%\u0000\u0000"+
		"\u0085\u001e\u0001\u0000\u0000\u0000\u0086\u0087\u0005>\u0000\u0000\u0087"+
		" \u0001\u0000\u0000\u0000\u0088\u0089\u0005<\u0000\u0000\u0089\"\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005>\u0000\u0000\u008b\u008c\u0005=\u0000"+
		"\u0000\u008c$\u0001\u0000\u0000\u0000\u008d\u008e\u0005<\u0000\u0000\u008e"+
		"\u008f\u0005=\u0000\u0000\u008f&\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"=\u0000\u0000\u0091\u0092\u0005=\u0000\u0000\u0092(\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005=\u0000\u0000\u0094*\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005,\u0000\u0000\u0096,\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"(\u0000\u0000\u0098.\u0001\u0000\u0000\u0000\u0099\u009a\u0005)\u0000"+
		"\u0000\u009a0\u0001\u0000\u0000\u0000\u009b\u009c\u0005{\u0000\u0000\u009c"+
		"2\u0001\u0000\u0000\u0000\u009d\u009e\u0005}\u0000\u0000\u009e4\u0001"+
		"\u0000\u0000\u0000\u009f\u00a3\u0007\u0002\u0000\u0000\u00a0\u00a2\u0007"+
		"\u0003\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a46\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\r\u0000\u0000\u00a7\u00a9\u0005\n\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\n\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u001b\u0000\u0000"+
		"\u00ad8\u0001\u0000\u0000\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af\u00b0"+
		"\u0005/\u0000\u0000\u00b0\u00b4\u0001\u0000\u0000\u0000\u00b1\u00b3\b"+
		"\u0004\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0006\u001c\u0000\u0000\u00b8:\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0007\u0005\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0006\u001d\u0000\u0000\u00bf<\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005/\u0000\u0000\u00c1\u00c2\u0005*\u0000\u0000\u00c2"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c3\u00c5\t\u0000\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005*\u0000\u0000\u00ca\u00cb\u0005/\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0006\u001e\u0000\u0000\u00cd>\u0001\u0000\u0000"+
		"\u0000\t\u0000dhs\u00a3\u00a8\u00b4\u00bc\u00c6\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}