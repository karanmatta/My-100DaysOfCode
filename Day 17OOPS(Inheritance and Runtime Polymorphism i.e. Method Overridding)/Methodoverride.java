// Method overriding

class Area{
    public void area(){
        System.out.println("Area of the shape");
    }
}

class Rectangle extends Area{
    public void area(int length, int breadth){
        System.out.println(length*breadth);
    }
}
class Circle extends Area{
    public void area(int radius){
        System.out.println(3.14*radius*radius);
    }
}
class Triangle extends Area{
    public void area(int base, int height){
        System.out.println(0.5*base*height);
    }
}

public class Methodoverride {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area(10, 20);// value of length and breadth is passed to the method
        Circle c = new Circle();
        c.area(10);
        Triangle t = new Triangle();
        t.area(10, 20);
    }
}

// Method overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
//Runtime polymorphism is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
//Method overriding is used to provide the specific implementation of a method that is already provided by its super-class.
//Method overriding is used for runtime polymorphism.
//Method overriding is used to provide the specific implementation of a method that is already provided by its super-class.

// Method overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
