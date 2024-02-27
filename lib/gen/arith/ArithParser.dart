// Generated from arith/ArithParser.g4 by ANTLR 4.13.1
// ignore_for_file: unused_import, unused_local_variable, prefer_single_quotes
import 'package:antlr4/antlr4.dart';

import 'ArithParserListener.dart';
import 'ArithParserBaseListener.dart';
const int RULE_start_Exp2 = 0, RULE_start_Exp1 = 1, RULE_start_Exp = 2, 
          RULE_exp2 = 3, RULE_exp1 = 4, RULE_exp = 5;
class ArithParser extends Parser {
  static final checkVersion = () => RuntimeMetaData.checkVersion('4.13.1', RuntimeMetaData.VERSION);
  static const int TOKEN_EOF = IntStream.EOF;

  static final List<DFA> _decisionToDFA = List.generate(
      _ATN.numberOfDecisions, (i) => DFA(_ATN.getDecisionState(i), i));
  static final PredictionContextCache _sharedContextCache = PredictionContextCache();
  static const int TOKEN_Surrogate_id_SYMB_0 = 1, TOKEN_Surrogate_id_SYMB_1 = 2, 
                   TOKEN_Surrogate_id_SYMB_2 = 3, TOKEN_Surrogate_id_SYMB_3 = 4, 
                   TOKEN_Surrogate_id_SYMB_4 = 5, TOKEN_Surrogate_id_SYMB_5 = 6, 
                   TOKEN_DOUBLE = 7, TOKEN_INTEGER = 8, TOKEN_WS = 9, TOKEN_ErrorToken = 10;

  @override
  final List<String> ruleNames = [
    'start_Exp2', 'start_Exp1', 'start_Exp', 'exp2', 'exp1', 'exp'
  ];

  static final List<String?> _LITERAL_NAMES = [
      null, "'*'", "'/'", "'+'", "'-'", "'('", "')'"
  ];
  static final List<String?> _SYMBOLIC_NAMES = [
      null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1", "Surrogate_id_SYMB_2", 
      "Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "Surrogate_id_SYMB_5", 
      "DOUBLE", "INTEGER", "WS", "ErrorToken"
  ];
  static final Vocabulary VOCABULARY = VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  @override
  Vocabulary get vocabulary {
    return VOCABULARY;
  }

  @override
  String get grammarFileName => 'ArithParser.g4';

  @override
  List<int> get serializedATN => _serializedATN;

  @override
  ATN getATN() {
   return _ATN;
  }

  ArithParser(TokenStream input) : super(input) {
    interpreter = ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  Start_Exp2Context start_Exp2() {
    dynamic _localctx = Start_Exp2Context(context, state);
    enterRule(_localctx, 0, RULE_start_Exp2);
    try {
      enterOuterAlt(_localctx, 1);
      state = 12;
      exp2();
      state = 13;
      match(TOKEN_EOF);
    } on RecognitionException catch (re) {
      _localctx.exception = re;
      errorHandler.reportError(this, re);
      errorHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  Start_Exp1Context start_Exp1() {
    dynamic _localctx = Start_Exp1Context(context, state);
    enterRule(_localctx, 2, RULE_start_Exp1);
    try {
      enterOuterAlt(_localctx, 1);
      state = 15;
      exp1(0);
      state = 16;
      match(TOKEN_EOF);
    } on RecognitionException catch (re) {
      _localctx.exception = re;
      errorHandler.reportError(this, re);
      errorHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  Start_ExpContext start_Exp() {
    dynamic _localctx = Start_ExpContext(context, state);
    enterRule(_localctx, 4, RULE_start_Exp);
    try {
      enterOuterAlt(_localctx, 1);
      state = 18;
      exp(0);
      state = 19;
      match(TOKEN_EOF);
    } on RecognitionException catch (re) {
      _localctx.exception = re;
      errorHandler.reportError(this, re);
      errorHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  Exp2Context exp2() {
    dynamic _localctx = Exp2Context(context, state);
    enterRule(_localctx, 6, RULE_exp2);
    try {
      state = 27;
      errorHandler.sync(this);
      switch (tokenStream.LA(1)!) {
      case TOKEN_INTEGER:
        _localctx = ConstIntegerContext(_localctx);
        enterOuterAlt(_localctx, 1);
        state = 21;
        _localctx.p_1_1 = match(TOKEN_INTEGER);
        break;
      case TOKEN_DOUBLE:
        _localctx = ConstDoubleContext(_localctx);
        enterOuterAlt(_localctx, 2);
        state = 22;
        _localctx.p_2_1 = match(TOKEN_DOUBLE);
        break;
      case TOKEN_Surrogate_id_SYMB_4:
        _localctx = BracketsContext(_localctx);
        enterOuterAlt(_localctx, 3);
        state = 23;
        match(TOKEN_Surrogate_id_SYMB_4);
        state = 24;
        _localctx.p_3_2 = exp(0);
        state = 25;
        match(TOKEN_Surrogate_id_SYMB_5);
        break;
      default:
        throw NoViableAltException(this);
      }
    } on RecognitionException catch (re) {
      _localctx.exception = re;
      errorHandler.reportError(this, re);
      errorHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  Exp1Context exp1([int _p = 0]) {
    final _parentctx = context;
    final _parentState = state;
    dynamic _localctx = Exp1Context(context, _parentState);
    var _prevctx = _localctx;
    var _startState = 8;
    enterRecursionRule(_localctx, 8, RULE_exp1, _p);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      _localctx = Coercion_Exp1_3Context(_localctx);
      context = _localctx;
      _prevctx = _localctx;

      state = 30;
      _localctx.p_3_1 = exp2();
      context!.stop = tokenStream.LT(-1);
      state = 40;
      errorHandler.sync(this);
      _alt = interpreter!.adaptivePredict(tokenStream, 2, context);
      while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
        if (_alt == 1) {
          if (parseListeners != null) triggerExitRuleEvent();
          _prevctx = _localctx;
          state = 38;
          errorHandler.sync(this);
          switch (interpreter!.adaptivePredict(tokenStream, 1, context)) {
          case 1:
            _localctx = MulContext(new Exp1Context(_parentctx, _parentState));
            _localctx.p_1_1 = _prevctx;
            pushNewRecursionContext(_localctx, _startState, RULE_exp1);
            state = 32;
            if (!(precpred(context, 3))) {
              throw FailedPredicateException(this, "precpred(context, 3)");
            }
            state = 33;
            match(TOKEN_Surrogate_id_SYMB_0);
            state = 34;
            _localctx.p_1_3 = exp2();
            break;
          case 2:
            _localctx = DivContext(new Exp1Context(_parentctx, _parentState));
            _localctx.p_2_1 = _prevctx;
            pushNewRecursionContext(_localctx, _startState, RULE_exp1);
            state = 35;
            if (!(precpred(context, 2))) {
              throw FailedPredicateException(this, "precpred(context, 2)");
            }
            state = 36;
            match(TOKEN_Surrogate_id_SYMB_1);
            state = 37;
            _localctx.p_2_3 = exp2();
            break;
          } 
        }
        state = 42;
        errorHandler.sync(this);
        _alt = interpreter!.adaptivePredict(tokenStream, 2, context);
      }
    } on RecognitionException catch (re) {
      _localctx.exception = re;
      errorHandler.reportError(this, re);
      errorHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  ExpContext exp([int _p = 0]) {
    final _parentctx = context;
    final _parentState = state;
    dynamic _localctx = ExpContext(context, _parentState);
    var _prevctx = _localctx;
    var _startState = 10;
    enterRecursionRule(_localctx, 10, RULE_exp, _p);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      _localctx = Coercion_Exp_3Context(_localctx);
      context = _localctx;
      _prevctx = _localctx;

      state = 44;
      _localctx.p_3_1 = exp1(0);
      context!.stop = tokenStream.LT(-1);
      state = 54;
      errorHandler.sync(this);
      _alt = interpreter!.adaptivePredict(tokenStream, 4, context);
      while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
        if (_alt == 1) {
          if (parseListeners != null) triggerExitRuleEvent();
          _prevctx = _localctx;
          state = 52;
          errorHandler.sync(this);
          switch (interpreter!.adaptivePredict(tokenStream, 3, context)) {
          case 1:
            _localctx = SumContext(new ExpContext(_parentctx, _parentState));
            _localctx.p_1_1 = _prevctx;
            pushNewRecursionContext(_localctx, _startState, RULE_exp);
            state = 46;
            if (!(precpred(context, 3))) {
              throw FailedPredicateException(this, "precpred(context, 3)");
            }
            state = 47;
            match(TOKEN_Surrogate_id_SYMB_2);
            state = 48;
            _localctx.p_1_3 = exp1(0);
            break;
          case 2:
            _localctx = SubContext(new ExpContext(_parentctx, _parentState));
            _localctx.p_2_1 = _prevctx;
            pushNewRecursionContext(_localctx, _startState, RULE_exp);
            state = 49;
            if (!(precpred(context, 2))) {
              throw FailedPredicateException(this, "precpred(context, 2)");
            }
            state = 50;
            match(TOKEN_Surrogate_id_SYMB_3);
            state = 51;
            _localctx.p_2_3 = exp1(0);
            break;
          } 
        }
        state = 56;
        errorHandler.sync(this);
        _alt = interpreter!.adaptivePredict(tokenStream, 4, context);
      }
    } on RecognitionException catch (re) {
      _localctx.exception = re;
      errorHandler.reportError(this, re);
      errorHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  @override
  bool sempred(RuleContext? _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
    case 4:
      return _exp1_sempred(_localctx as Exp1Context?, predIndex);
    case 5:
      return _exp_sempred(_localctx as ExpContext?, predIndex);
    }
    return true;
  }
  bool _exp1_sempred(dynamic _localctx, int predIndex) {
    switch (predIndex) {
      case 0: return precpred(context, 3);
      case 1: return precpred(context, 2);
    }
    return true;
  }
  bool _exp_sempred(dynamic _localctx, int predIndex) {
    switch (predIndex) {
      case 2: return precpred(context, 3);
      case 3: return precpred(context, 2);
    }
    return true;
  }

  static const List<int> _serializedATN = [
      4,1,10,58,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,1,0,
      1,0,1,1,1,1,1,1,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,3,3,28,8,3,1,4,
      1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,5,4,39,8,4,10,4,12,4,42,9,4,1,5,1,
      5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,5,5,53,8,5,10,5,12,5,56,9,5,1,5,0,2,
      8,10,6,0,2,4,6,8,10,0,0,57,0,12,1,0,0,0,2,15,1,0,0,0,4,18,1,0,0,0,
      6,27,1,0,0,0,8,29,1,0,0,0,10,43,1,0,0,0,12,13,3,6,3,0,13,14,5,0,0,
      1,14,1,1,0,0,0,15,16,3,8,4,0,16,17,5,0,0,1,17,3,1,0,0,0,18,19,3,10,
      5,0,19,20,5,0,0,1,20,5,1,0,0,0,21,28,5,8,0,0,22,28,5,7,0,0,23,24,5,
      5,0,0,24,25,3,10,5,0,25,26,5,6,0,0,26,28,1,0,0,0,27,21,1,0,0,0,27,
      22,1,0,0,0,27,23,1,0,0,0,28,7,1,0,0,0,29,30,6,4,-1,0,30,31,3,6,3,0,
      31,40,1,0,0,0,32,33,10,3,0,0,33,34,5,1,0,0,34,39,3,6,3,0,35,36,10,
      2,0,0,36,37,5,2,0,0,37,39,3,6,3,0,38,32,1,0,0,0,38,35,1,0,0,0,39,42,
      1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,9,1,0,0,0,42,40,1,0,0,0,43,
      44,6,5,-1,0,44,45,3,8,4,0,45,54,1,0,0,0,46,47,10,3,0,0,47,48,5,3,0,
      0,48,53,3,8,4,0,49,50,10,2,0,0,50,51,5,4,0,0,51,53,3,8,4,0,52,46,1,
      0,0,0,52,49,1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,0,54,55,1,0,0,0,55,11,
      1,0,0,0,56,54,1,0,0,0,5,27,38,40,52,54
  ];

  static final ATN _ATN =
      ATNDeserializer().deserialize(_serializedATN);
}
class Start_Exp2Context extends ParserRuleContext {
  Exp2Context? exp2() => getRuleContext<Exp2Context>(0);
  TerminalNode? EOF() => getToken(ArithParser.TOKEN_EOF, 0);
  Start_Exp2Context([ParserRuleContext? parent, int? invokingState]) : super(parent, invokingState);
  @override
  int get ruleIndex => RULE_start_Exp2;
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterStart_Exp2(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitStart_Exp2(this);
  }
}

class Start_Exp1Context extends ParserRuleContext {
  Exp1Context? exp1() => getRuleContext<Exp1Context>(0);
  TerminalNode? EOF() => getToken(ArithParser.TOKEN_EOF, 0);
  Start_Exp1Context([ParserRuleContext? parent, int? invokingState]) : super(parent, invokingState);
  @override
  int get ruleIndex => RULE_start_Exp1;
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterStart_Exp1(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitStart_Exp1(this);
  }
}

class Start_ExpContext extends ParserRuleContext {
  ExpContext? exp() => getRuleContext<ExpContext>(0);
  TerminalNode? EOF() => getToken(ArithParser.TOKEN_EOF, 0);
  Start_ExpContext([ParserRuleContext? parent, int? invokingState]) : super(parent, invokingState);
  @override
  int get ruleIndex => RULE_start_Exp;
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterStart_Exp(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitStart_Exp(this);
  }
}

class Exp2Context extends ParserRuleContext {
  Exp2Context([ParserRuleContext? parent, int? invokingState]) : super(parent, invokingState);
  @override
  int get ruleIndex => RULE_exp2;
 
  @override
  void copyFrom(ParserRuleContext ctx) {
    super.copyFrom(ctx);
  }
}

class Exp1Context extends ParserRuleContext {
  Exp1Context([ParserRuleContext? parent, int? invokingState]) : super(parent, invokingState);
  @override
  int get ruleIndex => RULE_exp1;
 
  @override
  void copyFrom(ParserRuleContext ctx) {
    super.copyFrom(ctx);
  }
}

class ExpContext extends ParserRuleContext {
  ExpContext([ParserRuleContext? parent, int? invokingState]) : super(parent, invokingState);
  @override
  int get ruleIndex => RULE_exp;
 
  @override
  void copyFrom(ParserRuleContext ctx) {
    super.copyFrom(ctx);
  }
}

class ConstIntegerContext extends Exp2Context {
  Token? p_1_1;
  TerminalNode? INTEGER() => getToken(ArithParser.TOKEN_INTEGER, 0);
  ConstIntegerContext(Exp2Context ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterConstInteger(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitConstInteger(this);
  }
}

class ConstDoubleContext extends Exp2Context {
  Token? p_2_1;
  TerminalNode? DOUBLE() => getToken(ArithParser.TOKEN_DOUBLE, 0);
  ConstDoubleContext(Exp2Context ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterConstDouble(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitConstDouble(this);
  }
}

class BracketsContext extends Exp2Context {
  ExpContext? p_3_2;
  TerminalNode? Surrogate_id_SYMB_4() => getToken(ArithParser.TOKEN_Surrogate_id_SYMB_4, 0);
  TerminalNode? Surrogate_id_SYMB_5() => getToken(ArithParser.TOKEN_Surrogate_id_SYMB_5, 0);
  ExpContext? exp() => getRuleContext<ExpContext>(0);
  BracketsContext(Exp2Context ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterBrackets(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitBrackets(this);
  }
}class DivContext extends Exp1Context {
  Exp1Context? p_2_1;
  Exp2Context? p_2_3;
  TerminalNode? Surrogate_id_SYMB_1() => getToken(ArithParser.TOKEN_Surrogate_id_SYMB_1, 0);
  Exp1Context? exp1() => getRuleContext<Exp1Context>(0);
  Exp2Context? exp2() => getRuleContext<Exp2Context>(0);
  DivContext(Exp1Context ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterDiv(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitDiv(this);
  }
}

class MulContext extends Exp1Context {
  Exp1Context? p_1_1;
  Exp2Context? p_1_3;
  TerminalNode? Surrogate_id_SYMB_0() => getToken(ArithParser.TOKEN_Surrogate_id_SYMB_0, 0);
  Exp1Context? exp1() => getRuleContext<Exp1Context>(0);
  Exp2Context? exp2() => getRuleContext<Exp2Context>(0);
  MulContext(Exp1Context ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterMul(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitMul(this);
  }
}

class Coercion_Exp1_3Context extends Exp1Context {
  Exp2Context? p_3_1;
  Exp2Context? exp2() => getRuleContext<Exp2Context>(0);
  Coercion_Exp1_3Context(Exp1Context ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterCoercion_Exp1_3(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitCoercion_Exp1_3(this);
  }
}class SubContext extends ExpContext {
  ExpContext? p_2_1;
  Exp1Context? p_2_3;
  TerminalNode? Surrogate_id_SYMB_3() => getToken(ArithParser.TOKEN_Surrogate_id_SYMB_3, 0);
  ExpContext? exp() => getRuleContext<ExpContext>(0);
  Exp1Context? exp1() => getRuleContext<Exp1Context>(0);
  SubContext(ExpContext ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterSub(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitSub(this);
  }
}

class Coercion_Exp_3Context extends ExpContext {
  Exp1Context? p_3_1;
  Exp1Context? exp1() => getRuleContext<Exp1Context>(0);
  Coercion_Exp_3Context(ExpContext ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterCoercion_Exp_3(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitCoercion_Exp_3(this);
  }
}

class SumContext extends ExpContext {
  ExpContext? p_1_1;
  Exp1Context? p_1_3;
  TerminalNode? Surrogate_id_SYMB_2() => getToken(ArithParser.TOKEN_Surrogate_id_SYMB_2, 0);
  ExpContext? exp() => getRuleContext<ExpContext>(0);
  Exp1Context? exp1() => getRuleContext<Exp1Context>(0);
  SumContext(ExpContext ctx) { copyFrom(ctx); }
  @override
  void enterRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.enterSum(this);
  }
  @override
  void exitRule(ParseTreeListener listener) {
    if (listener is ArithParserListener) listener.exitSum(this);
  }
}