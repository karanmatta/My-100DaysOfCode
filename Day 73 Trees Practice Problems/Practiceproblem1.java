/*  Given a pointer to the root of a binary tree, print the top view of the binary tree.

The tree as seen from the top the nodes, is called the top view of the tree.

For example :

   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
Top View : 

Complete the function  and print the resulting values on a single line separated by space.

Input Format

You are given a function,

void topView(node * root) {

}
Constraints

 Nodes in the tree  

Output Format

Print the values on a single line separated by space.

Sample Input

   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
Sample Output

1 2 5 6

Explanation

   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
From the top, only nodes  are visible. */

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    /* 
    
    class Node 
        int data;
        Node left;
        Node right;
    */
    static class Pair{
        public Node node;
        public int dist;

        public Pair(Node node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }

    public static void topView(Node root) {
        if(root == null)
            return;
        Map<Integer, Integer> mp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair pair = q.poll();
            Node node = pair.node;
            int dist = pair.dist;
            if(!mp.containsKey(dist)){
                mp.put(dist, node.data);
            }
            if(node.left != null){
                q.add(new Pair(node.left, dist-1));
            }
            if(node.right != null){
                q.add(new Pair(node.right, dist+1));
            }
        }
        for(Map.Entry<Integer, Integer> ent : mp.entrySet()){
            System.out.print(ent.getValue()+ " ");
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }   
}
