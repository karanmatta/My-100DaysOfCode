Linked List
A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers as shown in the below image:

In simple words, a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list.

Types of Linked List

Singly Linked List
Each node in a singly linked list contains two items - the data and a link to the next node. The last node has a link to null. The entry point into a linked list is called the head of the list. It should be noted that head is not a separate node, but the reference to the first node. If the list is empty then the head is a null reference.

Doubly Linked List
Each node in a doubly linked list contains three items - two links and the data. Each node contains a link to the next node as well as the previous node in the list. The last node has links to both the previous node as well as null. The entry point into a doubly linked list is also called the head of the list and it should be noted that head is not a separate node, but the reference to the first node. If the list is empty then the head is a null reference.

Circular Linked List
A circular linked list is a linked list where all nodes are connected to form a circle. There is no NULL at the end. A circular linked list can be a singly circular linked list or doubly circular linked list.

Advantages over arrays

1) Dynamic size

2) Ease of insertion/deletion

Drawbacks:

1) Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists efficiently with its default implementation. Read about it here.

2) Extra memory space for a pointer is required with each element of the list.

3) Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.

Representation of Linked List

Linked List can be represented in two ways:

1) Singly Linked List

2) Doubly Linked List


Operations on Linked List

1) Insertion

2) Deletion

3) Traversal

4) Searching

5) Reverse

6) Merge

7) Sort

8) Remove Duplicates

9) Get Nth node

10) Get Nth node from the end

11) Get Middle of the linked list

12) Detect loop in linked list

13) Remove loop in linked list

14) Find length of loop in linked list

15) Check if linked list is palindrome
