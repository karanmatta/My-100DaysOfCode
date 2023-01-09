Java Queue
A queue is another kind of linear data structure that is used to store elements just like any other data structure but in a particular manner. In simple words, we can say that the queue is a type of data structure in the Java programming language that stores elements of the same kind. The components in a queue are stored in a FIFO (First In, First Out) behavior. There are two ends in the queue collection, i.e., front & rear. Queue has two ends that is front and rear.

The following figure perfectly describes the FIFO (First In, First Out) property of the Java queue.

Java Queue
As explained in the preceding image, we can see that the queue is a linear data structure with two terminals, i.e., start (front) and end (rear). Components are added inside the queue from the rear end of the queue and the components are extracted from the front end of the queue.

The Queue is an interface in the Java that belongs to Java.util package. It also extends the Collection interface.

The generic representation of the Java Queue interface is shown below:

public interface Queue<T> extends Collection<T>  
As we have discussed above that the Queue is an interface, therefore we can also say that the queue cannot be instantiated because interfaces cannot be instantiated. If a user wants to implement the functionality of the Queue interface in Java, then it is mandatory to have some solid classes that implement the Queue interface.

In Java programming language, there are two different classes which are used to implement the Queue interface. These classes are:

LinkedList
PriorityQueue
Java Queue
Characteristics of the Java Queue
The Java Queue can be considered as one of the most important data structures in the programming world. Java Queue is attractive because of its properties. The significant properties of the Java Queue data structure are given as follows:

Java Queue obeys the FIFO (First In, First Out) manner. It indicates that elements are entered in the queue at the end and eliminated from the front.
The Java Queue interface gives all the rules and processes of the Collection interface like inclusion, deletion, etc.
There are two different classes that are used to implement the Queue interface. These classes are LinkedList and PriorityQueue.
Other than these two, there is a class that is, Array Blocking Queue that is used to implement the Queue interface.
There are two types of queues, Unbounded queues and Bounded queues. The Queues that are a part of the java.util package are known as the Unbounded queues and bounded queues are the queues that are present in java.util.concurrent package.
The Deque or (double-ended queue) is also a type of queue that carries the inclusion and deletion of elements from both ends.
The deque is also considered thread-safe.
Blocking Queues are also one of the types of queues that are also thread-safe. The Blocking Queues are used to implement the producer-consumer queries.
Blocking Queues do not support null elements. In Blocking queues, if any work similar to null values is tried, then the NullPointerException is also thrown.
Implementation of Queue
Classes used in implementation of Queue
The classes that are used to implement the functionalities of the queue are given as follows:

ArrayDeque
LinkedList
PriorityQueue