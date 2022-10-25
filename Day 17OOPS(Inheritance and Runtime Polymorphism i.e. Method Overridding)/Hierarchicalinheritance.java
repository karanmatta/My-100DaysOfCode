//hierarchical inheritance

class Animal{
    void eat()
    {
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Barking");
    }

}
class Cat extends Animal{
    void meow()
    {
        System.out.println("Meowing");
    }
}

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
//In hierarchical inheritance, the derived classes inherit the properties of the base class.
//In the above example, the Dog class and the Cat class inherit the properties of the Animal class.
//The Dog class and the Cat class are the derived classes and the Animal class is the base class.
//The derived classes can access the properties of the base class.