/*Can we start a thread twice
No. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception.

Let's understand it by the example given below:*/

public class startingMultiplethreads extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
    startingMultiplethreads t1=new startingMultiplethreads();  
  t1.start();  
  t1.start();  
 }  
}  

