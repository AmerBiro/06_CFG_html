// Generated from /mnt/d/OneDrive - Danmarks Tekniske Universitet/DTU/3. semester/#2 Compiler Construction/Lektioner/Exercises/03.02- CFG- html/html/html.g4 by ANTLR 4.8
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
		BEGINTOKEN=1, ENDTOKEN=2, NOTALLOWED=3;
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
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGINTOKEN", "ENDTOKEN", "NOTALLOWED"
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
		public TerminalNode NOTALLOWED() { return getToken(htmlParser.NOTALLOWED, 0); }
		public TerminalNode BEGINTOKEN() { return getToken(htmlParser.BEGINTOKEN, 0); }
		public TerminalNode ENDTOKEN() { return getToken(htmlParser.ENDTOKEN, 0); }
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
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_html);
		int _la;
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTALLOWED:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(NOTALLOWED);
				}
				break;
			case BEGINTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				match(BEGINTOKEN);
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BEGINTOKEN || _la==NOTALLOWED) {
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
				match(ENDTOKEN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\25\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\3\3\3\3\3\7\3\r\n\3\f\3\16\3\20\13\3\3\3\5\3\23\n\3"+
		"\3\3\2\2\4\2\4\2\2\2\24\2\6\3\2\2\2\4\22\3\2\2\2\6\7\5\4\3\2\7\b\7\2\2"+
		"\3\b\3\3\2\2\2\t\23\7\5\2\2\n\16\7\3\2\2\13\r\5\4\3\2\f\13\3\2\2\2\r\20"+
		"\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\23"+
		"\7\4\2\2\22\t\3\2\2\2\22\n\3\2\2\2\23\5\3\2\2\2\4\16\22";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}