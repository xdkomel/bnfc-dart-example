// Generated from arith/ArithLexer.g4 by ANTLR 4.13.1
// ignore_for_file: unused_import, unused_local_variable, prefer_single_quotes
import 'package:antlr4/antlr4.dart';


class ArithLexer extends Lexer {
  static final checkVersion = () => RuntimeMetaData.checkVersion('4.13.1', RuntimeMetaData.VERSION);

  static final List<DFA> _decisionToDFA = List.generate(
        _ATN.numberOfDecisions, (i) => DFA(_ATN.getDecisionState(i), i));
  static final PredictionContextCache _sharedContextCache = PredictionContextCache();
  static const int
    TOKEN_Surrogate_id_SYMB_0 = 1, TOKEN_Surrogate_id_SYMB_1 = 2, TOKEN_Surrogate_id_SYMB_2 = 3, 
    TOKEN_Surrogate_id_SYMB_3 = 4, TOKEN_Surrogate_id_SYMB_4 = 5, TOKEN_Surrogate_id_SYMB_5 = 6, 
    TOKEN_DOUBLE = 7, TOKEN_INTEGER = 8, TOKEN_WS = 9, TOKEN_ErrorToken = 10;
  @override
  final List<String> channelNames = [
    'DEFAULT_TOKEN_CHANNEL', 'HIDDEN'
  ];

  @override
  final List<String> modeNames = [
    'DEFAULT_MODE'
  ];

  @override
  final List<String> ruleNames = [
    'LETTER', 'CAPITAL', 'SMALL', 'DIGIT', 'Surrogate_id_SYMB_0', 'Surrogate_id_SYMB_1', 
    'Surrogate_id_SYMB_2', 'Surrogate_id_SYMB_3', 'Surrogate_id_SYMB_4', 
    'Surrogate_id_SYMB_5', 'DOUBLE', 'INTEGER', 'WS', 'Escapable', 'ErrorToken'
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


  ArithLexer(CharStream input) : super(input) {
    interpreter = LexerATNSimulator(_ATN, _decisionToDFA, _sharedContextCache, recog: this);
  }

  @override
  List<int> get serializedATN => _serializedATN;

  @override
  String get grammarFileName => 'ArithLexer.g4';

  @override
  ATN getATN() { return _ATN; }

  static const List<int> _serializedATN = [
      4,0,10,91,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,
      7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
      2,14,7,14,1,0,1,0,3,0,34,8,0,1,1,1,1,1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,
      5,1,6,1,6,1,7,1,7,1,8,1,8,1,9,1,9,1,10,4,10,55,8,10,11,10,12,10,56,
      1,10,1,10,4,10,61,8,10,11,10,12,10,62,1,10,1,10,3,10,67,8,10,1,10,
      4,10,70,8,10,11,10,12,10,71,3,10,74,8,10,1,11,4,11,77,8,11,11,11,12,
      11,78,1,12,4,12,82,8,12,11,12,12,12,83,1,12,1,12,1,13,1,13,1,14,1,
      14,0,0,15,1,0,3,0,5,0,7,0,9,1,11,2,13,3,15,4,17,5,19,6,21,7,23,8,25,
      9,27,0,29,10,1,0,5,3,0,65,90,192,214,216,222,3,0,97,122,223,246,248,
      255,1,0,48,57,3,0,9,10,12,13,32,32,6,0,34,34,92,92,102,102,110,110,
      114,114,116,116,93,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,
      0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,
      0,0,29,1,0,0,0,1,33,1,0,0,0,3,35,1,0,0,0,5,37,1,0,0,0,7,39,1,0,0,0,
      9,41,1,0,0,0,11,43,1,0,0,0,13,45,1,0,0,0,15,47,1,0,0,0,17,49,1,0,0,
      0,19,51,1,0,0,0,21,54,1,0,0,0,23,76,1,0,0,0,25,81,1,0,0,0,27,87,1,
      0,0,0,29,89,1,0,0,0,31,34,3,3,1,0,32,34,3,5,2,0,33,31,1,0,0,0,33,32,
      1,0,0,0,34,2,1,0,0,0,35,36,7,0,0,0,36,4,1,0,0,0,37,38,7,1,0,0,38,6,
      1,0,0,0,39,40,7,2,0,0,40,8,1,0,0,0,41,42,5,42,0,0,42,10,1,0,0,0,43,
      44,5,47,0,0,44,12,1,0,0,0,45,46,5,43,0,0,46,14,1,0,0,0,47,48,5,45,
      0,0,48,16,1,0,0,0,49,50,5,40,0,0,50,18,1,0,0,0,51,52,5,41,0,0,52,20,
      1,0,0,0,53,55,3,7,3,0,54,53,1,0,0,0,55,56,1,0,0,0,56,54,1,0,0,0,56,
      57,1,0,0,0,57,58,1,0,0,0,58,60,5,46,0,0,59,61,3,7,3,0,60,59,1,0,0,
      0,61,62,1,0,0,0,62,60,1,0,0,0,62,63,1,0,0,0,63,73,1,0,0,0,64,66,5,
      101,0,0,65,67,5,45,0,0,66,65,1,0,0,0,66,67,1,0,0,0,67,69,1,0,0,0,68,
      70,3,7,3,0,69,68,1,0,0,0,70,71,1,0,0,0,71,69,1,0,0,0,71,72,1,0,0,0,
      72,74,1,0,0,0,73,64,1,0,0,0,73,74,1,0,0,0,74,22,1,0,0,0,75,77,3,7,
      3,0,76,75,1,0,0,0,77,78,1,0,0,0,78,76,1,0,0,0,78,79,1,0,0,0,79,24,
      1,0,0,0,80,82,7,3,0,0,81,80,1,0,0,0,82,83,1,0,0,0,83,81,1,0,0,0,83,
      84,1,0,0,0,84,85,1,0,0,0,85,86,6,12,0,0,86,26,1,0,0,0,87,88,7,4,0,
      0,88,28,1,0,0,0,89,90,9,0,0,0,90,30,1,0,0,0,9,0,33,56,62,66,71,73,
      78,83,1,6,0,0
  ];

  static final ATN _ATN =
      ATNDeserializer().deserialize(_serializedATN);
}