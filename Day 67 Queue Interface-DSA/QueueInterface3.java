// Java program to remove elements
// from a Queue
  
import java.util.*;
  
public class QueueInterface3 {
  
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
  
        pq.add("Hello");
        pq.add("Karan");
        pq.add("Matta");
  
        System.out.println("Initial Queue " + pq);
  
        pq.remove("Matta");
  
        System.out.println("After Remove " + pq);
  
        System.out.println("Poll Method " + pq.poll());
  
        System.out.println("Final Queue " + pq);
    }
}