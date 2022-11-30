import java.io.*;  
  
// The ThreadNameClass is the child class of the class Thread  
class ThreadName extends Thread  
{  
  
// constructor of the class  
ThreadName(String threadName)  
{  
// invoking the constructor of  
// the superclass, which is Thread class.  
super(threadName);  
}  
  
// overriding the method run()  
public void run()  
{  
System.out.println(" The thread is executing....");  
}  
}  
  
public class ThreadName2 
{  
// main method  
public static void main (String argvs[])  
{  
// creating two threads and settting their name  
// using the contructor of the class  
ThreadName th1 = new ThreadName("JavaTpoint1");  
ThreadName th2 = new ThreadName("JavaTpoint2");  
  
// invoking the getName() method to get the names  
// of the thread created above  
System.out.println("Thread - 1: " + th1.getName());  
System.out.println("Thread - 2: " + th2.getName());  
  
  
// invoking the start() method on both the threads  
th1.start();  
th2.start();  
}  
}