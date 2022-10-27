TOPIC 1 Encapsulation 
Encapsulation is the process of hiding the implementation details of a class from the user. The user only knows about the methods and properties of the class and not the implementation details.
Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java). 


TOPIC 2 Abstraction
We try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details. With definition of properties of problems, including the data which are affected and the operations which are identified, the model abstracted from problems can be a standard solution to this type of problems. It is an efficient way since there are nebulous real-life problems that have similar properties. 
In simple terms, it is hiding the unnecessary details & showing only the essential parts/functionalities to the user.
Data binding : Data binding is a process of binding the application UI and business logic. Any change made in the business logic will reflect directly to the application UI. 
Abstraction is achieved in 2 ways :
Abstract class
Interfaces (Pure Abstraction)

Abstract Class
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
