// Java program to add elements
// to a Queue
  
import java.util.*;
  
public class QueueInterface2 {
  
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
  
        pq.add("Hello");
        pq.add("Karan");
        pq.add("Matta");
  
        System.out.println(pq);
    }
}