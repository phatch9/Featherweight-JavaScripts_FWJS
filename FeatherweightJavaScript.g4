grammar FeatherweightJavaScript;


@header { package edu.sjsu.fwjs.parser; }

// Reserved words
IF        : 'if' ;
ELSE      : 'else' ;
WHILE     : 'while' ;
FUNCTION  : 'function' ;
VAR       : 'var'       ;
PRINT     : 'print' ;

// Literals
INT       : [1-9][0-9]* | '0' ;
BOOL      : 'true' | 'false' ;
NULL      : 'null' ;

// Symbols
MUL       : '*' ;
DIV       : '/' ;
SEPARATOR : ';' ;
ADD       : '+' ;
SUB       : '-' ;
MOD       : '%' ;
BIGGER    : '>' ;
SMALLER   : '<' ;
BIGOREQL  : '>='  ;
SMALLOREQL: '<=' ;
SAME      : '=='  ;
EQL       : '=' ;
COMMA     : ',' ;
LPAREN    : '(';
RPAREN    : ')';
LBRACE    : '{';
RBRACE    : '}';

// Identifier
ID        : ([a-zA-Z_] [a-zA-Z0-9_]*) ;


// Whitespace and comments
NEWLINE   : '\r\n' ? '\n' -> skip ;
LINE_COMMENT  : '//' ~[\n\r]* -> skip ;
WS            : [ \t]+ -> skip ; // ignore whitespace
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;



// ***Parsing rules ***

/** The start rule */
prog: stat+ ;

stat: expr SEPARATOR                                    # bareExpr   // complete
    | IF LPAREN expr RPAREN block ELSE block            # ifThenElse
    | IF LPAREN expr RPAREN block                       # ifThen
    | WHILE LPAREN expr RPAREN block                    # while
    | PRINT LPAREN expr RPAREN SEPARATOR                # print
    | SEPARATOR                                         # empty
    | VAR ID EQL expr SEPARATOR                         # varDec

    ;

expr: expr op=( '*' | '/' | '%' ) expr                  # mulDivMod
    | expr op=( '+' | '-' ) expr                        # addSub
    | expr op=( '<' | '<=' | '>' | '>=' | '==' ) expr   # equality
    | FUNCTION LPAREN (ID (COMMA ID)*)? RPAREN block            # functionDec
    | expr LPAREN (expr (COMMA expr)*)? RPAREN                  # functionApp
    | ID EQL expr                                       # assiState
    | INT                                               # int
    | BOOL                                              # bool
    | NULL                                              # null
    | LPAREN expr RPAREN                                # parens
    | ID                                                # id
    ;

block: LBRACE stat* RBRACE                             # fullBlock
    | stat                                             # simpBlock
    ;