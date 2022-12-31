Circular Linked List

A circular linked list is a linked list where all nodes are connected to form a circle. There is no NULL at the end. A circular linked list can be a singly circular linked list or doubly circular linked list.

Advantages of Circular Linked List

1) Any node can be a starting point. We can traverse the whole list by starting from any point. We just need to stop when the first visited node is visited again.

2) Useful for implementation of queue. Unlike simple linked list, we don’t need to maintain two pointers for front and rear if we use circular linked list. We can maintain a pointer to the last inserted node and front can always be obtained as next of last.

Disadvantages of Circular Linked List

1) Each node of circular linked list must store an extra pointer for the previous node. It is required for efficient implementation of insertion and deletion operations.

2) Circular lists are useful only for implementation of queue and for nothing else.

Implementation

A simple and tail recursive function to print a given linked list

void printList(struct Node *head)

{

if (head != NULL)

{

printf("%d ", head->data);

printList(head->next);

}

}

A simple and tail recursive function to print a given linked list

void printList(struct Node *head)

{

if (head != NULL)

{

printf("%d ", head->data);

printList(head->next);

}

}

A simple and tail recursive function to print a given linked list

void printList(struct Node *head)

{

if (head != NULL)

{

printf("%d ", head->data);

printList(head->next);

}

}





    