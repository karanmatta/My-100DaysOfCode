Queue implementation using Array
Below is the implementation of a queue using an array: 

In the below code , we are initializing front and rear as 0, but in general we have to initialize it with -1.
If we assign rear as 0, rear will always point to next block of the end element, in fact , rear should point the index of last element,
eg. When we insert element in queue , it will add in the end i.e. after the current rear and then point the rear to the new element ,
According to the following code:
 IN the first dry run, front=rear = 0;

in void queueEnqueue(int data)

else part will be executed,



so arr[rear] =data;// rear =0, rear pointing to the latest element

rear++;  //now rear = 1, rear pointing to the next block after end element not the end element

//that’s against the original definition of rear


Queue implememtation using Linked List

Queue is a linear data structure which follows a particular order in which the operations are performed. The order is First In First Out (FIFO). A good example of queue is any queue of consumers for a resource where the consumer that came first is served first. The difference between stacks and queues is in removing. In a stack we remove the item the most recently added; in a queue, we remove the item the least recently added.

we maintain two pointers, front, and rear. The front points to the first item of the queue and rear points to the last item.

enQueue(): This operation adds a new node after the rear and moves the rear to the next node.
deQueue(): This operation removes the front node and moves the front to the next node.
Follow the below steps to solve the problem:

Create a class QNode with data members integer data and QNode* next
A parameterized constructor that takes an integer x value as a parameter and sets data equal to x and next as NULL
Create a class Queue with data members QNode front and rear
Enqueue Operation with parameter x:
Initialize QNode* temp with data = x
If the rear is set to NULL then set the front and rear to temp and return(Base Case)
Else set rear next to temp and then move rear to temp
Dequeue Operation:
If the front is set to NULL return(Base Case)
Initialize QNode temp with front and set front to its next
If the front is equal to NULL then set the rear to NULL
Delete temp from the memory