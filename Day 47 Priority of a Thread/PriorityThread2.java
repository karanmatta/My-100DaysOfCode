
import java.lang.*;  
  
public class PriorityThread2 extends Thread   
{  
  
// Method 1  
// Whenever the start() method is called by a thread  
// the run() method is invoked  
public void run()  
{  
// the print statement  
System.out.println("Inside the run() method");  
}  
  
  
// the main method  
public static void main(String argvs[])  
{  
  
// Now, priority of the main thread is set to 7  
Thread.currentThread().setPriority(7);  
  
// the current thread is retrieved  
// using the currentThread() method  
  
// displaying the main thread priority  
// using the getPriority() method of the Thread class  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
// creating a thread by creating an object of the class ThreadPriorityExample1  
ThreadPriorityExample1 th1 = new ThreadPriorityExample1();  
  
// th1 thread is the child of the main thread  
// therefore, the th1 thread also gets the priority 7  
  
// Displaying the priority of the current thread  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
}  
}  