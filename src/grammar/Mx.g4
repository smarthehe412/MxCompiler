grammar Mx;

fragment Digit: [0-9];
fragment PosDigit: [1-9];
fragment Letter: [a-zA-Z];
fragment StrChar: ~(["\\\r\n\u2028\u2029])
                | '\\' ('n' | '"' | '\\');

Add: '+';
Dec: '-';
Mul: '*';
Div: '/';
Mod: '%';

Ge: '>';
Le: '<';
Geq: '>=';
Leq: '<=';
Eq: '==';
Neq: '!=';

LogicAnd: '&&';
LogicOr: '||';
LogicNot: '!';

BitAnd: '&';
BitOr: '|';
BitXor: '^';
BitNot: '~';
Lsft: '<<';
Rsft: '>>';

Assign: '=';

SelfAdd: '++';
SelfDec: '--';
Dot: '.';
Arrow: '->';

Void: 'void';
Bool: 'bool';
Int: 'int';
String: 'string';
New: 'new';
Class: 'class';
If: 'if';
Else: 'else';
For: 'for';
While: 'while';
Break: 'break';
Continue: 'continue';
Return: 'return';

True: 'true';
False: 'false';
Null: 'null';
This: 'this';
ID: Letter (Digit | Letter | '_')*;
Num: PosDigit Digit*
   | '0';
Str: '"' StrChar* '"';
WhiteSpace: [ \t\u000B\u000C\u00A0] -> skip;
NewLine: [\r\n\u2028\u2029] -> skip;
LineCom: '//' ~[\r\n\u2028\u2029]* -> skip;
BlockCom: '/*' .*? '*/' -> skip;

builtinType: Int | Bool | Void | String;
const: True | False | Num | Str | Null | This;

program: def*;
def: classDef | funcDef | varDef;

varDef: typename varSingle (',' varSingle)* ';';
forVarDef: typename varSingle (',' varSingle)*;
varSingle: ID ('=' expr)?;

classDef: Class ID '{' (varDef | funcDef | conFuncDef)* '}' ';';

funcDef: typename ID '(' parameter? ')' suite;
conFuncDef: ID '(' ')' suite;

suite: '{' stat* '}';

stat: varDef                                                                                  #def_statement
    | suite                                                                                   #suite_statement
    | If '(' expr ')' (ifstat = stat) (Else (elsestat = stat))?                               #if_statement
    | Break ';'                                                                               #break_statement
    | Continue ';'                                                                            #continue_statement
    | Return expr? ';'                                                                        #return_statement
    | While '(' (cond = expr) ')' stat                                                        #while_statement
    | For '(' (init = expr)? ';' (cond = expr)? ';' (step = expr)? ')' stat                   #forExp_statement
    | For '(' (init = forVarDef)? ';' (cond = expr)? ';' (step = expr)? ')' stat              #forDef_statement
    | expr ';'                                                                                #expression_statement
    | ';'                                                                                     #empty_statement
    ;

expr: const                                     #constvalue
    | ID                                        #variable
    | newExpr                                   #new_expression
    | '(' expr ')'                              #parent_expression
    | ID '(' argu? ')'                          #functionCall
    | expr '[' expr ']'                         #arrayIndex
    | expr '.' ID                               #memberExpr
    | expr '.' ID '(' argu? ')'                 #memberFunc

    | expr op = ('--' | '++')                   #left_inc_dec
    | <assoc=right> op = ('--' | '++') expr     #right_inc_dec
    | <assoc=right> op = '-' expr               #unary
    | <assoc=right> op = ('!' | '~') expr       #unary

    | expr op = ('*' | '/'| '%') expr           #binary
    | expr op = ('+' | '-') expr                #binary
    | expr op = ('<<' | '>>') expr              #binary

    | expr op = ('<' | '<=' | '>' | '>=') expr  #binary
    | expr op = ('==' | '!=') expr              #binary
    | expr op = '&' expr                        #binary
    | expr op = '^' expr                        #binary
    | expr op = '|' expr                        #binary
    | expr op = '&&' expr                       #binary
    | expr op = '||' expr                       #binary
    | <assoc=right> expr '?' expr ':' expr      #conditional
    | <assoc=right> expr '=' expr               #assign
    ;

bracket: '[' ']';
newBracket: '[' expr? ']';

typename: (Int | Bool | Void | String | ID) bracket*;

argu: expr (',' expr)*;
parameter: typename ID (',' typename ID)*;

newExpr: 'new' newTypename ('(' ')')?;

newTypename: builtinType newBracket+                   #newBuiltinArray
           | ID newBracket+                            #newClassArray
           | ID                                        #newClass
           ;