Kruskal Algorithm Java
Kruskal algorithm is another most important algorithm used for Minimum Spanning Tree. MST is a spanning tree having a weight less than or equal to the weight of every spanning tree.

Kruskal algorithm in Java takes a connected and undirected graph and returns the Minimum Spanning Tree of it. The given diagram defines the working of Kruskal's algorithm.

Kruskal Algorithm Java
These are the following steps that we use to implement Kruskal's algorithm:

Take connected and undirected graph from the user.
We then sort all the edges from low weight to high weight.
Take the edge with the lowest weight and add it to the spanning tree. If adding the edge created a cycle, then reject this edge.
Keep adding edges until we reach all vertices.

How to find MST using Kruskal’s algorithm?
Below are the steps for finding MST using Kruskal’s algorithm:

Sort all the edges in non-decreasing order of their weight. 
Pick the smallest edge. Check if it forms a cycle with the spanning tree formed so far. If the cycle is not formed, include this edge. Else, discard it. 
Repeat step#2 until there are (V-1) edges in the spanning tree.