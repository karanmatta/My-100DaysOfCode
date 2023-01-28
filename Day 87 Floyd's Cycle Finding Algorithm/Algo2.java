import java.util.*;
public class GFG {
 
    static class Node {
        int data;
        Node next;
 
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
 
    // initialize a new head for the linked list
    static Node head = null;
    static class Linkedlist {
        // insert new value at the start
        void insert(int value)
        {
            Node newNode = new Node(value);
            if (head == null)
                head = newNode;
            else {
                newNode.next = head;
                head = newNode;
            }
        }
 
        // detect if there is a loop
        // in the linked list
        public Node detectLoop()
        {
            Node slowPointer = head, fastPointer = head;
 
            while (slowPointer != null
                   && fastPointer != null
                   && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
                if (slowPointer == fastPointer)
                    break;
            }
 
            // if no loop exists
            if (slowPointer != fastPointer)
                return null;
 
            // reset slow pointer to head
            // and traverse again
            slowPointer = head;
            while (slowPointer != fastPointer) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
 
            return slowPointer;
        }
    }
 
    public static void main(String[] args)
    {
        Linkedlist l1 = new Linkedlist();
        // inserting new values
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
 
        // adding a loop for the sake
        // of this example
 
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
 
        temp.next = head;
 
        // loop added;
 
        Node loopStart = l1.detectLoop();
        if (loopStart == null)
            System.out.println("Loop does not exists");
        else {
            System.out.println(
                "Loop does exists and starts from "
                + loopStart.data);
        }
    }
}
 