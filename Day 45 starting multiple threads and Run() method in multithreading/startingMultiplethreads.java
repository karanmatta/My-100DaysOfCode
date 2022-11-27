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