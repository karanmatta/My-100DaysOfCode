// important import statements  
import java.lang.Thread;  
import java.io.*;  
  
  
public class SleepMethod2  
{  
    // main method  
public static void main(String argvs[])  
{  
  
try {  
for (int j = 0; j < 5; j++)  
{  
  
// The main thread sleeps for the 1000 milliseconds, which is 1 sec  
// whenever the loop runs  
Thread.sleep(1000);  
  
// displaying the value of the variable  
System.out.println(j);  
}  
}  
catch (Exception expn)   
{  
// catching the exception  
System.out.println(expn);  
}  
}  
}  

// Explanation:
// The sleep() method is used to pause the execution of the thread for the specified time.
// The sleep() method can be invoked at any time. The thread is put into the timed waiting state.
// The syntax of the sleep() method is:
// public static void sleep(long millis) throws InterruptedException
// The sleep() method is a static method of the Thread class.