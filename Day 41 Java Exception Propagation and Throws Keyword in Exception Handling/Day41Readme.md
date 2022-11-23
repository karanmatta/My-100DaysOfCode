Exception Propagation

Exception propagation is the process of passing an exception from one method to another. The exception is passed from the method that throws it to the method that handles it. The exception is passed from the method that throws it to the method that handles it.

The following example shows how an exception is propagated from the method that throws it to the method that handles it.

public class ExceptionPropagationExample { public static void main(String[] args) { try { method1(); } catch (Exception e) { System.out.println("Exception handled in main()"); } } public static void method1() throws Exception { try { method2(); } catch (Exception e) { System.out.println("Exception handled in method1()"); throw e; } } public static void method2() throws Exception { throw new Exception(); } }

The output of the above program is as follows:

Exception handled in method1()

Exception handled in main()

In the above example, the exception is thrown from the method2() and is handled in the method1(). The exception is then propagated to the main() method where it is handled.

The following diagram shows the exception propagation process:

Exception Propagation in Java

The following points should be kept in mind while propagating an exception:

The exception is propagated from the method that throws it to the method that handles it.



Java throws keyword
The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception. So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.

Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he is not checking the code before it being used.

Syntax of Java throws
return_type method_name() throws exception_class_name{  
//method code  
}  
Which exception should be declared?
Ans: Checked exception only, because:

unchecked exception: under our control so we can correct our code.
error: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.
Advantage of Java throws keyword
Now Checked Exception can be propagated (forwarded in call stack).

It provides information to the caller of the method about the exception .