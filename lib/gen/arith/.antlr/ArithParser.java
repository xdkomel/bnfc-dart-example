// Generated from /Users/kamil/bnfc-dart-example/lib/gen/arith/ArithParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Surrogate_id_SYMB_0=1, Surrogate_id_SYMB_1=2, Surrogate_id_SYMB_2=3, Surrogate_id_SYMB_3=4, 
		Surrogate_id_SYMB_4=5, DOUBLE=6, INTEGER=7, WS=8, ErrorToken=9;
	public static final int
		RULE_start_Exp2 = 0, RULE_start_Exp1 = 1, RULE_start_Exp = 2, RULE_exp2 = 3, 
		RULE_exp1 = 4, RULE_exp = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_Exp2", "start_Exp1", "start_Exp", "exp2", "exp1", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", "Surrogate_id_SYMB_2", 
			"Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "DOUBLE", "INTEGER", "WS", 
			"ErrorToken"
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
	public String getGrammarFileName() { return "ArithParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_Exp2Context extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode EOF() { return getToken(ArithParser.EOF, 0); }
		public Start_Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterStart_Exp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitStart_Exp2(this);
		}
	}

	public final Start_Exp2Context start_Exp2() throws RecognitionException {
		Start_Exp2Context _localctx = new Start_Exp2Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_Exp2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			exp2();
			setState(13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Start_Exp1Context extends ParserRuleContext {
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode EOF() { return getToken(ArithParser.EOF, 0); }
		public Start_Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterStart_Exp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitStart_Exp1(this);
		}
	}

	public final Start_Exp1Context start_Exp1() throws RecognitionException {
		Start_Exp1Context _localctx = new Start_Exp1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_Exp1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			exp1(0);
			setState(16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Start_ExpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArithParser.EOF, 0); }
		public Start_ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_Exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterStart_Exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitStart_Exp(this);
		}
	}

	public final Start_ExpContext start_Exp() throws RecognitionException {
		Start_ExpContext _localctx = new Start_ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start_Exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			exp(0);
			setState(19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp2Context extends ParserRuleContext {
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
	 
		public Exp2Context() { }
		public void copyFrom(Exp2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstIntegerContext extends Exp2Context {
		public Token p_1_1;
		public TerminalNode INTEGER() { return getToken(ArithParser.INTEGER, 0); }
		public ConstIntegerContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterConstInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitConstInteger(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstDoubleContext extends Exp2Context {
		public Token p_2_1;
		public TerminalNode DOUBLE() { return getToken(ArithParser.DOUBLE, 0); }
		public ConstDoubleContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterConstDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitConstDouble(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketsContext extends Exp2Context {
		public ExpContext p_3_2;
		public TerminalNode Surrogate_id_SYMB_3() { return getToken(ArithParser.Surrogate_id_SYMB_3, 0); }
		public TerminalNode Surrogate_id_SYMB_4() { return getToken(ArithParser.Surrogate_id_SYMB_4, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BracketsContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitBrackets(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp2);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new ConstIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				((ConstIntegerContext)_localctx).p_1_1 = match(INTEGER);
				}
				break;
			case DOUBLE:
				_localctx = new ConstDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				((ConstDoubleContext)_localctx).p_2_1 = match(DOUBLE);
				}
				break;
			case Surrogate_id_SYMB_3:
				_localctx = new BracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				match(Surrogate_id_SYMB_3);
				setState(24);
				((BracketsContext)_localctx).p_3_2 = exp(0);
				setState(25);
				match(Surrogate_id_SYMB_4);
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
	public static class Exp1Context extends ParserRuleContext {
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	 
		public Exp1Context() { }
		public void copyFrom(Exp1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends Exp1Context {
		public Exp1Context p_2_1;
		public Exp2Context p_2_3;
		public TerminalNode Surrogate_id_SYMB_1() { return getToken(ArithParser.Surrogate_id_SYMB_1, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public DivContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends Exp1Context {
		public Exp1Context p_1_1;
		public Exp2Context p_1_3;
		public TerminalNode Surrogate_id_SYMB_0() { return getToken(ArithParser.Surrogate_id_SYMB_0, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public MulContext(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitMul(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Coercion_Exp1_3Context extends Exp1Context {
		public Exp2Context p_3_1;
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Coercion_Exp1_3Context(Exp1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterCoercion_Exp1_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitCoercion_Exp1_3(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		return exp1(0);
	}

	private Exp1Context exp1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp1Context _localctx = new Exp1Context(_ctx, _parentState);
		Exp1Context _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Coercion_Exp1_3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(30);
			((Coercion_Exp1_3Context)_localctx).p_3_1 = exp2();
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new Exp1Context(_parentctx, _parentState));
						((MulContext)_localctx).p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp1);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
						match(Surrogate_id_SYMB_0);
						setState(34);
						((MulContext)_localctx).p_1_3 = exp2();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Exp1Context(_parentctx, _parentState));
						((DivContext)_localctx).p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp1);
						setState(35);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(36);
						match(Surrogate_id_SYMB_1);
						setState(37);
						((DivContext)_localctx).p_2_3 = exp2();
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends ExpContext {
		public ExpContext p_2_1;
		public Exp1Context p_2_3;
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(ArithParser.Surrogate_id_SYMB_2, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public SubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Coercion_Exp_3Context extends ExpContext {
		public Exp1Context p_3_1;
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Coercion_Exp_3Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterCoercion_Exp_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitCoercion_Exp_3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends ExpContext {
		public ExpContext p_1_1;
		public Exp1Context p_1_3;
		public TerminalNode Surrogate_id_SYMB_2() { return getToken(ArithParser.Surrogate_id_SYMB_2, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public SumContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithParserListener ) ((ArithParserListener)listener).exitSum(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Coercion_Exp_3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(44);
			((Coercion_Exp_3Context)_localctx).p_3_1 = exp1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new SumContext(new ExpContext(_parentctx, _parentState));
						((SumContext)_localctx).p_1_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(46);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(47);
						match(Surrogate_id_SYMB_2);
						setState(48);
						((SumContext)_localctx).p_1_3 = exp1(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExpContext(_parentctx, _parentState));
						((SubContext)_localctx).p_2_1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(49);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(50);
						match(Surrogate_id_SYMB_2);
						setState(51);
						((SubContext)_localctx).p_2_3 = exp1(0);
						}
						break;
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		case 4:
			return exp1_sempred((Exp1Context)_localctx, predIndex);
		case 5:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp1_sempred(Exp1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u001c"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\'\b\u0004\n\u0004"+
		"\f\u0004*\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u00055\b"+
		"\u0005\n\u0005\f\u00058\t\u0005\u0001\u0005\u0000\u0002\b\n\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u00009\u0000\f\u0001\u0000\u0000\u0000\u0002"+
		"\u000f\u0001\u0000\u0000\u0000\u0004\u0012\u0001\u0000\u0000\u0000\u0006"+
		"\u001b\u0001\u0000\u0000\u0000\b\u001d\u0001\u0000\u0000\u0000\n+\u0001"+
		"\u0000\u0000\u0000\f\r\u0003\u0006\u0003\u0000\r\u000e\u0005\u0000\u0000"+
		"\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0003\b\u0004\u0000"+
		"\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0003\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0003\n\u0005\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014"+
		"\u0005\u0001\u0000\u0000\u0000\u0015\u001c\u0005\u0007\u0000\u0000\u0016"+
		"\u001c\u0005\u0006\u0000\u0000\u0017\u0018\u0005\u0004\u0000\u0000\u0018"+
		"\u0019\u0003\n\u0005\u0000\u0019\u001a\u0005\u0005\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001b\u0016"+
		"\u0001\u0000\u0000\u0000\u001b\u0017\u0001\u0000\u0000\u0000\u001c\u0007"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0006\u0004\uffff\uffff\u0000\u001e"+
		"\u001f\u0003\u0006\u0003\u0000\u001f(\u0001\u0000\u0000\u0000 !\n\u0003"+
		"\u0000\u0000!\"\u0005\u0001\u0000\u0000\"\'\u0003\u0006\u0003\u0000#$"+
		"\n\u0002\u0000\u0000$%\u0005\u0002\u0000\u0000%\'\u0003\u0006\u0003\u0000"+
		"& \u0001\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\t\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0006\u0005\uffff\uffff\u0000"+
		",-\u0003\b\u0004\u0000-6\u0001\u0000\u0000\u0000./\n\u0003\u0000\u0000"+
		"/0\u0005\u0003\u0000\u000005\u0003\b\u0004\u000012\n\u0002\u0000\u0000"+
		"23\u0005\u0003\u0000\u000035\u0003\b\u0004\u00004.\u0001\u0000\u0000\u0000"+
		"41\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u00007\u000b\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u0000\u0005\u001b&(46";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}