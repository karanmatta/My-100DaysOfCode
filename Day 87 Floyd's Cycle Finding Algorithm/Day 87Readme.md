Floyd’s cycle finding algorithm or Hare-Tortoise algorithm is a pointer algorithm that uses only two pointers, moving through the sequence at different speeds. This algorithm is used to find a loop in a linked list. It uses two pointers one moving twice as fast as the other one. The faster one is called the faster pointer and the other one is called the slow pointer.

How Does Floyd’s Cycle Finding Algorithm Works?

While traversing the linked list one of these things will occur-

The Fast pointer may reach the end (NULL) this shows that there is no loop in the linked list.
The Fast pointer again catches the slow pointer at some time therefore a loop exists in the linked list.
Example:

Loop exists

Pseudocode:

Initialize two-pointers and start traversing the linked list.
Move the slow pointer by one position.
Move the fast pointer by two positions.
If both pointers meet at some point then a loop exists and if the fast pointer meets the end position then no loop exists.
Let,
X = Distance between the head(starting) to the loop starting point.

Y = Distance between the loop starting point and the first meeting point of both the pointers.

C = The distance of the loop

So before both the pointer meets-
The slow pointer has traveled X + Y + s * C distance, where s is any positive constant number.

The fast pointer has traveled X + Y + f * C distance, where f is any positive constant number.

Since the fast pointer is moving twice as fast as the slow pointer, we can say that the fast pointer covered twice the distance the slow pointer covered. Therefore-                  
 X + Y + f * C = 2 * (X + Y + s * C)

X + Y = f * C – 2 * s * C

We can say that,

f * C – 2 * s * C = (some integer) * C

                         = K * C

Thus,

X + Y = K * C       – ( 1 )

X = K * C – Y        – ( 2 )

Where K is some positive constant.    