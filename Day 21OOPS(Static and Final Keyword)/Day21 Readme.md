Static Keyword

Ques:-Why is the Java main method static?
Ans) It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

Java static keyword
Static variable
Program of the counter without static variable
Program of the counter with static variable
Static method
Restrictions for the static method
Why is the main method static?
Static block
Can we execute a program without main method?
The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

The static can be:

Variable (also known as a class variable)
Method (also known as a class method)
Block
Nested class
Static in Java
1) Java static variable
If you declare any variable as static, it is known as a static variable.

The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.
Advantages of static variable
It makes your program memory efficient (i.e., it saves memory).

Understanding the problem without static variable
class Student{  
     int rollno;  
     String name;  
     String college="ITS";  
}  
Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created. All students have its unique rollno and name, so instance data member is good in such case. Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once.






Final Keyword

The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:

variable
method
class
The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final keyword.

final keyword in java
1) Java final variable
If you make any variable as final, you cannot change the value of final variable(It will be constant).

Example of final variable
There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.