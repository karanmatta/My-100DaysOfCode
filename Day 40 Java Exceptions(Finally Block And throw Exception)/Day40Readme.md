Java Finally Block in Exception handling
Java finally block is a block used to execute important code such as closing the connection, etc.

Java finally block is always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

The finally block follows the try-catch block.
The finally block is used to execute important code such as closing connection, stream etc. The finally block always executes whether exception is handled or not.

Syntax:

try {
    //code that may raise exception
}
catch(ExceptionType1 ex1) {
    //handling exception
}
catch(ExceptionType2 ex2) {
    //handling exception
}
finally {
    //code to be executed
}


Java throw keyword in Exception handling
The Java throw keyword is used to throw an exception explicitly.

We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.

We can throw either checked or unchecked exceptions in Java by throw keyword. It is mainly used to throw a custom exception. We will discuss custom exceptions later in this section.

We can also define our own set of conditions and throw an exception explicitly using throw keyword. For example, we can throw ArithmeticException if we divide a number by another number. Here, we just need to set the condition and throw exception using throw keyword.

Java throw keyword is used to explicitly throw an exception. The throw keyword is mainly used to throw custom exception. There are two ways to throw an exception:

throw with exception instance

throw with exception type

throw with exception instance

Syntax:

throw new ExceptionInstance;

Example:

throw new ArithmeticException("Arithmetic Exception");

throw with exception type

Syntax:

throw ExceptionType;

Example:

throw ArithmeticException;