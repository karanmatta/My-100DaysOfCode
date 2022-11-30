class ThreadName1 extends Thread{  
    public void run(){  
     System.out.println("running...");  
    }  
   public static void main(String args[]){  
    ThreadName1 t1=new ThreadName1();  
    ThreadName1 t2=new ThreadName1();  
    System.out.println("Name of t1:"+t1.getName());  
    System.out.println("Name of t2:"+t2.getName());  
     
    t1.start();  
    t2.start();  
    
    t1.setName("KM");  
    System.out.println("After changing name of t1:"+t1.getName());  
   }  
  }  