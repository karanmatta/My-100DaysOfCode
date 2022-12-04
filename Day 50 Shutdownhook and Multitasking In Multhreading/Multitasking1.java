class Multitasking1 extends Thread{  
    public void run(){  
      System.out.println("task one");  
    }  
    public static void main(String args[]){  
     Multitasking1 t1=new Multitasking1();  
     Multitasking1 t2=new Multitasking1();  
     Multitasking1 t3=new Multitasking1();  
     
     t1.start();  
     t2.start();  
     t3.start();  
    }  
   }  