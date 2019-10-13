grammar simplelang;

start   : (p+=prog)* e=expr <EOF> ;
/* A grammar for arithmetic expressions */


prog : s=stmt SEMI              # Single
    | '{' (s+=stmt ';')+ '}'    # Sequence
;


stmt    :  x=ID EQ e = expr                         # Assignment
    | IF '(' c = cond ')' p = prog                  # If
    | IF '(' c = cond ')' p1 = prog ELSE p2 = prog  # IfElse
    | WHILE '(' c = cond ')' p = prog               # While
;

cond    : NOT c=cond                     # Not
    | c1=cond AND c2=cond                # And
    | c1=cond OR c2=cond                 # Or
    | e1 = expr c = CONDIT e2= expr      # Condition
    ;

expr : x=ID    	                # Variable
     | c=FLOAT	                # Constant
     | e1=expr op=OP1 e2=expr   # Multiplication
     | e1=expr op=OP2 e2=expr   # Addition
     | '(' e=expr ')'	        # Parenthesis
     | op=OP2 f=FLOAT           # SignedConstant
;

// Lexer

//Control of Flow
IF : 'if';
THEN : 'then';
ELSE : 'else';
WHILE : 'while';

//Conditionals
CONDIT : ('=='| '!=' | '>' | '<' | '<='|'>=');
AND : '&&';
OR : '||';
NOT : '!';

//operators
SEMI : ';';
EQ : '=';
OP1 : ('*'|'/'| '%');
OP2 : ('+'| '-');
FLOAT : NUM+ ('.' NUM+)? ;
NUM   : [0-9] ;
ID	: ('A'..'Z'|'a'..'z'|'_')+ ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;

