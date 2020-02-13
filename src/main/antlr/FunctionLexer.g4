lexer grammar FunctionLexer;


// Lexical Rules
ASSERT: 'assert';
BREAK: 'break';
BOOL: 'true' | 'false';
CASE: 'case';
CLASS: 'class';
CONSTRUCTOR: 'constructor';
CONTINUE: 'continue';
DO: 'do';
ELSE: 'else';
FOR: 'for';
GEN: 'gen';
IF: 'if';
IN: 'in';
IS: 'is';
LOAD: 'load';
LOG: 'log';
INSTANCE: 'instance';
FUNCTION: 'function';
NULL: 'null';
NEW: 'new';
RETURN: 'return';
SWITCH: 'switch';
THIS: 'this';
TICK: 'tick';
THROW: 'throw';
VAR: 'var';
WHILE: 'while';



AND: '&&';
OR: '||';

GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
EQ: '==';
NE: '!=';
NOT: '!';

PLUSEQUAL:   '+=';
MINUSEQUAL:  '-=';
MULTEQUAL:   '*=';
DIVIDEEQUAL: '/=';
PLUSPLUS:    '++';
MINUSMINUS:  '--';

POW: '^';
MULT: '*';
DIV: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{' -> pushMode(DEFAULT_MODE);
RBRACE: '}' -> popMode;
LBRACKET: '[';
RBRACKET: ']';

EQUAL: '=';
ELVIS: '?:';
QUESTION: '?';
DOTDOTDOT: '...';
DOT: '.';
SEMI: ';';
COLON: ':';
COMMA: ',';
ARROW: '->';

OPEN_STRING: '\'' -> pushMode(STRING);
OPEN_DOUBLE_QUOTED_STRING: '"' -> pushMode(DOUBLE_QUOTED_STRING), type(OPEN_STRING);
OPEN_COMMAND: NEWLINE WS? '/' -> pushMode(COMMAND_MODE);
OPEN_MULTI_COMMAND: NEWLINE WS? '//' (NEWLINE | WS)* -> pushMode(MULTI_LINE_COMMAND), type(OPEN_COMMAND);

NUM: PINT ('.' PINT)?;
fragment PINT: [0-9] [0-9_]*;
IDEN: [a-zA-Z_] [a-zA-Z0-9_]*;

WS: [ \t]+ -> skip;
NEWLINE: ('\r'? '\n' | '\r') -> skip;
COMMENT: '#' ~[\r\n]* -> skip;



mode STRING;

ENTER_EXPR_INTERP: '${' -> pushMode(DEFAULT_MODE);

ID_INTERP: '$' IDEN;
ESCAPE: '\\' (["'\\$rn] | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT);
fragment HEX_DIGIT: [0-9a-fA-F];
TEXT: (~[$\r\n\\'])+;

CLOSE_STRING: OPEN_STRING -> popMode;

mode DOUBLE_QUOTED_STRING;

ENTER_DOUBLE_EXPR_INTERP: ENTER_EXPR_INTERP -> pushMode(DEFAULT_MODE), type(ENTER_EXPR_INTERP);

DOUBLE_ID_INTERP: ID_INTERP -> type(ID_INTERP);
DOUBLE_TEXT: (~[$\r\n\\"])+ -> type(TEXT);
DOUBLE_ESCAPE: ESCAPE -> type(ESCAPE);
CLOSE_DOUBLE_QUOTED_STRING: OPEN_DOUBLE_QUOTED_STRING -> popMode, type(CLOSE_STRING);

mode COMMAND_MODE;

ENTER_EXPR_INTERP_COMMAND: '${' -> pushMode(DEFAULT_MODE);

OPEN_FUNCTION: '$' FUNCTION -> popMode, pushMode(DEFAULT_MODE);
// $function 'mw:test' {
ID_INTERP_COMMAND: '$' IDEN;
TEXT_COMMAND: ('\\$' | ~[$\r\n]+)+;
NEWLINE_COMMAND: OPEN_COMMAND;

EXIT_COMMAND: NEWLINE -> popMode;

mode MULTI_LINE_COMMAND;

EXIT_MULTI_COMMAND: NEWLINE* '//' -> popMode, type(EXIT_COMMAND);

ID_INTERP_MULTI_COMMAND: ID_INTERP_COMMAND -> type(ID_INTERP_COMMAND);

TEXT_MULTI_COMMAND: ('\\$' | '/' ~[$\r\n/] | ~[$\r\n/]+)+ -> type(TEXT_COMMAND);

ENTER_EXPR_MULTI_INTERP: ENTER_EXPR_INTERP -> pushMode(DEFAULT_MODE), type(ENTER_EXPR_INTERP);

CONTINUE_COMMAND: WS? NEWLINE WS?;

