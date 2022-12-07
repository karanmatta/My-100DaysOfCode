class InterruptThread3 extends Thread{  
  
    public void run(){  
    for(int i=1;i<=5;i++)  
    System.out.println(i);  
    }  
      
    public static void main(String args[]){  
    InterruptThread3 t1=new InterruptThread3();  
    t1.start();  
      
    t1.interrupt();  
      
    }  
    }  