// ANTLRv4 File generated by the BNF Converter (bnfc 2.9.6).

// Lexer definition for use with Antlr4
lexer grammar ArithLexer;
// Predefined regular expressions in BNFC
fragment LETTER  : CAPITAL | SMALL ;
fragment CAPITAL : [A-Z\u00C0-\u00D6\u00D8-\u00DE] ;
fragment SMALL   : [a-z\u00DF-\u00F6\u00F8-\u00FF] ;
fragment DIGIT   : [0-9] ;
Surrogate_id_SYMB_0 : '*' ;
Surrogate_id_SYMB_1 : '/' ;
Surrogate_id_SYMB_2 : '+' ;
Surrogate_id_SYMB_3 : '-' ;
Surrogate_id_SYMB_4 : '(' ;
Surrogate_id_SYMB_5 : ')' ;




// Double predefined token type
DOUBLE : DIGIT+ '.' DIGIT+ ('e' '-'? DIGIT+)?;
//Integer predefined token type
INTEGER : DIGIT+;

// Whitespace
WS : (' ' | '\r' | '\t' | '\n' | '\f')+ ->  skip;
// Escapable sequences
fragment
Escapable : ('"' | '\\' | 'n' | 't' | 'r' | 'f');
ErrorToken : . ;
