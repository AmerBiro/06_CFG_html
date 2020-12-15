// Generated from html.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class htmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, OPEN=13, CLOSE=14, KEY=15, TEXT=16, NOTALLOWED=17;
	public static final int
		RULE_start = 0, RULE_html = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "html"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<html>'", "'</html>'", "'<head>'", "'</head>'", "'<title>'", 
			"'</title>'", "'<body>'", "'</body>'", "'<h1>'", "'</h1>'", "'<a>'", 
			"'</a>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "OPEN", "CLOSE", "KEY", "TEXT", "NOTALLOWED"
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
	public String getGrammarFileName() { return "html.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public htmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode EOF() { return getToken(htmlParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlListener ) ((htmlListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlListener ) ((htmlListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htmlVisitor ) return ((htmlVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			html();
			setState(5);
			match(EOF);
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

	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(htmlParser.TEXT, 0); }
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlListener ) ((htmlListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlListener ) ((htmlListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htmlVisitor ) return ((htmlVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_html);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(TEXT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				match(T__0);
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << TEXT))) != 0)) {
					{
					{
					setState(9);
					html();
					}
					}
					setState(14);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(15);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(T__2);
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << TEXT))) != 0)) {
					{
					{
					setState(17);
					html();
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(23);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				match(T__4);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << TEXT))) != 0)) {
					{
					{
					setState(25);
					html();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(31);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(T__6);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << TEXT))) != 0)) {
					{
					{
					setState(33);
					html();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(T__8);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << TEXT))) != 0)) {
					{
					{
					setState(41);
					html();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				match(T__10);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << TEXT))) != 0)) {
					{
					{
					setState(49);
					html();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__11);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23=\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\7\3\r\n\3\f\3\16\3\20\13\3\3\3\3\3\3\3\7\3"+
		"\25\n\3\f\3\16\3\30\13\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3"+
		"\3\3\7\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3"+
		"\3\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\5\3;\n\3\3\3\2\2\4\2\4\2\2\2F\2"+
		"\6\3\2\2\2\4:\3\2\2\2\6\7\5\4\3\2\7\b\7\2\2\3\b\3\3\2\2\2\t;\7\22\2\2"+
		"\n\16\7\3\2\2\13\r\5\4\3\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17"+
		"\3\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21;\7\4\2\2\22\26\7\5\2\2\23\25\5"+
		"\4\3\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3"+
		"\2\2\2\30\26\3\2\2\2\31;\7\6\2\2\32\36\7\7\2\2\33\35\5\4\3\2\34\33\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!"+
		";\7\b\2\2\"&\7\t\2\2#%\5\4\3\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2"+
		"\2\')\3\2\2\2(&\3\2\2\2);\7\n\2\2*.\7\13\2\2+-\5\4\3\2,+\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61;\7\f\2\2\62\66\7"+
		"\r\2\2\63\65\5\4\3\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\679\3\2\2\28\66\3\2\2\29;\7\16\2\2:\t\3\2\2\2:\n\3\2\2\2:\22\3\2"+
		"\2\2:\32\3\2\2\2:\"\3\2\2\2:*\3\2\2\2:\62\3\2\2\2;\5\3\2\2\2\t\16\26\36"+
		"&.\66:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}