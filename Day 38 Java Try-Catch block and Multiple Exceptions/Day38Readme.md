Java Catch Multiple Exceptions



Java Catch Multiple Exceptions

In Java, we can catch multiple exceptions using a single catch block. This is possible because all the exceptions in Java are subclasses of the Throwable class. So, we can catch all the exceptions using a single catch block.

Syntax:

try {
    // code that may throw exceptions
} catch (ExceptionType1 | ExceptionType2 | ExceptionType3 e) {
    // code to handle exceptions
}

Example:

public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Something went wrong.");
        }
    }
}

Output:

Something went wrong.


