Splay Tree
Splay trees are the self-balancing or self-adjusted binary search trees. In other words, we can say that the splay trees are the variants of the binary search trees. The prerequisite for the splay trees that we should know about the binary search trees.

As we already know, the time complexity of a binary search tree in every case. The time complexity of a binary search tree in the average case is O(logn) and the time complexity in the worst case is O(n). In a binary search tree, the value of the left subtree is smaller than the root node, and the value of the right subtree is greater than the root node; in such case, the time complexity would be O(logn). If the binary tree is left-skewed or right-skewed, then the time complexity would be O(n). To limit the skewness, the AVL and Red-Black tree came into the picture, having O(logn) time complexity for all the operations in all the cases. We can also improve this time complexity by doing more practical implementations, so the new Tree data structure was designed, known as a Splay tree.

What is a Splay Tree?
A splay tree is a self-balancing tree, but AVL and Red-Black trees are also self-balancing trees then. What makes the splay tree unique two trees. It has one extra property that makes it unique is splaying.

A splay tree contains the same operations as a Binary search tree, i.e., Insertion, deletion and searching, but it also contains one more operation, i.e., splaying. So. all the operations in the splay tree are followed by splaying.

Splay trees are not strictly balanced trees, but they are roughly balanced trees. Let's understand the search operation in the splay-tree.

Suppose we want to search 7 element in the tree, which is shown below:

Splay Tree
To search any element in the splay tree, first, we will perform the standard binary search tree operation. As 7 is less than 10 so we will come to the left of the root node. After performing the search operation, we need to perform splaying. Here splaying means that the operation that we are performing on any element should become the root node after performing some rearrangements. The rearrangement of the tree will be done through the rotations.

Note: The splay tree can be defined as the self-adjusted tree in which any operation performed on the element would rearrange the tree so that the element on which operation has been performed becomes the root node of the tree.
Rotations
There are six types of rotations used for splaying:

Zig rotation (Right rotation)
Zag rotation (Left rotation)
Zig zag (Zig followed by zag)
Zag zig (Zag followed by zig)
Zig zig (two right rotations)
Zag zag (two left rotations)
Factors required for selecting a type of rotation

The following are the factors used for selecting a type of rotation:

Does the node which we are trying to rotate have a grandparent?
Is the node left or right child of the parent?
Is the node left or right child of the grandparent?
Cases for the Rotations
Case 1: If the node does not have a grand-parent, and if it is the right child of the parent, then we carry out the left rotation; otherwise, the right rotation is performed.

Case 2: If the node has a grandparent, then based on the following scenarios; the rotation would be performed:

Scenario 1: If the node is the right of the parent and the parent is also right of its parent, then zig zig right right rotation is performed.

Scenario 2: If the node is left of a parent, but the parent is right of its parent, then zig zag right left rotation is performed.

Scenario 3: If the node is right of the parent and the parent is right of its parent, then zig zig left left rotation is performed.

Scenario 4: If the node is right of a parent, but the parent is left of its parent, then zig zag right-left rotation is performed.

Now, let's understand the above rotations with examples.

To rearrange the tree, we need to perform some rotations. The following are the types of rotations in the splay tree:

Zig rotations
The zig rotations are used when the item to be searched is either a root node or the child of a root node (i.e., left or the right child).

The following are the cases that can exist in the splay tree while searching:

Case 1: If the search item is a root node of the tree.

Case 2: If the search item is a child of the root node, then the two scenarios will be there:

If the child is a left child, the right rotation would be performed, known as a zig right rotation.
If the child is a right child, the left rotation would be performed, known as a zig left rotation.
Let's look at the above two scenarios through an example.

Consider the below example:

In the above example, we have to search 7 element in the tree. We will follow the below steps:

Step 1: First, we compare 7 with a root node. As 7 is less than 10, so it is a left child of the root node.

Step 2: Once the element is found, we will perform splaying. The right rotation is performed so that 7 becomes the root node of the tree, as shown below:

Splay Tree
Let's consider another example.

In the above example, we have to search 20 element in the tree. We will follow the below steps:

Step 1: First, we compare 20 with a root node. As 20 is greater than the root node, so it is a right child of the root node.

Splay Tree
Step 2: Once the element is found, we will perform splaying. The left rotation is performed so that 20 element becomes the root node of the tree.

Splay Tree
Zig zig rotations
Sometimes the situation arises when the item to be searched is having a parent as well as a grandparent. In this case, we have to perform four rotations for splaying.

Let's understand this case through an example.

Suppose we have to search 1 element in the tree, which is shown below:

Step 1: First, we have to perform a standard BST searching operation in order to search the 1 element. As 1 is less than 10 and 7, so it will be at the left of the node 7. Therefore, element 1 is having a parent, i.e., 7 as well as a grandparent, i.e., 10.

Step 2: In this step, we have to perform splaying. We need to make node 1 as a root node with the help of some rotations. In this case, we cannot simply perform a zig or zag rotation; we have to implement zig zig rotation.

In order to make node 1 as a root node, we need to perform two right rotations known as zig zig rotations. When we perform the right rotation then 10 will move downwards, and node 7 will come upwards as shown in the below figure:

Splay Tree
Again, we will perform zig right rotation, node 7 will move downwards, and node 1 will come upwards as shown below:

Splay Tree
As we observe in the above figure that node 1 has become the root node of the tree; therefore, the searching is completed.

Suppose we want to search 20 in the below tree.

In order to search 20, we need to perform two left rotations. Following are the steps required to search 20 node:

Splay Tree
Step 1: First, we perform the standard BST searching operation. As 20 is greater than 10 and 15, so it will be at the right of node 15.

Step 2: The second step is to perform splaying. In this case, two left rotations would be performed. In the first rotation, node 10 will move downwards, and node 15 would move upwards as shown below:

Splay Tree
In the second left rotation, node 15 will move downwards, and node 20 becomes the root node of the tree, as shown below:

Splay Tree
As we have observed that two left rotations are performed; so it is known as a zig zig left rotation.

Zig zag rotations
Till now, we have read that both parent and grandparent are either in RR or LL relationship. Now, we will see the RL or LR relationship between the parent and the grandparent.

Let's understand this case through an example.

Suppose we want to search 13 element in the tree which is shown below:

Splay Tree
Step 1: First, we perform standard BST searching operation. As 13 is greater than 10 but less than 15, so node 13 will be the left child of node 15.

Step 2: Since node 13 is at the left of 15 and node 15 is at the right of node 10, so RL relationship exists. First, we perform the right rotation on node 15, and 15 will move downwards, and node 13 will come upwards, as shown below:

Splay Tree
Still, node 13 is not the root node, and 13 is at the right of the root node, so we will perform left rotation known as a zag rotation. The node 10 will move downwards, and 13 becomes the root node as shown below:

Splay Tree
As we can observe in the above tree that node 13 has become the root node; therefore, the searching is completed. In this case, we have first performed the zig rotation and then zag rotation; so, it is known as a zig zag rotation.

Zag zig rotation
Let's understand this case through an example.

Suppose we want to search 9 element in the tree, which is shown below:

Splay Tree
Step 1: First, we perform the standard BST searching operation. As 9 is less than 10 but greater than 7, so it will be the right child of node 7.

Step 2: Since node 9 is at the right of node 7, and node 7 is at the left of node 10, so LR relationship exists. First, we perform the left rotation on node 7. The node 7 will move downwards, and node 9 moves upwards as shown below:

Splay Tree
Still the node 9 is not a root node, and 9 is at the left of the root node, so we will perform the right rotation known as zig rotation. After performing the right rotation, node 9 becomes the root node, as shown below:

Splay Tree
As we can observe in the above tree that node 13 is a root node; therefore, the searching is completed. In this case, we have first performed the zag rotation (left rotation), and then zig rotation (right rotation) is performed, so it is known as a zag zig rotation.