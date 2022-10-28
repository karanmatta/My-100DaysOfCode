 Interfaces
All the fields in interfaces are public, static and final by default.
All methods are public & abstract by default.
A class that implements an interface must implement all the methods declared in the interface.
Interfaces support the functionality of multiple inheritance.


Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class. For example:

interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
  
class TestInterface3 implements Printable, Showable{  
public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
TestInterface3 obj = new TestInterface3();  
obj.print();  
 }  
}  
Output:

Hello
As you can see in the above example, Printable and Showable interface have same methods but its implementation is provided by class TestTnterface1, so there is no ambiguity.