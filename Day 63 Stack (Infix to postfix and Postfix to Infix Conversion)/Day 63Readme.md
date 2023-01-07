Infix to Postfix Conversion

Infix to Postfix Java
The infix and postfix expressions can have the following operators: '+', '-', '%','*', '/' and alphabets from a to z. The precedence of the operators (+, -) is lesser than the precedence of operators (*, /, %). Parenthesis has the highest precedence and the expression inside it must be converted first. In this section, we will learn how to convert infix expression to postfix expression and postfix to infix expression through a Java program.

For performing the conversion, we use Stack data structure. The stack is used to store the operators and parenthesis to enforce the precedence Start parsing the expression from left to right. Before moving ahead in this section, ensure that you are friendly with the stack and its operations. Let's have a look at infix and postfix expressions.

Infix Expression
Infix expressions are those expressions in which the operator is written in-between the two or more operands. Usually, we use infix expression. For example, consider the following expression.

a+b  
a/2+c*d-e*(f*g)  
a*(b+c)/d  
Postfix Expression
Postfix expressions are those expressions in which the operator is written after their operands. For example, consider the following expression.

ab+  
abc/de+*+f-  
ab+cd-*  