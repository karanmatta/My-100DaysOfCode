Topic 1 Constructor
Constructor : Constructor is a special method which is invoked automatically at the time of object creation. It is used to initialize the data members of new objects generally. 
Constructors have the same name as class or structure. 
Constructors don’t have a return type. (Not even void)
Constructors are only called once, at object creation.
There can be three types of constructors in Java. 
1. Non-Parameterized constructor : A constructor which has no argument is known as non-parameterized constructor(or no-argument constructor). It is invoked at the time of creating an object. If we don’t create one then it is created by default by Java.
class Student {
   String name;
   int age;
  
   Student() {
       System.out.println("Constructor called");
   }
}

2. Parameterized constructor : Constructor which has parameters is called a parameterized constructor. It is used to provide 
different values to distinct objects. 
class Student {
   String name;
   int age;
  
   Student(String name, int age) {
       this.name = name;
       this.age = age;
   }
}

3. Copy Constructor : A Copy constructor is an overloaded 
constructor used to declare and initialize an object from another object. There is only a user defined copy constructor in Java(C++ has a default one too).
class Student {
   String name;
   int age;
  
   Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
   }
}



Note : Unlike languages like C++, Java has no Destructor. Instead, Java has an efficient  garbage collector that deallocates memory automatically.

2nd Topic Compile time polymorphism : Compile time polymorphism is also known as static polymorphism. It is achieved by method overloading or operator overloading.
Method overloading : If a class has multiple methods having same name but different parameters, it is known as Method overloading.
Polymorphism 
Polymorphism is the ability to present the same interface for differing underlying forms (data types). With polymorphism, each of these classes will have different underlying data. Precisely, Poly means ‘many’ and morphism means ‘forms’. 
Types of Polymorphism IMP 
1. Compile Time Polymorphism (Static) 
2. Runtime Polymorphism (Dynamic) 
Let’s understand them one by one : 
Compile Time Polymorphism : The polymorphism which is implemented at the compile time is known as compile-time polymorphism. Example - Method Overloading 

Method Overloading : Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality. Method overloading can be possible on the following basis: 
1. The type of the parameters passed to the function. 
2. The number of parameters passed to the function.

class Student {
   String name;
   int age;
  
   public void displayInfo(String name) {
       System.out.println(name);
   }
 
   public void displayInfo(int age) {
       System.out.println(age);
   }
 
   public void displayInfo(String name, int age) {
       System.out.println(name);
       System.out.println(age);
   }
}
