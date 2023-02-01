/*  Given a weighted, undirected and connected graph of V vertices and E edges. The task is to find the sum of weights of the edges of the Minimum Spanning Tree.

 

Example 1:

Input:
3 3
0 1 5
1 2 3
0 2 1

Output:
4
Explanation:

The Spanning Tree resulting in a weight
of 4 is shown above.
Example 2:

Input:
2 1
0 1 5

Output:
5
Explanation:
Only one Spanning Tree is possible
which has a weight of 5.
 

Your task:
Since this is a functional problem you don't have to worry about input, you just have to complete the function  spanningTree() which takes number of vertices V and an adjacency matrix adj as input parameters and returns an integer denoting the sum of weights of the edges of the Minimum Spanning Tree. Here adj[i] contains a list of lists containing two integers where the first integer a[i][0] denotes that there is an edge between i and a[i][0][0] and second integer a[i][0][1] denotes that the distance between edge i and a[i][0][0] is a[i][0][1].

In other words , adj[i][j] is of form  { u , wt } . So,this denotes that i th node is connected to u th node with  edge weight equal to wt.

 

Expected Time Complexity: O(ElogV).
Expected Auxiliary Space: O(V2).
 

Constraints:
2 ≤ V ≤ 1000
V-1 ≤ E ≤ (V*(V-1))/2
1 ≤ w ≤ 1000
Graph is connected and doesn't contain self loops & multiple edges */

class Solution{

    

     class pair{

        int node;

        int weight;

        public pair(int node,int weight){

            this.node = node;

            this.weight = weight;

        }

    }

    

 public int spanningTree(int V, int E, int edges[][]){

     

     List<List<pair>> list = new ArrayList<>();

     

     for(int i=0;i<V;i++){

         List<pair> temp = new ArrayList<>();

         list.add(temp);

         

     }

     

     for(int i=0;i<edges.length;i++){

         

             list.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));

             list.get(edges[i][1]).add(new pair(edges[i][0],edges[i][2]));

         

     }

     

     PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b) -> {

         if(a.weight == b.weight){

             return a.node - b.node;

         }

         return a.weight - b.weight;

     });

     

     int[] vis = new int[V];

     

     // adding the inital pair in the priority queue

     pq.add(new pair(0,0));

     int sum = 0;

   

     while(pq.size() != 0){

         int node = pq.peek().node;

         int weight = pq.peek().weight;

         pq.poll();

         

         if(vis[node] == 1) continue;

         

         // increase sum of mst by the weight of recently added node

         sum += weight;

         vis[node] = 1;

         

         for(int i=0;i<list.get(node).size();i++){

                

                 int adjNode = list.get(node).get(i).node;

                 int adjW = list.get(node).get(i).weight;

               

                 if(vis[adjNode] != 1){

                     pq.add(new pair(adjNode,adjW));

                 }

             

         }

         

         

     }

     

     return sum;

 }

}