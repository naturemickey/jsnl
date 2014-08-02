grammar Snlc;

@header{package net.yeah.zhouyou.mickey.snl.antlr4;}

program: programHead declarePart programBody? ;

programHead: PROGRAM programName=ID ;
declarePart: typeDecpart? varDecpart? procDecpart? ;

typeDecpart: TYPE typeDecList ;
typeDecList: typeId=ID ':=' typeDef ';' typeDecList? ;

typeDef: basicType
       | structureType
       | ID
       ;
basicType: INTEGER | CHAR ;
structureType: arrayType
             | recordType
             ;
arrayType: ARRAY '[' low=INTC '..' top=INTC ']' OF basicType ;
recordType: RECORD fieldDecList END ;
fieldDecList: typeDef idList ';' fieldDecList? ;
idList: ID (',' idList)? ;

varDecpart: VAR varDecList ;
varDecList: typeDef idList ';' varDecList? ;

procDecpart: procDeclare procDecpart? ;
procDeclare: PROCEDURE procName=ID '(' paramList? ')' ';'
             declarePart programBody ;
paramList: param (';' paramList)? ;
param: VAR? typeDef idList ;

programBody: BEGIN stmList END ;
stmList: stm (';' stmList)? ;
stm: conditionalStm
   | loopStm
   | inputStm
   | outputStm
   | assignment
   | callStm
   | RETURN
   ;
assignment: variable ':=' exp ;
callStm: ID '(' actParamList? ')' ;
conditionalStm: IF condExp THEN stmList (ELSE stmList)? FI ;
loopStm: WHILE condExp DO stmList ENDWH ;
inputStm: READ '(' invar=ID ')' ;
outputStm: WRITE '(' exp ')' ;
actParamList: exp (',' actParamList)? ;
condExp: exp (cmpOp=(EQ | LT) exp)? ;
exp: exp op=(MUL | DIV) exp
   | exp op=(ADD | SUB) exp
   | factor
   ;
factor: '(' exp ')'
      | intVal=INTC
      | variable
      ;
variable: ID variMore? ;
variMore: '[' exp ']'
        | DOT ID variMore?
        ;

//
PROGRAM: 'program' ;
TYPE: 'type';
INTEGER: 'integer' ;
CHAR: 'char' ;
ARRAY: 'array' ;
OF: 'of' ;
RECORD: 'record' ;
BEGIN: 'begin' ;
END: 'end' ;
PROCEDURE: 'procedure' ;
VAR: 'var' ;
IF: 'if' ;
THEN: 'then' ;
ELSE: 'else' ;
WHILE: 'while' ;
DO: 'do';
ENDWH: 'endwh' ;
READ: 'read' ;
WRITE: 'write' ;
RETURN: 'return' ;
FI: 'fi' ;
ID: [_a-zA-Z][_a-zA-Z0-9]* ;
INTC: ([0-9]+) | ('\'' . '\'') ;
ADD: '+' ;
SUB: '-' ;
MUL: '*' ;
DIV: '/' ;
EQ: '=' ;
LT: '<' ;
DOT: '.' ;
DDOT: '..' ;
AMGT: ':=' ;
SEM: ';' ;
COMMA: ',' ;
LBT: '(' ;
RBT: ')' ;
LSBT: '[' ;
RSBT: ']' ;
WS: [ \t\n\r]+ -> skip;