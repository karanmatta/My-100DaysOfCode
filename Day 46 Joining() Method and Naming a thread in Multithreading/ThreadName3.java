class ThreadName3 extends Thread{  
    public void run(){  
     System.out.println(Thread.currentThread().getName());  
    }  
    public static void main(String args[]){  
     ThreadName3 t1=new ThreadName3();  
     ThreadName3 t2=new ThreadName3();  
     
     t1.start();  
     t2.start();  
    }  
   }  