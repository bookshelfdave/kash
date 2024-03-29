// Generated from ./src/main/java/com/metadave/kash/parser/Kash.g4 by ANTLR 4.5
package com.metadave.kash.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KashLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CONNECT=2, CREATE=3, TOPIC=4, DESCRIBE=5, WITH=6, AND=7, OR=8, 
		NOT=9, AT=10, DOLLAR=11, SPLAT=12, COMMA=13, LSQUARE=14, RSQUARE=15, LPAREN=16, 
		RPAREN=17, EQUALS=18, DOT=19, SEMI=20, ID=21, INT=22, FLOAT=23, DOUBLE_STRING=24, 
		SINGLE_STRING=25, DATA_CONTENT=26, LINE_COMMENT=27, COMMENT=28, WS=29, 
		WSCHARS=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "CONNECT", "CREATE", "TOPIC", "DESCRIBE", "WITH", "AND", "OR", 
		"NOT", "AT", "DOLLAR", "SPLAT", "COMMA", "LSQUARE", "RSQUARE", "LPAREN", 
		"RPAREN", "EQUALS", "DOT", "SEMI", "ID", "LOWER", "UPPER", "INT", "DIGIT", 
		"FLOAT", "DOUBLE_STRING", "ESC", "SINGLE_STRING", "SESC", "DATA_CONTENT", 
		"DATA_ESC", "LINE_COMMENT", "COMMENT", "WS", "WSCHARS", "Zs", "Cc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'connect'", "'create'", "'topic'", "'describe'", "'with'", 
		"'and'", "'or'", "'not'", "'@'", "'$'", "'*'", "','", "'['", "']'", "'('", 
		"')'", "'='", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "CONNECT", "CREATE", "TOPIC", "DESCRIBE", "WITH", "AND", "OR", 
		"NOT", "AT", "DOLLAR", "SPLAT", "COMMA", "LSQUARE", "RSQUARE", "LPAREN", 
		"RPAREN", "EQUALS", "DOT", "SEMI", "ID", "INT", "FLOAT", "DOUBLE_STRING", 
		"SINGLE_STRING", "DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS", "WSCHARS"
	};
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


	public KashLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u0124\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u009b\n\26\f\26\16\26\u009e\13\26\3\27\3\27\3"+
		"\30\3\30\3\31\6\31\u00a5\n\31\r\31\16\31\u00a6\3\32\3\32\3\33\6\33\u00ac"+
		"\n\33\r\33\16\33\u00ad\3\33\3\33\7\33\u00b2\n\33\f\33\16\33\u00b5\13\33"+
		"\3\33\3\33\6\33\u00b9\n\33\r\33\16\33\u00ba\5\33\u00bd\n\33\3\34\3\34"+
		"\3\34\7\34\u00c2\n\34\f\34\16\34\u00c5\13\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\5\35\u00cd\n\35\3\36\3\36\3\36\7\36\u00d2\n\36\f\36\16\36\u00d5"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u00dd\n\37\3 \3 \3 \3 \3 \3"+
		" \7 \u00e5\n \f \16 \u00e8\13 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!"+
		"\u00f6\n!\3\"\3\"\3\"\3\"\7\"\u00fc\n\"\f\"\16\"\u00ff\13\"\3\"\5\"\u0102"+
		"\n\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u010c\n#\f#\16#\u010f\13#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\6$\u0119\n$\r$\16$\u011a\3$\3$\3%\3%\3&\3&\3\'\3\'\7"+
		"\u00c3\u00d3\u00e6\u00fd\u010d\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61"+
		"\30\63\2\65\31\67\329\2;\33=\2?\34A\2C\35E\36G\37I K\2M\2\3\2\6\4\2/\60"+
		"aa\5\2\13\f\17\17\"\"\t\2\"\"\u00a2\u00a2\u1682\u1682\u2002\u200c\u2031"+
		"\u2031\u2061\u2061\u3002\u3002\4\2\2!\u0081\u00a1\u0133\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\2;\3\2\2\2\2?\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\3O\3\2\2\2\5Q\3\2\2\2\7Y\3\2\2\2\t`\3\2\2\2\13f\3\2\2\2\ro\3\2\2\2\17"+
		"t\3\2\2\2\21x\3\2\2\2\23{\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31\u0083"+
		"\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37\u0089\3\2\2\2!\u008b\3\2"+
		"\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0091\3\2\2\2)\u0093\3\2\2\2+\u0095"+
		"\3\2\2\2-\u009f\3\2\2\2/\u00a1\3\2\2\2\61\u00a4\3\2\2\2\63\u00a8\3\2\2"+
		"\2\65\u00bc\3\2\2\2\67\u00be\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00dc"+
		"\3\2\2\2?\u00de\3\2\2\2A\u00f5\3\2\2\2C\u00f7\3\2\2\2E\u0107\3\2\2\2G"+
		"\u0118\3\2\2\2I\u011e\3\2\2\2K\u0120\3\2\2\2M\u0122\3\2\2\2OP\7<\2\2P"+
		"\4\3\2\2\2QR\7e\2\2RS\7q\2\2ST\7p\2\2TU\7p\2\2UV\7g\2\2VW\7e\2\2WX\7v"+
		"\2\2X\6\3\2\2\2YZ\7e\2\2Z[\7t\2\2[\\\7g\2\2\\]\7c\2\2]^\7v\2\2^_\7g\2"+
		"\2_\b\3\2\2\2`a\7v\2\2ab\7q\2\2bc\7r\2\2cd\7k\2\2de\7e\2\2e\n\3\2\2\2"+
		"fg\7f\2\2gh\7g\2\2hi\7u\2\2ij\7e\2\2jk\7t\2\2kl\7k\2\2lm\7d\2\2mn\7g\2"+
		"\2n\f\3\2\2\2op\7y\2\2pq\7k\2\2qr\7v\2\2rs\7j\2\2s\16\3\2\2\2tu\7c\2\2"+
		"uv\7p\2\2vw\7f\2\2w\20\3\2\2\2xy\7q\2\2yz\7t\2\2z\22\3\2\2\2{|\7p\2\2"+
		"|}\7q\2\2}~\7v\2\2~\24\3\2\2\2\177\u0080\7B\2\2\u0080\26\3\2\2\2\u0081"+
		"\u0082\7&\2\2\u0082\30\3\2\2\2\u0083\u0084\7,\2\2\u0084\32\3\2\2\2\u0085"+
		"\u0086\7.\2\2\u0086\34\3\2\2\2\u0087\u0088\7]\2\2\u0088\36\3\2\2\2\u0089"+
		"\u008a\7_\2\2\u008a \3\2\2\2\u008b\u008c\7*\2\2\u008c\"\3\2\2\2\u008d"+
		"\u008e\7+\2\2\u008e$\3\2\2\2\u008f\u0090\7?\2\2\u0090&\3\2\2\2\u0091\u0092"+
		"\7\60\2\2\u0092(\3\2\2\2\u0093\u0094\7=\2\2\u0094*\3\2\2\2\u0095\u009c"+
		"\5-\27\2\u0096\u009b\5/\30\2\u0097\u009b\5-\27\2\u0098\u009b\5\63\32\2"+
		"\u0099\u009b\t\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d,\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\4c|\2\u00a0"+
		".\3\2\2\2\u00a1\u00a2\4C\\\2\u00a2\60\3\2\2\2\u00a3\u00a5\5\63\32\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\4\62;\2\u00a9\64\3\2\2\2\u00aa\u00ac"+
		"\5\63\32\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b3\5\'\24\2\u00b0\u00b2"+
		"\5\63\32\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00bd\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8"+
		"\5\'\24\2\u00b7\u00b9\5\63\32\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ab"+
		"\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bd\66\3\2\2\2\u00be\u00c3\7$\2\2\u00bf"+
		"\u00c2\59\35\2\u00c0\u00c2\13\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7$\2\2\u00c78\3\2\2\2\u00c8"+
		"\u00c9\7^\2\2\u00c9\u00cd\7$\2\2\u00ca\u00cb\7^\2\2\u00cb\u00cd\7^\2\2"+
		"\u00cc\u00c8\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd:\3\2\2\2\u00ce\u00d3\7"+
		")\2\2\u00cf\u00d2\5=\37\2\u00d0\u00d2\13\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7)\2\2\u00d7"+
		"<\3\2\2\2\u00d8\u00d9\7^\2\2\u00d9\u00dd\7)\2\2\u00da\u00db\7^\2\2\u00db"+
		"\u00dd\7^\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd>\3\2\2\2\u00de"+
		"\u00df\7\u0080\2\2\u00df\u00e0\7\'\2\2\u00e0\u00e1\7\u0080\2\2\u00e1\u00e6"+
		"\3\2\2\2\u00e2\u00e5\5A!\2\u00e3\u00e5\13\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\u0080\2\2\u00ea"+
		"\u00eb\7\'\2\2\u00eb\u00ec\7\u0080\2\2\u00ec@\3\2\2\2\u00ed\u00ee\7^\2"+
		"\2\u00ee\u00ef\7\u0080\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00f6\7\u0080\2\2"+
		"\u00f1\u00f2\7^\2\2\u00f2\u00f3\7\u0080\2\2\u00f3\u00f4\7\'\2\2\u00f4"+
		"\u00f6\7\u0080\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6B\3\2"+
		"\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fd\3\2\2\2\u00fa"+
		"\u00fc\13\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0102\7\17\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0104\7\f\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\"\2\2\u0106"+
		"D\3\2\2\2\u0107\u0108\7\61\2\2\u0108\u0109\7,\2\2\u0109\u010d\3\2\2\2"+
		"\u010a\u010c\13\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\7,\2\2\u0111\u0112\7\61\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b#"+
		"\2\2\u0114F\3\2\2\2\u0115\u0119\5I%\2\u0116\u0119\5K&\2\u0117\u0119\5"+
		"M\'\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\b$\3\2\u011dH\3\2\2\2\u011e\u011f\t\3\2\2\u011fJ\3\2"+
		"\2\2\u0120\u0121\t\4\2\2\u0121L\3\2\2\2\u0122\u0123\t\5\2\2\u0123N\3\2"+
		"\2\2\30\2\u009a\u009c\u00a6\u00ad\u00b3\u00ba\u00bc\u00c1\u00c3\u00cc"+
		"\u00d1\u00d3\u00dc\u00e4\u00e6\u00f5\u00fd\u0101\u010d\u0118\u011a\4\b"+
		"\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}