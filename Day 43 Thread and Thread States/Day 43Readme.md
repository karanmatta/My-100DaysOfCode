Life cycle of a Thread (Thread States)
In Java, a thread always exists in any one of the following states. These states are:

New
Active
Blocked / Waiting
Timed Waiting
Terminated

Implementation of Thread States
In Java, one can get the current state of a thread using the Thread.getState() method. The java.lang.Thread.State class of Java provides the constants ENUM to represent the state of a thread. These constants are:

public static final Thread.State NEW  
It represents the first state of a thread that is the NEW state.

public static final Thread.State RUNNABLE  
It represents the runnable state.It means a thread is waiting in the queue to run.

public static final Thread.State BLOCKED  
It represents the blocked state. In this state, the thread is waiting to acquire a lock.

public static final Thread.State WAITING  
It represents the waiting state. A thread will go to this state when it invokes the Object.wait() method, or Thread.join() method with no timeout. A thread in the waiting state is waiting for another thread to complete its task.

public static final Thread.State TIMED_WAITING  
It represents the timed waiting state. The main difference between waiting and timed waiting is the time constraint. Waiting has no time constraint, whereas timed waiting has the time constraint. A thread invoking the following method reaches the timed waiting state.

sleep
join with timeout
wait with timeout
parkUntil
parkNanos
public static final Thread.State TERMINATED  
It represents the final state of a thread that is terminated or dead. A terminated thread means it has completed its execution.



Threads in Java

Java Threads | How to create a thread in Java
There are two ways to create a thread:

By extending Thread class
By implementing Runnable interface.
Thread class:
Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.

Commonly used Constructors of Thread class:
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r,String name)
Commonly used methods of Thread class:
public void run(): is used to perform action for a thread.
public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
public void join(): waits for a thread to die.
public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
public int getPriority(): returns the priority of the thread.
public int setPriority(int priority): changes the priority of the thread.
public String getName(): returns the name of the thread.
public void setName(String name): changes the name of the thread.
public Thread currentThread(): returns the reference of currently executing thread.
public int getId(): returns the id of the thread.
public Thread.State getState(): returns the state of the thread.
public boolean isAlive(): tests if the thread is alive.
public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
public void suspend(): is used to suspend the thread(depricated).
public void resume(): is used to resume the suspended thread(depricated).
public void stop(): is used to stop the thread(depricated).
public boolean isDaemon(): tests if the thread is a daemon thread.
public void setDaemon(boolean b): marks the thread as daemon or user thread.
public void interrupt(): interrupts the thread.
public boolean isInterrupted(): tests if the thread has been interrupted.
public static boolean interrupted(): tests if the current thread has been interrupted.