public class RemoveHook3   
{  
  
// the Msg class is derived from the Thread class  
static class Msg extends Thread   
{  
  
public void run()   
{  
System.out.println("Bye ...");  
}  
}  
  
// main method  
public static void main(String[] argvs)   
{  
try   
{  
// creating an object of the class Msg  
Msg ms = new Msg();  
  
// registering the Msg object as the shutdown hook  
Runtime.getRuntime().addShutdownHook(ms);  
  
// printing the current state of program  
System.out.println("The program is beginning ...");  
  
// causing the thread to sleep for 2 seconds  
System.out.println("Waiting for 2 seconds ...");  
Thread.sleep(2000);  
  
// removing the hook  
Runtime.getRuntime().removeShutdownHook(ms);  
  
// printing the message program is terminating   
System.out.println("The program is terminating ...");  
}   
catch (Exception ex)   
{  
ex.printStackTrace();  
}  
}  
}  