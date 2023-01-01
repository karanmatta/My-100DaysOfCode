public class DoublyCircularLinkedList2 {
    //All Operations

    public static void main(String[] args) {
        DoublyCircularLinkedList2 list = new DoublyCircularLinkedList2();
        list.insertAtStart(5);
        list.insertAtStart(4);
        list.insertAtStart(3);
        list.insertAtStart(2);
        list.insertAtStart(1);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.insertAtEnd(9);
        list.insertAtEnd(10);
        list.insertAfter(11, 5);
        list.insertAfter(12, 6);
        list.insertAfter(13, 7);
        list.insertAfter(14, 8);
        list.insertAfter(15, 9);
        list.insertAfter(16, 10);
        list.display();
    }

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void insertAfter(int data, int value) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.data != value) {
            temp = temp.next;
        }
        Node next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = next;
        next.prev = newNode;
    }

    public void display() {
        Node temp = head;
        System.out.println("Traversal in forward direction");
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
        System.out.println();
        System.out.println("Traversal in reverse direction");
        Node last = head.prev;
        temp = last;
        while (temp.prev != last) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.print(temp.data + " ");
    }
    
}


