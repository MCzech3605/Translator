package kotlintoc;
// Generated from C:/Moje/Notatki/5 semestr/Kompilatory/Translator/src/main/resources/simpleKotlin.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class simpleKotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WHITESPACE=2, COMMENT=3, BLOCKCOMMENT=4, INT=5, FLOAT=6, SSTRING=7, 
		SEMICON=8, DOT=9, COLON=10, COMA=11, TRUE=12, FUN=13, FALSE=14, IMP=15, 
		FOR=16, WHILE=17, IF=18, ELSE=19, TYPE=20, VAR=21, RETURN=22, PACKAGE=23, 
		IN=24, NAME=25, ANNOTATION=26, ARASS=27, ASSIGN=28, ARITHMOP=29, MINUS=30, 
		LOGICOP=31, COMPOP=32, INCRDECR=33, ORBRACKET=34, CRBRACKET=35, OBRACE=36, 
		CBRACE=37;
	public static final int
		RULE_prog = 0, RULE_s = 1, RULE_infile = 2, RULE_fun = 3, RULE_funcall = 4, 
		RULE_body = 5, RULE_var = 6, RULE_args = 7, RULE_launchargs = 8, RULE_launcharg = 9, 
		RULE_imppath = 10, RULE_expr = 11, RULE_loop = 12, RULE_cond = 13, RULE_else = 14, 
		RULE_operation = 15, RULE_boolexpr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "s", "infile", "fun", "funcall", "body", "var", "args", "launchargs", 
			"launcharg", "imppath", "expr", "loop", "cond", "else", "operation", 
			"boolexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "','", 
			"'true'", "'fun'", "'false'", "'import'", "'for'", "'while'", "'if'", 
			"'else'", null, null, "'return'", "'package'", "'in'", null, null, null, 
			"'='", null, "'-'", null, null, null, "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WHITESPACE", "COMMENT", "BLOCKCOMMENT", "INT", "FLOAT", 
			"SSTRING", "SEMICON", "DOT", "COLON", "COMA", "TRUE", "FUN", "FALSE", 
			"IMP", "FOR", "WHILE", "IF", "ELSE", "TYPE", "VAR", "RETURN", "PACKAGE", 
			"IN", "NAME", "ANNOTATION", "ARASS", "ASSIGN", "ARITHMOP", "MINUS", "LOGICOP", 
			"COMPOP", "INCRDECR", "ORBRACKET", "CRBRACKET", "OBRACE", "CBRACE"
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
	public String getGrammarFileName() { return "simpleKotlin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleKotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public TerminalNode PACKAGE() { return getToken(simpleKotlinParser.PACKAGE, 0); }
		public ImppathContext imppath() {
			return getRuleContext(ImppathContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(34);
					match(NEWLINE);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(41);
					match(NEWLINE);
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(PACKAGE);
				setState(48);
				imppath(0);
				setState(49);
				match(NEWLINE);
				setState(50);
				s();
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
	public static class SContext extends ParserRuleContext {
		public List<TerminalNode> IMP() { return getTokens(simpleKotlinParser.IMP); }
		public TerminalNode IMP(int i) {
			return getToken(simpleKotlinParser.IMP, i);
		}
		public List<ImppathContext> imppath() {
			return getRuleContexts(ImppathContext.class);
		}
		public ImppathContext imppath(int i) {
			return getRuleContext(ImppathContext.class,i);
		}
		public List<InfileContext> infile() {
			return getRuleContexts(InfileContext.class);
		}
		public InfileContext infile(int i) {
			return getRuleContext(InfileContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(simpleKotlinParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(simpleKotlinParser.EOF, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMP) {
				{
				{
				setState(54);
				match(IMP);
				setState(55);
				imppath(0);
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					match(NEWLINE);
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				infile();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(67);
						match(NEWLINE);
						}
						}
						setState(70); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					break;
				case 2:
					{
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(72);
						match(NEWLINE);
						}
						}
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(78);
					match(EOF);
					}
					break;
				}
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 69214208L) != 0) );
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
	public static class InfileContext extends ParserRuleContext {
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public InfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterInfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitInfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitInfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfileContext infile() throws RecognitionException {
		InfileContext _localctx = new InfileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_infile);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
			case ANNOTATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				fun();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(simpleKotlinParser.FUN, 0); }
		public TerminalNode NAME() { return getToken(simpleKotlinParser.NAME, 0); }
		public TerminalNode ORBRACKET() { return getToken(simpleKotlinParser.ORBRACKET, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CRBRACKET() { return getToken(simpleKotlinParser.CRBRACKET, 0); }
		public TerminalNode OBRACE() { return getToken(simpleKotlinParser.OBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(simpleKotlinParser.CBRACE, 0); }
		public List<TerminalNode> ANNOTATION() { return getTokens(simpleKotlinParser.ANNOTATION); }
		public TerminalNode ANNOTATION(int i) {
			return getToken(simpleKotlinParser.ANNOTATION, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public TerminalNode COLON() { return getToken(simpleKotlinParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(simpleKotlinParser.TYPE, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fun);
		int _la;
		try {
			int _alt;
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANNOTATION) {
					{
					{
					setState(89);
					match(ANNOTATION);
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(90);
						match(NEWLINE);
						}
						}
						setState(93); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(FUN);
				setState(101);
				match(NAME);
				setState(102);
				match(ORBRACKET);
				setState(103);
				args();
				setState(104);
				match(CRBRACKET);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(105);
					match(NEWLINE);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(OBRACE);
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112);
						match(NEWLINE);
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(118);
				body(0);
				setState(119);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANNOTATION) {
					{
					{
					setState(121);
					match(ANNOTATION);
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(122);
						match(NEWLINE);
						}
						}
						setState(125); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(FUN);
				setState(133);
				match(NAME);
				setState(134);
				match(ORBRACKET);
				setState(135);
				args();
				setState(136);
				match(CRBRACKET);
				setState(137);
				match(COLON);
				setState(138);
				match(TYPE);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(139);
					match(NEWLINE);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(OBRACE);
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(146);
						match(NEWLINE);
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(152);
				body(0);
				setState(153);
				match(CBRACE);
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
	public static class FuncallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(simpleKotlinParser.NAME, 0); }
		public TerminalNode ORBRACKET() { return getToken(simpleKotlinParser.ORBRACKET, 0); }
		public LaunchargsContext launchargs() {
			return getRuleContext(LaunchargsContext.class,0);
		}
		public TerminalNode CRBRACKET() { return getToken(simpleKotlinParser.CRBRACKET, 0); }
		public FuncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterFuncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitFuncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitFuncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(NAME);
			setState(158);
			match(ORBRACKET);
			setState(159);
			launchargs();
			setState(160);
			match(CRBRACKET);
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
	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		return body(0);
	}

	private BodyContext body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BodyContext _localctx = new BodyContext(_ctx, _parentState);
		BodyContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					match(NEWLINE);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_body);
						setState(169);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(170);
						var();
						}
						break;
					case 2:
						{
						_localctx = new BodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_body);
						setState(171);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(173); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(172);
								match(NEWLINE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(175); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new BodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_body);
						setState(177);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(178);
						operation();
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(simpleKotlinParser.VAR, 0); }
		public TerminalNode NAME() { return getToken(simpleKotlinParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(simpleKotlinParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(simpleKotlinParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(simpleKotlinParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		int _la;
		try {
			int _alt;
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(VAR);
				setState(185);
				match(NAME);
				setState(186);
				match(COLON);
				setState(187);
				match(TYPE);
				setState(188);
				match(ASSIGN);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(189);
					match(NEWLINE);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				expr(0);
				setState(197); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(196);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(199); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(VAR);
				setState(202);
				match(NAME);
				setState(203);
				match(COLON);
				setState(204);
				match(TYPE);
				setState(206); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(205);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(208); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(simpleKotlinParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(simpleKotlinParser.NAME, i);
		}
		public List<TerminalNode> COLON() { return getTokens(simpleKotlinParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(simpleKotlinParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(simpleKotlinParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(simpleKotlinParser.TYPE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public List<TerminalNode> COMA() { return getTokens(simpleKotlinParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(simpleKotlinParser.COMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(NAME);
				setState(213);
				match(COLON);
				setState(214);
				match(TYPE);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(215);
					match(NEWLINE);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(221);
					match(COMA);
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(222);
						match(NEWLINE);
						}
						}
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(228);
					match(NAME);
					setState(229);
					match(COLON);
					setState(230);
					match(TYPE);
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(231);
						match(NEWLINE);
						}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NEWLINE:
			case CRBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(242);
					match(NEWLINE);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LaunchargsContext extends ParserRuleContext {
		public List<LaunchargContext> launcharg() {
			return getRuleContexts(LaunchargContext.class);
		}
		public LaunchargContext launcharg(int i) {
			return getRuleContext(LaunchargContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(simpleKotlinParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(simpleKotlinParser.COMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public LaunchargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_launchargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterLaunchargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitLaunchargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitLaunchargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaunchargsContext launchargs() throws RecognitionException {
		LaunchargsContext _localctx = new LaunchargsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_launchargs);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				launcharg();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(251);
					match(COMA);
					setState(252);
					launcharg();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(258);
					match(NEWLINE);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class LaunchargContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public TerminalNode MINUS() { return getToken(simpleKotlinParser.MINUS, 0); }
		public LaunchargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_launcharg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterLauncharg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitLauncharg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitLauncharg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaunchargContext launcharg() throws RecognitionException {
		LaunchargContext _localctx = new LaunchargContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_launcharg);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(266);
					match(NEWLINE);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				expr(0);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(273);
					match(NEWLINE);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(279);
					match(NEWLINE);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(MINUS);
				setState(286);
				expr(0);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(287);
					match(NEWLINE);
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ImppathContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(simpleKotlinParser.NAME, 0); }
		public List<ImppathContext> imppath() {
			return getRuleContexts(ImppathContext.class);
		}
		public ImppathContext imppath(int i) {
			return getRuleContext(ImppathContext.class,i);
		}
		public TerminalNode DOT() { return getToken(simpleKotlinParser.DOT, 0); }
		public ImppathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imppath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterImppath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitImppath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitImppath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImppathContext imppath() throws RecognitionException {
		return imppath(0);
	}

	private ImppathContext imppath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImppathContext _localctx = new ImppathContext(_ctx, _parentState);
		ImppathContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_imppath, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(296);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImppathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_imppath);
					setState(298);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(299);
					match(DOT);
					setState(300);
					imppath(3);
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(simpleKotlinParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(simpleKotlinParser.FLOAT, 0); }
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public TerminalNode ORBRACKET() { return getToken(simpleKotlinParser.ORBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CRBRACKET() { return getToken(simpleKotlinParser.CRBRACKET, 0); }
		public TerminalNode SSTRING() { return getToken(simpleKotlinParser.SSTRING, 0); }
		public TerminalNode NAME() { return getToken(simpleKotlinParser.NAME, 0); }
		public TerminalNode ARITHMOP() { return getToken(simpleKotlinParser.ARITHMOP, 0); }
		public TerminalNode MINUS() { return getToken(simpleKotlinParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(307);
				match(INT);
				}
				break;
			case 2:
				{
				setState(308);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(309);
				funcall();
				}
				break;
			case 4:
				{
				setState(310);
				match(ORBRACKET);
				setState(311);
				expr(0);
				setState(312);
				match(CRBRACKET);
				}
				break;
			case 5:
				{
				setState(314);
				match(SSTRING);
				}
				break;
			case 6:
				{
				setState(315);
				match(NAME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(319);
						match(ARITHMOP);
						setState(320);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(322);
						match(MINUS);
						setState(323);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(simpleKotlinParser.FOR, 0); }
		public TerminalNode ORBRACKET() { return getToken(simpleKotlinParser.ORBRACKET, 0); }
		public TerminalNode NAME() { return getToken(simpleKotlinParser.NAME, 0); }
		public TerminalNode IN() { return getToken(simpleKotlinParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CRBRACKET() { return getToken(simpleKotlinParser.CRBRACKET, 0); }
		public TerminalNode OBRACE() { return getToken(simpleKotlinParser.OBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(simpleKotlinParser.CBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(simpleKotlinParser.WHILE, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(FOR);
				setState(330);
				match(ORBRACKET);
				setState(331);
				match(NAME);
				setState(332);
				match(IN);
				setState(333);
				expr(0);
				setState(334);
				match(CRBRACKET);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(335);
					match(NEWLINE);
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(OBRACE);
				setState(342);
				body(0);
				setState(343);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(FOR);
				setState(346);
				match(ORBRACKET);
				setState(347);
				match(NAME);
				setState(348);
				match(IN);
				setState(349);
				expr(0);
				setState(350);
				match(CRBRACKET);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(351);
					match(NEWLINE);
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
				operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(WHILE);
				setState(360);
				match(ORBRACKET);
				setState(361);
				boolexpr(0);
				setState(362);
				match(CRBRACKET);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(363);
					match(NEWLINE);
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(WHILE);
				setState(372);
				match(ORBRACKET);
				setState(373);
				boolexpr(0);
				setState(374);
				match(CRBRACKET);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(375);
					match(NEWLINE);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				match(OBRACE);
				setState(382);
				body(0);
				setState(383);
				match(CBRACE);
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
	public static class CondContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(simpleKotlinParser.IF, 0); }
		public TerminalNode ORBRACKET() { return getToken(simpleKotlinParser.ORBRACKET, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode CRBRACKET() { return getToken(simpleKotlinParser.CRBRACKET, 0); }
		public TerminalNode OBRACE() { return getToken(simpleKotlinParser.OBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(simpleKotlinParser.CBRACE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cond);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(IF);
				setState(388);
				match(ORBRACKET);
				setState(389);
				boolexpr(0);
				setState(390);
				match(CRBRACKET);
				setState(391);
				match(OBRACE);
				setState(392);
				body(0);
				setState(393);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(IF);
				setState(396);
				match(ORBRACKET);
				setState(397);
				boolexpr(0);
				setState(398);
				match(CRBRACKET);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(399);
					match(NEWLINE);
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				operation();
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(simpleKotlinParser.ELSE, 0); }
		public TerminalNode OBRACE() { return getToken(simpleKotlinParser.OBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(simpleKotlinParser.CBRACE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(ELSE);
				setState(410);
				match(OBRACE);
				setState(411);
				body(0);
				setState(412);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(ELSE);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(415);
					match(NEWLINE);
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(421);
				operation();
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
	public static class OperationContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public TerminalNode INCRDECR() { return getToken(simpleKotlinParser.INCRDECR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(simpleKotlinParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(simpleKotlinParser.ASSIGN, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode ARASS() { return getToken(simpleKotlinParser.ARASS, 0); }
		public TerminalNode RETURN() { return getToken(simpleKotlinParser.RETURN, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operation);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				cond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				cond();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(427);
					match(NEWLINE);
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				else_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				funcall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				match(INCRDECR);
				setState(437);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				expr(0);
				setState(439);
				match(INCRDECR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(441);
				match(NAME);
				setState(442);
				match(ASSIGN);
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(443);
					expr(0);
					}
					break;
				case 2:
					{
					setState(444);
					boolexpr(0);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(447);
				match(NAME);
				setState(448);
				match(ARASS);
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(449);
					expr(0);
					}
					break;
				case 2:
					{
					setState(450);
					boolexpr(0);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
				match(RETURN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(454);
				match(RETURN);
				setState(455);
				expr(0);
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
	public static class BoolexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPOP() { return getToken(simpleKotlinParser.COMPOP, 0); }
		public TerminalNode ORBRACKET() { return getToken(simpleKotlinParser.ORBRACKET, 0); }
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public TerminalNode CRBRACKET() { return getToken(simpleKotlinParser.CRBRACKET, 0); }
		public TerminalNode TRUE() { return getToken(simpleKotlinParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(simpleKotlinParser.FALSE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(simpleKotlinParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(simpleKotlinParser.NEWLINE, i);
		}
		public TerminalNode LOGICOP() { return getToken(simpleKotlinParser.LOGICOP, 0); }
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleKotlinListener ) ((simpleKotlinListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleKotlinVisitor ) return ((simpleKotlinVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_boolexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(459);
				expr(0);
				setState(460);
				match(COMPOP);
				setState(461);
				expr(0);
				}
				break;
			case 2:
				{
				setState(463);
				match(ORBRACKET);
				setState(464);
				boolexpr(0);
				setState(465);
				match(CRBRACKET);
				}
				break;
			case 3:
				{
				setState(467);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(468);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(470); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(469);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(472); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(474);
				boolexpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(486);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(477);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(478);
						match(LOGICOP);
						setState(479);
						boolexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(480);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(482); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(481);
								match(NEWLINE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(484); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return body_sempred((BodyContext)_localctx, predIndex);
		case 10:
			return imppath_sempred((ImppathContext)_localctx, predIndex);
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean body_sempred(BodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean imppath_sempred(ImppathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u01ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000\n\u0000\f\u0000"+
		".\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u00005\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		":\b\u0001\u000b\u0001\f\u0001;\u0005\u0001>\b\u0001\n\u0001\f\u0001A\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001E\b\u0001\u000b\u0001\f\u0001"+
		"F\u0001\u0001\u0005\u0001J\b\u0001\n\u0001\f\u0001M\t\u0001\u0001\u0001"+
		"\u0003\u0001P\b\u0001\u0004\u0001R\b\u0001\u000b\u0001\f\u0001S\u0001"+
		"\u0002\u0001\u0002\u0003\u0002X\b\u0002\u0001\u0003\u0001\u0003\u0004"+
		"\u0003\\\b\u0003\u000b\u0003\f\u0003]\u0005\u0003`\b\u0003\n\u0003\f\u0003"+
		"c\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003k\b\u0003\n\u0003\f\u0003n\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003r\b\u0003\n\u0003\f\u0003u\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003|\b\u0003"+
		"\u000b\u0003\f\u0003}\u0005\u0003\u0080\b\u0003\n\u0003\f\u0003\u0083"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008d\b\u0003\n\u0003\f\u0003"+
		"\u0090\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0094\b\u0003\n\u0003"+
		"\f\u0003\u0097\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u009c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00a5\b\u0005\n\u0005\f\u0005\u00a8"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00ae"+
		"\b\u0005\u000b\u0005\f\u0005\u00af\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00b4\b\u0005\n\u0005\f\u0005\u00b7\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00bf\b\u0006\n"+
		"\u0006\f\u0006\u00c2\t\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00c6"+
		"\b\u0006\u000b\u0006\f\u0006\u00c7\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u00cf\b\u0006\u000b\u0006\f\u0006"+
		"\u00d0\u0003\u0006\u00d3\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00d9\b\u0007\n\u0007\f\u0007\u00dc\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00e0\b\u0007\n\u0007\f\u0007\u00e3\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e9\b\u0007\n"+
		"\u0007\f\u0007\u00ec\t\u0007\u0005\u0007\u00ee\b\u0007\n\u0007\f\u0007"+
		"\u00f1\t\u0007\u0001\u0007\u0005\u0007\u00f4\b\u0007\n\u0007\f\u0007\u00f7"+
		"\t\u0007\u0003\u0007\u00f9\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00fe"+
		"\b\b\n\b\f\b\u0101\t\b\u0001\b\u0005\b\u0104\b\b\n\b\f\b\u0107\t\b\u0003"+
		"\b\u0109\b\b\u0001\t\u0005\t\u010c\b\t\n\t\f\t\u010f\t\t\u0001\t\u0001"+
		"\t\u0005\t\u0113\b\t\n\t\f\t\u0116\t\t\u0001\t\u0005\t\u0119\b\t\n\t\f"+
		"\t\u011c\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u0121\b\t\n\t\f\t\u0124\t"+
		"\t\u0003\t\u0126\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u012e\b\n\n\n\f\n\u0131\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u013d\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0145\b\u000b\n\u000b\f\u000b"+
		"\u0148\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u0151\b\f\n\f\f\f\u0154\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0161\b\f\n"+
		"\f\f\f\u0164\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u016d\b\f\n\f\f\f\u0170\t\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0179\b\f\n\f\f\f\u017c\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0182\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0191\b\r\n\r\f\r\u0194\t\r\u0001\r\u0001\r\u0003\r\u0198\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u01a1\b\u000e\n\u000e\f\u000e\u01a4\t\u000e\u0001\u000e"+
		"\u0003\u000e\u01a7\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u01ad\b\u000f\n\u000f\f\u000f\u01b0\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01be"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01c4"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01c9\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u01d7\b\u0010\u000b\u0010\f\u0010\u01d8\u0001\u0010\u0003"+
		"\u0010\u01dc\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\u01e3\b\u0010\u000b\u0010\f\u0010\u01e4\u0005\u0010"+
		"\u01e7\b\u0010\n\u0010\f\u0010\u01ea\t\u0010\u0001\u0010\u0000\u0004\n"+
		"\u0014\u0016 \u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \u0000\u0000\u022b\u00004\u0001\u0000\u0000"+
		"\u0000\u0002?\u0001\u0000\u0000\u0000\u0004W\u0001\u0000\u0000\u0000\u0006"+
		"\u009b\u0001\u0000\u0000\u0000\b\u009d\u0001\u0000\u0000\u0000\n\u00a2"+
		"\u0001\u0000\u0000\u0000\f\u00d2\u0001\u0000\u0000\u0000\u000e\u00f8\u0001"+
		"\u0000\u0000\u0000\u0010\u0108\u0001\u0000\u0000\u0000\u0012\u0125\u0001"+
		"\u0000\u0000\u0000\u0014\u0127\u0001\u0000\u0000\u0000\u0016\u013c\u0001"+
		"\u0000\u0000\u0000\u0018\u0181\u0001\u0000\u0000\u0000\u001a\u0197\u0001"+
		"\u0000\u0000\u0000\u001c\u01a6\u0001\u0000\u0000\u0000\u001e\u01c8\u0001"+
		"\u0000\u0000\u0000 \u01db\u0001\u0000\u0000\u0000\"$\u0005\u0001\u0000"+
		"\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000(5\u0003\u0002\u0001\u0000)+\u0005\u0001\u0000\u0000"+
		"*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000/0\u0005\u0017\u0000\u000001\u0003\u0014\n\u000012\u0005\u0001"+
		"\u0000\u000023\u0003\u0002\u0001\u000035\u0001\u0000\u0000\u00004%\u0001"+
		"\u0000\u0000\u00004,\u0001\u0000\u0000\u00005\u0001\u0001\u0000\u0000"+
		"\u000067\u0005\u000f\u0000\u000079\u0003\u0014\n\u00008:\u0005\u0001\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=6\u0001"+
		"\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@Q\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BO\u0003\u0004\u0002\u0000CE\u0005\u0001\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GP\u0001\u0000\u0000\u0000HJ\u0005\u0001\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NP\u0005\u0000\u0000\u0001OD\u0001\u0000\u0000\u0000OK\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QB\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000T\u0003\u0001\u0000\u0000\u0000UX\u0003\u0006\u0003\u0000VX\u0003"+
		"\f\u0006\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X\u0005"+
		"\u0001\u0000\u0000\u0000Y[\u0005\u001a\u0000\u0000Z\\\u0005\u0001\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_Y\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000de\u0005\r\u0000\u0000ef\u0005\u0019\u0000\u0000fg\u0005\"\u0000"+
		"\u0000gh\u0003\u000e\u0007\u0000hl\u0005#\u0000\u0000ik\u0005\u0001\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000os\u0005$\u0000\u0000pr\u0005\u0001\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0003\n\u0005\u0000wx\u0005%\u0000\u0000x\u009c\u0001\u0000\u0000"+
		"\u0000y{\u0005\u001a\u0000\u0000z|\u0005\u0001\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007fy\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000"+
		"\u0085\u0086\u0005\u0019\u0000\u0000\u0086\u0087\u0005\"\u0000\u0000\u0087"+
		"\u0088\u0003\u000e\u0007\u0000\u0088\u0089\u0005#\u0000\u0000\u0089\u008a"+
		"\u0005\n\u0000\u0000\u008a\u008e\u0005\u0014\u0000\u0000\u008b\u008d\u0005"+
		"\u0001\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0095\u0005$\u0000\u0000\u0092\u0094\u0005\u0001"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0003\n\u0005\u0000\u0099\u009a\u0005%\u0000"+
		"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009ba\u0001\u0000\u0000\u0000"+
		"\u009b\u0081\u0001\u0000\u0000\u0000\u009c\u0007\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005\u0019\u0000\u0000\u009e\u009f\u0005\"\u0000\u0000\u009f"+
		"\u00a0\u0003\u0010\b\u0000\u00a0\u00a1\u0005#\u0000\u0000\u00a1\t\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a6\u0006\u0005\uffff\uffff\u0000\u00a3\u00a5"+
		"\u0005\u0001\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00b5\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\n\u0004\u0000\u0000\u00aa\u00b4\u0003"+
		"\f\u0006\u0000\u00ab\u00ad\n\u0002\u0000\u0000\u00ac\u00ae\u0005\u0001"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b4\u0001\u0000\u0000\u0000\u00b1\u00b2\n\u0001\u0000"+
		"\u0000\u00b2\u00b4\u0003\u001e\u000f\u0000\u00b3\u00a9\u0001\u0000\u0000"+
		"\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u000b\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0015\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba\u00bb\u0005\n\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0014\u0000\u0000\u00bc\u00c0\u0005\u001c\u0000\u0000"+
		"\u00bd\u00bf\u0005\u0001\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\u0016\u000b\u0000"+
		"\u00c4\u00c6\u0005\u0001\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00d3\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u0015\u0000\u0000\u00ca\u00cb\u0005\u0019\u0000\u0000"+
		"\u00cb\u00cc\u0005\n\u0000\u0000\u00cc\u00ce\u0005\u0014\u0000\u0000\u00cd"+
		"\u00cf\u0005\u0001\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2"+
		"\u00b8\u0001\u0000\u0000\u0000\u00d2\u00c9\u0001\u0000\u0000\u0000\u00d3"+
		"\r\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0019\u0000\u0000\u00d5\u00d6"+
		"\u0005\n\u0000\u0000\u00d6\u00da\u0005\u0014\u0000\u0000\u00d7\u00d9\u0005"+
		"\u0001\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00ef\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e1\u0005\u000b\u0000\u0000\u00de\u00e0\u0005"+
		"\u0001\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\u0019\u0000\u0000\u00e5\u00e6\u0005"+
		"\n\u0000\u0000\u00e6\u00ea\u0005\u0014\u0000\u0000\u00e7\u00e9\u0005\u0001"+
		"\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ed\u00dd\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f9\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f4\u0005\u0001\u0000\u0000\u00f3\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00d4\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f9\u000f\u0001\u0000"+
		"\u0000\u0000\u00fa\u00ff\u0003\u0012\t\u0000\u00fb\u00fc\u0005\u000b\u0000"+
		"\u0000\u00fc\u00fe\u0003\u0012\t\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0109\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0104\u0005\u0001\u0000\u0000"+
		"\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u00fa\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000"+
		"\u0109\u0011\u0001\u0000\u0000\u0000\u010a\u010c\u0005\u0001\u0000\u0000"+
		"\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u0110\u0114\u0003\u0016\u000b\u0000\u0111\u0113\u0005\u0001\u0000\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000"+
		"\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000"+
		"\u0115\u0126\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0005\u0001\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000"+
		"\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000"+
		"\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u001e\u0000\u0000"+
		"\u011e\u0122\u0003\u0016\u000b\u0000\u011f\u0121\u0005\u0001\u0000\u0000"+
		"\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0125\u010d\u0001\u0000\u0000\u0000\u0125\u011a\u0001\u0000\u0000\u0000"+
		"\u0126\u0013\u0001\u0000\u0000\u0000\u0127\u0128\u0006\n\uffff\uffff\u0000"+
		"\u0128\u0129\u0005\u0019\u0000\u0000\u0129\u012f\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\n\u0002\u0000\u0000\u012b\u012c\u0005\t\u0000\u0000\u012c"+
		"\u012e\u0003\u0014\n\u0003\u012d\u012a\u0001\u0000\u0000\u0000\u012e\u0131"+
		"\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130\u0015\u0001\u0000\u0000\u0000\u0131\u012f"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0006\u000b\uffff\uffff\u0000\u0133"+
		"\u013d\u0005\u0005\u0000\u0000\u0134\u013d\u0005\u0006\u0000\u0000\u0135"+
		"\u013d\u0003\b\u0004\u0000\u0136\u0137\u0005\"\u0000\u0000\u0137\u0138"+
		"\u0003\u0016\u000b\u0000\u0138\u0139\u0005#\u0000\u0000\u0139\u013d\u0001"+
		"\u0000\u0000\u0000\u013a\u013d\u0005\u0007\u0000\u0000\u013b\u013d\u0005"+
		"\u0019\u0000\u0000\u013c\u0132\u0001\u0000\u0000\u0000\u013c\u0134\u0001"+
		"\u0000\u0000\u0000\u013c\u0135\u0001\u0000\u0000\u0000\u013c\u0136\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u0146\u0001\u0000\u0000\u0000\u013e\u013f\n\u0005"+
		"\u0000\u0000\u013f\u0140\u0005\u001d\u0000\u0000\u0140\u0145\u0003\u0016"+
		"\u000b\u0006\u0141\u0142\n\u0004\u0000\u0000\u0142\u0143\u0005\u001e\u0000"+
		"\u0000\u0143\u0145\u0003\u0016\u000b\u0005\u0144\u013e\u0001\u0000\u0000"+
		"\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0017\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0005\u0010\u0000\u0000\u014a\u014b\u0005\"\u0000\u0000"+
		"\u014b\u014c\u0005\u0019\u0000\u0000\u014c\u014d\u0005\u0018\u0000\u0000"+
		"\u014d\u014e\u0003\u0016\u000b\u0000\u014e\u0152\u0005#\u0000\u0000\u014f"+
		"\u0151\u0005\u0001\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154"+
		"\u0152\u0001\u0000\u0000\u0000\u0155\u0156\u0005$\u0000\u0000\u0156\u0157"+
		"\u0003\n\u0005\u0000\u0157\u0158\u0005%\u0000\u0000\u0158\u0182\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0005\u0010\u0000\u0000\u015a\u015b\u0005"+
		"\"\u0000\u0000\u015b\u015c\u0005\u0019\u0000\u0000\u015c\u015d\u0005\u0018"+
		"\u0000\u0000\u015d\u015e\u0003\u0016\u000b\u0000\u015e\u0162\u0005#\u0000"+
		"\u0000\u015f\u0161\u0005\u0001\u0000\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0003\u001e\u000f"+
		"\u0000\u0166\u0182\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0011\u0000"+
		"\u0000\u0168\u0169\u0005\"\u0000\u0000\u0169\u016a\u0003 \u0010\u0000"+
		"\u016a\u016e\u0005#\u0000\u0000\u016b\u016d\u0005\u0001\u0000\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0003\u001e\u000f\u0000\u0172\u0182\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0005\u0011\u0000\u0000\u0174\u0175\u0005\"\u0000\u0000\u0175\u0176"+
		"\u0003 \u0010\u0000\u0176\u017a\u0005#\u0000\u0000\u0177\u0179\u0005\u0001"+
		"\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000"+
		"\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005$\u0000\u0000\u017e\u017f\u0003\n\u0005"+
		"\u0000\u017f\u0180\u0005%\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000"+
		"\u0181\u0149\u0001\u0000\u0000\u0000\u0181\u0159\u0001\u0000\u0000\u0000"+
		"\u0181\u0167\u0001\u0000\u0000\u0000\u0181\u0173\u0001\u0000\u0000\u0000"+
		"\u0182\u0019\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u0012\u0000\u0000"+
		"\u0184\u0185\u0005\"\u0000\u0000\u0185\u0186\u0003 \u0010\u0000\u0186"+
		"\u0187\u0005#\u0000\u0000\u0187\u0188\u0005$\u0000\u0000\u0188\u0189\u0003"+
		"\n\u0005\u0000\u0189\u018a\u0005%\u0000\u0000\u018a\u0198\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0005\u0012\u0000\u0000\u018c\u018d\u0005\"\u0000"+
		"\u0000\u018d\u018e\u0003 \u0010\u0000\u018e\u0192\u0005#\u0000\u0000\u018f"+
		"\u0191\u0005\u0001\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194"+
		"\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0003\u001e\u000f\u0000\u0196"+
		"\u0198\u0001\u0000\u0000\u0000\u0197\u0183\u0001\u0000\u0000\u0000\u0197"+
		"\u018b\u0001\u0000\u0000\u0000\u0198\u001b\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0005\u0013\u0000\u0000\u019a\u019b\u0005$\u0000\u0000\u019b\u019c"+
		"\u0003\n\u0005\u0000\u019c\u019d\u0005%\u0000\u0000\u019d\u01a7\u0001"+
		"\u0000\u0000\u0000\u019e\u01a2\u0005\u0013\u0000\u0000\u019f\u01a1\u0005"+
		"\u0001\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a7\u0003\u001e\u000f\u0000\u01a6\u0199\u0001"+
		"\u0000\u0000\u0000\u01a6\u019e\u0001\u0000\u0000\u0000\u01a7\u001d\u0001"+
		"\u0000\u0000\u0000\u01a8\u01c9\u0003\u0018\f\u0000\u01a9\u01c9\u0003\u001a"+
		"\r\u0000\u01aa\u01ae\u0003\u001a\r\u0000\u01ab\u01ad\u0005\u0001\u0000"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0003\u001c\u000e\u0000\u01b2\u01c9\u0001\u0000\u0000"+
		"\u0000\u01b3\u01c9\u0003\b\u0004\u0000\u01b4\u01b5\u0005!\u0000\u0000"+
		"\u01b5\u01c9\u0003\u0016\u000b\u0000\u01b6\u01b7\u0003\u0016\u000b\u0000"+
		"\u01b7\u01b8\u0005!\u0000\u0000\u01b8\u01c9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0005\u0019\u0000\u0000\u01ba\u01bd\u0005\u001c\u0000\u0000\u01bb"+
		"\u01be\u0003\u0016\u000b\u0000\u01bc\u01be\u0003 \u0010\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c9"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u0019\u0000\u0000\u01c0\u01c3"+
		"\u0005\u001b\u0000\u0000\u01c1\u01c4\u0003\u0016\u000b\u0000\u01c2\u01c4"+
		"\u0003 \u0010\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c9\u0001\u0000\u0000\u0000\u01c5\u01c9\u0005"+
		"\u0016\u0000\u0000\u01c6\u01c7\u0005\u0016\u0000\u0000\u01c7\u01c9\u0003"+
		"\u0016\u000b\u0000\u01c8\u01a8\u0001\u0000\u0000\u0000\u01c8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01c8\u01aa\u0001\u0000\u0000\u0000\u01c8\u01b3\u0001"+
		"\u0000\u0000\u0000\u01c8\u01b4\u0001\u0000\u0000\u0000\u01c8\u01b6\u0001"+
		"\u0000\u0000\u0000\u01c8\u01b9\u0001\u0000\u0000\u0000\u01c8\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c9\u001f\u0001\u0000\u0000\u0000\u01ca\u01cb\u0006"+
		"\u0010\uffff\uffff\u0000\u01cb\u01cc\u0003\u0016\u000b\u0000\u01cc\u01cd"+
		"\u0005 \u0000\u0000\u01cd\u01ce\u0003\u0016\u000b\u0000\u01ce\u01dc\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0005\"\u0000\u0000\u01d0\u01d1\u0003 "+
		"\u0010\u0000\u01d1\u01d2\u0005#\u0000\u0000\u01d2\u01dc\u0001\u0000\u0000"+
		"\u0000\u01d3\u01dc\u0005\f\u0000\u0000\u01d4\u01dc\u0005\u000e\u0000\u0000"+
		"\u01d5\u01d7\u0005\u0001\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000"+
		"\u01da\u01dc\u0003 \u0010\u0001\u01db\u01ca\u0001\u0000\u0000\u0000\u01db"+
		"\u01cf\u0001\u0000\u0000\u0000\u01db\u01d3\u0001\u0000\u0000\u0000\u01db"+
		"\u01d4\u0001\u0000\u0000\u0000\u01db\u01d6\u0001\u0000\u0000\u0000\u01dc"+
		"\u01e8\u0001\u0000\u0000\u0000\u01dd\u01de\n\u0005\u0000\u0000\u01de\u01df"+
		"\u0005\u001f\u0000\u0000\u01df\u01e7\u0003 \u0010\u0006\u01e0\u01e2\n"+
		"\u0002\u0000\u0000\u01e1\u01e3\u0005\u0001\u0000\u0000\u01e2\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e6\u01dd\u0001\u0000\u0000\u0000\u01e6\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9!\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000?%,4;?FKOSW]als}\u0081"+
		"\u008e\u0095\u009b\u00a6\u00af\u00b3\u00b5\u00c0\u00c7\u00d0\u00d2\u00da"+
		"\u00e1\u00ea\u00ef\u00f5\u00f8\u00ff\u0105\u0108\u010d\u0114\u011a\u0122"+
		"\u0125\u012f\u013c\u0144\u0146\u0152\u0162\u016e\u017a\u0181\u0192\u0197"+
		"\u01a2\u01a6\u01ae\u01bd\u01c3\u01c8\u01d8\u01db\u01e4\u01e6\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}