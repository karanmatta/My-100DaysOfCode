//copy constructor
class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class CopyConstructor{
    public static void main(String[] args) {
        Student s1 = new Student("Karan", 23);
        Student s2 = new Student(s1.name, s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println("This is a copy constructor");
    }
}
//Copy constructor is used to copy the values of one object to another object
//Copy constructor is used to initialize an object using another object of the same class
//this keyword is used to refer the current object
