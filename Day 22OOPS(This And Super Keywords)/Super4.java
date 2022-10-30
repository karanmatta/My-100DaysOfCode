// As we know well that default constructor is provided by compiler automatically if there is no constructor. But, it also adds super() as the first statement.

// Another example of super keyword where super() is provided by the compiler implicitly.

class Animal{  
Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
Dog(){  
System.out.println("dog is created");  
}  
}  
public class Super4{  
public static void main(String args[]){  
Dog d=new Dog();  
}
}  