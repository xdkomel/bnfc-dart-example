import 'package:antlr4/antlr4.dart';
import 'dart:io';

import 'gen/arith/ArithLexer.dart';
import 'gen/arith/ArithParser.dart';
import 'gen/arith/ast.dart';
import 'gen/arith/builder.dart';

Future<void> run(List<String> arguments) async {
  final input = InputStream.fromString("(1+2)*(3-2*5)");
  final lexer = ArithLexer(input);
  final tokens = CommonTokenStream(lexer);
  final parser = ArithParser(tokens);
  parser.addErrorListener(DiagnosticErrorListener());
  final tree = parser.start_Exp();
  final output = buildExp(tree.exp());
  final result = output == null ? "null" : "${compute(output)}";
  final file = File('output.txt').openWrite();
  file.write("${output?.print} = $result");
  file.close();
}

double compute(Exp e) => switch (e) {
      Sum s => compute(s.exp1) + compute(s.exp2),
      Sub s => compute(s.exp1) - compute(s.exp2),
      Mul s => compute(s.exp1) * compute(s.exp2),
      Div s => compute(s.exp1) / compute(s.exp2),
      Brackets s => compute(s.exp),
      ConstDouble c => c.myDouble,
      ConstInteger c => c.integer.toDouble(),
    };
