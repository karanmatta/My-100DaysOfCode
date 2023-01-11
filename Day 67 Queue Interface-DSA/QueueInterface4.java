// Java program to iterate elements
// to a Queue
  
import java.util.*;
  
public class QueueInterface4 {
  
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
  
        pq.add("Hello");
        pq.add("Karan");
        pq.add("Matta");
  
        Iterator iterator = pq.iterator();
  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}