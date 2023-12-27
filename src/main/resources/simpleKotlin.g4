grammar simpleKotlin;
prog:   NEWLINE* s
        | NEWLINE* PACKAGE imppath NEWLINE s
        ;
s:      (IMP imppath NEWLINE+)* (infile (NEWLINE+|NEWLINE* EOF))+;
infile: fun | var;
fun:    (ANNOTATION NEWLINE+)* FUN NAME ORBRACKET args CRBRACKET NEWLINE* OBRACE NEWLINE* body CBRACE
        | (ANNOTATION NEWLINE+)* FUN NAME ORBRACKET args CRBRACKET COLON TYPE NEWLINE* OBRACE NEWLINE* body CBRACE
        ;
funcall: NAME ORBRACKET launchargs CRBRACKET;
body:   body var
        |NEWLINE*
        |body NEWLINE+
        |body operation
        ;
var:    VAR NAME COLON TYPE ASSIGN NEWLINE* expr NEWLINE+
        | VAR NAME COLON TYPE NEWLINE+
        ;
args:   NAME COLON TYPE NEWLINE* (COMA NEWLINE* NAME COLON TYPE NEWLINE*)*
        | NEWLINE*
        ;
launchargs: launcharg (COMA launcharg)*
        | NEWLINE*
        ;
launcharg: NEWLINE* expr NEWLINE*
        | NEWLINE* MINUS expr NEWLINE*
        ;
imppath: imppath DOT imppath
        | NAME
        ;
expr:   INT
        | FLOAT
        | funcall
        | expr ARITHMOP expr
        | expr MINUS expr
        | ORBRACKET expr CRBRACKET
        | SSTRING
        | NAME
        ;
loop:   FOR ORBRACKET NAME IN expr CRBRACKET NEWLINE* OBRACE body CBRACE
        | FOR ORBRACKET NAME IN expr CRBRACKET NEWLINE* operation
        | WHILE ORBRACKET boolexpr CRBRACKET NEWLINE* operation
        | WHILE ORBRACKET boolexpr CRBRACKET NEWLINE* OBRACE body CBRACE
        ;
cond:   IF ORBRACKET boolexpr CRBRACKET OBRACE body CBRACE
        | IF ORBRACKET boolexpr CRBRACKET NEWLINE* operation
        ;
else:   ELSE OBRACE body CBRACE
        | ELSE NEWLINE* operation
        ;
operation: loop
        |cond
        |cond NEWLINE* else
        |funcall
        |INCRDECR expr
        |expr INCRDECR
        |NAME ASSIGN (expr | boolexpr)
        |NAME ARASS (expr | boolexpr)
        |RETURN
        |RETURN expr
        ;
boolexpr: expr COMPOP expr
        |ORBRACKET boolexpr CRBRACKET
        | boolexpr LOGICOP boolexpr
        | TRUE
        | FALSE
        | boolexpr NEWLINE+
        | NEWLINE+ boolexpr
        ;
NEWLINE : [\r\n]+ ;
WHITESPACE: [ ]+ -> skip;
COMMENT:    '//' ~( '\r' | '\n' )* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;
INT     : [0-9]+ ;
FLOAT   : [0-9]+[.][0-9]+;
SSTRING : '"' .*? '"';
SEMICON : [;] ;
DOT     : [.] ;
COLON   : ':';
COMA    : ',' ;
TRUE    : 'true';
FUN     : 'fun';
FALSE   : 'false';
IMP     : 'import';
FOR     : 'for';
WHILE   : 'while';
IF      : 'if';
ELSE    : 'else';
TYPE    : 'Int'|'String'|'Float'|'Double'|'Array<'TYPE'>';
VAR     : ('var' | 'val');
RETURN  : 'return';
PACKAGE : 'package';
IN      : 'in';
NAME    : ([a-zA-Z]+ ('_'|INT)*)+;
ANNOTATION: '@'NAME;
ARASS   : ('+='|'-='|'*=');
ASSIGN  : '=';
ARITHMOP  : ('*'|'+'|'/');
MINUS   : '-';
LOGICOP : ('||'|'&&');
COMPOP  : ('=='|'>'|'<'|'<='|'>='|'!=');
INCRDECR: ('++'|'--');
ORBRACKET: '(';
CRBRACKET: ')';
OBRACE  : '{';
CBRACE  : '}';

