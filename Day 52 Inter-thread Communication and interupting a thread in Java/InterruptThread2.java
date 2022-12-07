public class InterruptThread2 extends Thread{  
    public void run(){  
    try{  
    Thread.sleep(1000);  
    System.out.println("task");  
    }catch(InterruptedException e){  
    System.out.println("Exception handled "+e);  
    }  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    InterruptThread2 t1=new InterruptThread2();  
    t1.start();  
      
    t1.interrupt();  
      
    }  
    }  