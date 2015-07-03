// Generated from ./src/main/java/com/metadave/kash/parser/Kash.g4 by ANTLR 4.5
package com.metadave.kash.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KashParser extends Parser {
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
	public static final int
		RULE_stmts = 0, RULE_connect_stmt = 1, RULE_hostport = 2, RULE_create_topic = 3, 
		RULE_describe_topic = 4, RULE_keyvalues = 5, RULE_keyvalue = 6, RULE_valuetype = 7, 
		RULE_string_value = 8;
	public static final String[] ruleNames = {
		"stmts", "connect_stmt", "hostport", "create_topic", "describe_topic", 
		"keyvalues", "keyvalue", "valuetype", "string_value"
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

	@Override
	public String getGrammarFileName() { return "Kash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KashParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StmtsContext extends ParserRuleContext {
		public Connect_stmtContext connect_stmt() {
			return getRuleContext(Connect_stmtContext.class,0);
		}
		public Create_topicContext create_topic() {
			return getRuleContext(Create_topicContext.class,0);
		}
		public Describe_topicContext describe_topic() {
			return getRuleContext(Describe_topicContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmts);
		try {
			setState(21);
			switch (_input.LA(1)) {
			case CONNECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				connect_stmt();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				create_topic();
				}
				break;
			case DESCRIBE:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				describe_topic();
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

	public static class Connect_stmtContext extends ParserRuleContext {
		public HostportContext hostport;
		public List<HostportContext> hps = new ArrayList<HostportContext>();
		public TerminalNode CONNECT() { return getToken(KashParser.CONNECT, 0); }
		public TerminalNode SEMI() { return getToken(KashParser.SEMI, 0); }
		public HostportContext hostport() {
			return getRuleContext(HostportContext.class,0);
		}
		public Connect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterConnect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitConnect_stmt(this);
		}
	}

	public final Connect_stmtContext connect_stmt() throws RecognitionException {
		Connect_stmtContext _localctx = new Connect_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_connect_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(CONNECT);
			setState(24);
			((Connect_stmtContext)_localctx).hostport = hostport();
			((Connect_stmtContext)_localctx).hps.add(((Connect_stmtContext)_localctx).hostport);
			setState(25);
			match(SEMI);
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

	public static class HostportContext extends ParserRuleContext {
		public Token host;
		public Token port;
		public TerminalNode ID() { return getToken(KashParser.ID, 0); }
		public TerminalNode INT() { return getToken(KashParser.INT, 0); }
		public HostportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterHostport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitHostport(this);
		}
	}

	public final HostportContext hostport() throws RecognitionException {
		HostportContext _localctx = new HostportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hostport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((HostportContext)_localctx).host = match(ID);
			setState(28);
			match(T__0);
			setState(29);
			((HostportContext)_localctx).port = match(INT);
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

	public static class Create_topicContext extends ParserRuleContext {
		public String_valueContext topicname;
		public TerminalNode CREATE() { return getToken(KashParser.CREATE, 0); }
		public TerminalNode TOPIC() { return getToken(KashParser.TOPIC, 0); }
		public TerminalNode WITH() { return getToken(KashParser.WITH, 0); }
		public KeyvaluesContext keyvalues() {
			return getRuleContext(KeyvaluesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KashParser.SEMI, 0); }
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Create_topicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_topic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterCreate_topic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitCreate_topic(this);
		}
	}

	public final Create_topicContext create_topic() throws RecognitionException {
		Create_topicContext _localctx = new Create_topicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create_topic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(CREATE);
			setState(32);
			match(TOPIC);
			setState(33);
			((Create_topicContext)_localctx).topicname = string_value();
			setState(34);
			match(WITH);
			setState(35);
			keyvalues();
			setState(36);
			match(SEMI);
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

	public static class Describe_topicContext extends ParserRuleContext {
		public String_valueContext topicname;
		public TerminalNode DESCRIBE() { return getToken(KashParser.DESCRIBE, 0); }
		public TerminalNode TOPIC() { return getToken(KashParser.TOPIC, 0); }
		public TerminalNode SEMI() { return getToken(KashParser.SEMI, 0); }
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Describe_topicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_topic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterDescribe_topic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitDescribe_topic(this);
		}
	}

	public final Describe_topicContext describe_topic() throws RecognitionException {
		Describe_topicContext _localctx = new Describe_topicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_describe_topic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(DESCRIBE);
			setState(39);
			match(TOPIC);
			setState(40);
			((Describe_topicContext)_localctx).topicname = string_value();
			setState(41);
			match(SEMI);
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

	public static class KeyvaluesContext extends ParserRuleContext {
		public KeyvalueContext keyvalue;
		public List<KeyvalueContext> kvs = new ArrayList<KeyvalueContext>();
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(KashParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(KashParser.AND, i);
		}
		public KeyvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterKeyvalues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitKeyvalues(this);
		}
	}

	public final KeyvaluesContext keyvalues() throws RecognitionException {
		KeyvaluesContext _localctx = new KeyvaluesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_keyvalues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((KeyvaluesContext)_localctx).keyvalue = keyvalue();
			((KeyvaluesContext)_localctx).kvs.add(((KeyvaluesContext)_localctx).keyvalue);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(44);
				match(AND);
				setState(45);
				((KeyvaluesContext)_localctx).keyvalue = keyvalue();
				((KeyvaluesContext)_localctx).kvs.add(((KeyvaluesContext)_localctx).keyvalue);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class KeyvalueContext extends ParserRuleContext {
		public Token keyname;
		public ValuetypeContext thevalue;
		public TerminalNode EQUALS() { return getToken(KashParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(KashParser.ID, 0); }
		public ValuetypeContext valuetype() {
			return getRuleContext(ValuetypeContext.class,0);
		}
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterKeyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitKeyvalue(this);
		}
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_keyvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((KeyvalueContext)_localctx).keyname = match(ID);
			setState(52);
			match(EQUALS);
			setState(53);
			((KeyvalueContext)_localctx).thevalue = valuetype();
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

	public static class ValuetypeContext extends ParserRuleContext {
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public TerminalNode INT() { return getToken(KashParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KashParser.FLOAT, 0); }
		public ValuetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterValuetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitValuetype(this);
		}
	}

	public final ValuetypeContext valuetype() throws RecognitionException {
		ValuetypeContext _localctx = new ValuetypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valuetype);
		try {
			setState(58);
			switch (_input.LA(1)) {
			case DOUBLE_STRING:
			case SINGLE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				string_value();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(FLOAT);
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

	public static class String_valueContext extends ParserRuleContext {
		public TerminalNode SINGLE_STRING() { return getToken(KashParser.SINGLE_STRING, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(KashParser.DOUBLE_STRING, 0); }
		public String_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).enterString_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KashListener ) ((KashListener)listener).exitString_value(this);
		}
	}

	public final String_valueContext string_value() throws RecognitionException {
		String_valueContext _localctx = new String_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_STRING || _la==SINGLE_STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 A\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\5"+
		"\2\30\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\5\t=\n\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2"+
		"\3\3\2\32\33<\2\27\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\b!\3\2\2\2\n(\3\2"+
		"\2\2\f-\3\2\2\2\16\65\3\2\2\2\20<\3\2\2\2\22>\3\2\2\2\24\30\5\4\3\2\25"+
		"\30\5\b\5\2\26\30\5\n\6\2\27\24\3\2\2\2\27\25\3\2\2\2\27\26\3\2\2\2\30"+
		"\3\3\2\2\2\31\32\7\4\2\2\32\33\5\6\4\2\33\34\7\26\2\2\34\5\3\2\2\2\35"+
		"\36\7\27\2\2\36\37\7\3\2\2\37 \7\30\2\2 \7\3\2\2\2!\"\7\5\2\2\"#\7\6\2"+
		"\2#$\5\22\n\2$%\7\b\2\2%&\5\f\7\2&\'\7\26\2\2\'\t\3\2\2\2()\7\7\2\2)*"+
		"\7\6\2\2*+\5\22\n\2+,\7\26\2\2,\13\3\2\2\2-\62\5\16\b\2./\7\t\2\2/\61"+
		"\5\16\b\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\r\3"+
		"\2\2\2\64\62\3\2\2\2\65\66\7\27\2\2\66\67\7\24\2\2\678\5\20\t\28\17\3"+
		"\2\2\29=\5\22\n\2:=\7\30\2\2;=\7\31\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2"+
		"=\21\3\2\2\2>?\t\2\2\2?\23\3\2\2\2\5\27\62<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}