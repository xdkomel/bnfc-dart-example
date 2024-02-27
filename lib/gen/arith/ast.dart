// File generated by the BNF Converter (bnfc 2.9.6).

import 'pretty_printer.dart' as pp;
sealed class Exp with pp.Printable {
  @override
  String get print => pp.printExp(this);
}
class ConstInteger extends Exp with pp.Printable {
  final int integer;
  ConstInteger({required this.integer, });
  @override
  bool operator ==(Object o) =>
    o is ConstInteger &&
    o.runtimeType == runtimeType &&
    integer == o.integer;
  @override
  int get hashCode => Object.hashAll([integer, ]);
  @override
  String get print => pp.printConstInteger(this);
}

class ConstDouble extends Exp with pp.Printable {
  final double myDouble;
  ConstDouble({required this.myDouble, });
  @override
  bool operator ==(Object o) =>
    o is ConstDouble &&
    o.runtimeType == runtimeType &&
    myDouble == o.myDouble;
  @override
  int get hashCode => Object.hashAll([myDouble, ]);
  @override
  String get print => pp.printConstDouble(this);
}

class Mul extends Exp with pp.Printable {
  final Exp exp1;
  final Exp exp2;
  Mul({required this.exp1, required this.exp2, });
  @override
  bool operator ==(Object o) =>
    o is Mul &&
    o.runtimeType == runtimeType &&
    exp1 == o.exp1 &&
    exp2 == o.exp2;
  @override
  int get hashCode => Object.hashAll([exp1, exp2, ]);
  @override
  String get print => pp.printMul(this);
}

class Div extends Exp with pp.Printable {
  final Exp exp1;
  final Exp exp2;
  Div({required this.exp1, required this.exp2, });
  @override
  bool operator ==(Object o) =>
    o is Div &&
    o.runtimeType == runtimeType &&
    exp1 == o.exp1 &&
    exp2 == o.exp2;
  @override
  int get hashCode => Object.hashAll([exp1, exp2, ]);
  @override
  String get print => pp.printDiv(this);
}

class Sum extends Exp with pp.Printable {
  final Exp exp1;
  final Exp exp2;
  Sum({required this.exp1, required this.exp2, });
  @override
  bool operator ==(Object o) =>
    o is Sum &&
    o.runtimeType == runtimeType &&
    exp1 == o.exp1 &&
    exp2 == o.exp2;
  @override
  int get hashCode => Object.hashAll([exp1, exp2, ]);
  @override
  String get print => pp.printSum(this);
}

class Sub extends Exp with pp.Printable {
  final Exp exp1;
  final Exp exp2;
  Sub({required this.exp1, required this.exp2, });
  @override
  bool operator ==(Object o) =>
    o is Sub &&
    o.runtimeType == runtimeType &&
    exp1 == o.exp1 &&
    exp2 == o.exp2;
  @override
  int get hashCode => Object.hashAll([exp1, exp2, ]);
  @override
  String get print => pp.printSub(this);
}

class Brackets extends Exp with pp.Printable {
  final Exp exp;
  Brackets({required this.exp, });
  @override
  bool operator ==(Object o) =>
    o is Brackets &&
    o.runtimeType == runtimeType &&
    exp == o.exp;
  @override
  int get hashCode => Object.hashAll([exp, ]);
  @override
  String get print => pp.printBrackets(this);
}
