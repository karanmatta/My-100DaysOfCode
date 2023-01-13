Binary Search Tree

A binary search tree follows some order to arrange the elements. In a Binary search tree, the value of left node must be smaller than the parent node, and the value of right node must be greater than the parent node. This rule is applied recursively to the left and right subtrees of the root.

Advantages of Binary search tree
Searching an element in the Binary search tree is easy as we always have a hint that which subtree has the desired element.
As compared to array and linked lists, insertion and deletion operations are faster in BST.
Example of creating a binary search tree
Now, let's see the creation of binary search tree using an example.

Suppose the data elements are - 45, 15, 79, 90, 10, 55, 12, 20, 50

First, we have to insert 45 into the tree as the root of the tree.
Then, read the next element; if it is smaller than the root node, insert it as the root of the left subtree, and move to the next element.
Otherwise, if the element is larger than the root node, then insert it as the root of the right subtree.
Now, let's see the process of creating the Binary search tree using the given data element. The process of creating the BST is shown below -

Step 1 - Insert 45.

Binary Search tree
Step 2 - Insert 15.

As 15 is smaller than 45, so insert it as the root node of the left subtree.

Binary Search tree
Step 3 - Insert 79.

As 79 is greater than 45, so insert it as the root node of the right subtree.

Binary Search tree
Step 4 - Insert 90.

90 is greater than 45 and 79, so it will be inserted as the right subtree of 79.

Binary Search tree
Step 5 - Insert 10.

10 is smaller than 45 and 15, so it will be inserted as a left subtree of 15.

Binary Search tree
Step 6 - Insert 55.

55 is larger than 45 and smaller than 79, so it will be inserted as the left subtree of 79.

Binary Search tree
Step 7 - Insert 12.

12 is smaller than 45 and 15 but greater than 10, so it will be inserted as the right subtree of 10.

Binary Search tree
Step 8 - Insert 20.

20 is smaller than 45 but greater than 15, so it will be inserted as the right subtree of 15.

Binary Search tree
Step 9 - Insert 50.

50 is greater than 45 but smaller than 79 and 55. So, it will be inserted as a left subtree of 55.

Binary Search tree
Now, the creation of binary search tree is completed. After that, let's move towards the operations that can be performed on Binary search tree.

We can perform insert, delete and search operations on the binary search tree.

Let's understand how a search is performed on a binary search tree.

Searching in Binary search tree
Searching means to find or locate a specific element or node in a data structure. In Binary search tree, searching a node is easy because elements in BST are stored in a specific order. The steps of searching a node in Binary Search tree are listed as follows -

First, compare the element to be searched with the root element of the tree.
If root is matched with the target element, then return the node's location.
If it is not matched, then check whether the item is less than the root element, if it is smaller than the root element, then move to the left subtree.
If it is larger than the root element, then move to the right subtree.
Repeat the above procedure recursively until the match is found.
If the element is not found or not present in the tree, then return NULL.




Traversal
Inorder Traversal (Practice): 
Algorithm Inorder(tree)

Traverse the left subtree, i.e., call Inorder(left->subtree)
Visit the root.
Traverse the right subtree, i.e., call Inorder(right->subtree)
Uses of Inorder Traversal:
In the case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order. To get nodes of BST in non-increasing order, a variation of Inorder traversal where Inorder traversal is reversed can be used. 

Preorder Traversal (Practice): 
Algorithm Preorder(tree)

Visit the root.
Traverse the left subtree, i.e., call Preorder(left->subtree)
Traverse the right subtree, i.e., call Preorder(right->subtree) 
Uses of Preorder:
Preorder traversal is used to create a copy of the tree. Preorder traversal is also used to get prefix expressions on an expression tree.

Postorder Traversal (Practice): 
Algorithm Postorder(tree)

Traverse the left subtree, i.e., call Postorder(left->subtree)
Traverse the right subtree, i.e., call Postorder(right->subtree)
Visit the root
Uses of Postorder:
Postorder traversal is used to delete the tree. Please see the question for the deletion of a tree for details. Postorder traversal is also useful to get the postfix expression of an expression tree
Example: Postorder traversal for the above-given figure is 4 5 2 3 1