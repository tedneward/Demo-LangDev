lexer grammar CommonLexerRules; // note "lexer grammar"

ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
COMMENT
    :   '/*' .*? '*/' -> skip
    ; // toss out comments
LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ; // toss out line comments

