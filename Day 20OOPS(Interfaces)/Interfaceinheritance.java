interface Printable{  
    void print();  
    }  
    interface Showable extends Printable{  
    void show();  
    }  
    public class Interfaceinheritance implements Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
        Interfaceinheritance obj = new Interfaceinheritance();  
    obj.print();  
    obj.show();  
     }  
    }  
    // In the above example, the interface Showable extends the interface Printable.
    // So, the interface Showable inherits the methods of the interface Printable.
    // The class Interfaceinheritance implements the interface Showable.
    // So, the class Interfaceinheritance inherits the methods of the interface Showable.
    // The class Interfaceinheritance can access the methods of the interface Showable.
    // The interface Showable can access the methods of the interface Printable.