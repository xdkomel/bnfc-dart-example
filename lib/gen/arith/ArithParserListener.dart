// Generated from arith/ArithParser.g4 by ANTLR 4.13.1
// ignore_for_file: unused_import, unused_local_variable, prefer_single_quotes
import 'package:antlr4/antlr4.dart';

import 'ArithParser.dart';

/// This abstract class defines a complete listener for a parse tree produced by
/// [ArithParser].
abstract class ArithParserListener extends ParseTreeListener {
  /// Enter a parse tree produced by [ArithParser.start_Exp2].
  /// [ctx] the parse tree
  void enterStart_Exp2(Start_Exp2Context ctx);
  /// Exit a parse tree produced by [ArithParser.start_Exp2].
  /// [ctx] the parse tree
  void exitStart_Exp2(Start_Exp2Context ctx);

  /// Enter a parse tree produced by [ArithParser.start_Exp1].
  /// [ctx] the parse tree
  void enterStart_Exp1(Start_Exp1Context ctx);
  /// Exit a parse tree produced by [ArithParser.start_Exp1].
  /// [ctx] the parse tree
  void exitStart_Exp1(Start_Exp1Context ctx);

  /// Enter a parse tree produced by [ArithParser.start_Exp].
  /// [ctx] the parse tree
  void enterStart_Exp(Start_ExpContext ctx);
  /// Exit a parse tree produced by [ArithParser.start_Exp].
  /// [ctx] the parse tree
  void exitStart_Exp(Start_ExpContext ctx);

  /// Enter a parse tree produced by the [ConstInteger]
  /// labeled alternative in [file.parserName>.exp2].
  /// [ctx] the parse tree
  void enterConstInteger(ConstIntegerContext ctx);
  /// Exit a parse tree produced by the [ConstInteger]
  /// labeled alternative in [ArithParser.exp2].
  /// [ctx] the parse tree
  void exitConstInteger(ConstIntegerContext ctx);

  /// Enter a parse tree produced by the [ConstDouble]
  /// labeled alternative in [file.parserName>.exp2].
  /// [ctx] the parse tree
  void enterConstDouble(ConstDoubleContext ctx);
  /// Exit a parse tree produced by the [ConstDouble]
  /// labeled alternative in [ArithParser.exp2].
  /// [ctx] the parse tree
  void exitConstDouble(ConstDoubleContext ctx);

  /// Enter a parse tree produced by the [Brackets]
  /// labeled alternative in [file.parserName>.exp2].
  /// [ctx] the parse tree
  void enterBrackets(BracketsContext ctx);
  /// Exit a parse tree produced by the [Brackets]
  /// labeled alternative in [ArithParser.exp2].
  /// [ctx] the parse tree
  void exitBrackets(BracketsContext ctx);

  /// Enter a parse tree produced by the [Div]
  /// labeled alternative in [file.parserName>.exp1].
  /// [ctx] the parse tree
  void enterDiv(DivContext ctx);
  /// Exit a parse tree produced by the [Div]
  /// labeled alternative in [ArithParser.exp1].
  /// [ctx] the parse tree
  void exitDiv(DivContext ctx);

  /// Enter a parse tree produced by the [Mul]
  /// labeled alternative in [file.parserName>.exp1].
  /// [ctx] the parse tree
  void enterMul(MulContext ctx);
  /// Exit a parse tree produced by the [Mul]
  /// labeled alternative in [ArithParser.exp1].
  /// [ctx] the parse tree
  void exitMul(MulContext ctx);

  /// Enter a parse tree produced by the [Coercion_Exp1_3]
  /// labeled alternative in [file.parserName>.exp1].
  /// [ctx] the parse tree
  void enterCoercion_Exp1_3(Coercion_Exp1_3Context ctx);
  /// Exit a parse tree produced by the [Coercion_Exp1_3]
  /// labeled alternative in [ArithParser.exp1].
  /// [ctx] the parse tree
  void exitCoercion_Exp1_3(Coercion_Exp1_3Context ctx);

  /// Enter a parse tree produced by the [Sub]
  /// labeled alternative in [file.parserName>.exp].
  /// [ctx] the parse tree
  void enterSub(SubContext ctx);
  /// Exit a parse tree produced by the [Sub]
  /// labeled alternative in [ArithParser.exp].
  /// [ctx] the parse tree
  void exitSub(SubContext ctx);

  /// Enter a parse tree produced by the [Coercion_Exp_3]
  /// labeled alternative in [file.parserName>.exp].
  /// [ctx] the parse tree
  void enterCoercion_Exp_3(Coercion_Exp_3Context ctx);
  /// Exit a parse tree produced by the [Coercion_Exp_3]
  /// labeled alternative in [ArithParser.exp].
  /// [ctx] the parse tree
  void exitCoercion_Exp_3(Coercion_Exp_3Context ctx);

  /// Enter a parse tree produced by the [Sum]
  /// labeled alternative in [file.parserName>.exp].
  /// [ctx] the parse tree
  void enterSum(SumContext ctx);
  /// Exit a parse tree produced by the [Sum]
  /// labeled alternative in [ArithParser.exp].
  /// [ctx] the parse tree
  void exitSum(SumContext ctx);
}