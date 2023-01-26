Dijkstra Algorithm Java
Dijkstra algorithm is one of the prominent algorithms to find the shortest path from the source node to a destination node. It uses the greedy approach to find the shortest path. The concept of the Dijkstra algorithm is to find the shortest distance (path) starting from the source point and to ignore the longer distances while doing an update.

In this section, we will implement the Dijkstra algorithm in Java program. Also, we will discuss its usage and limitations.

Dijkstra Algorithm Steps
Step1: All nodes should be marked as unvisited.

Step2: All the nodes must be initialized with the "infinite" (a big number) distance. The starting node must be initialized with zero.

Step3: Mark starting node as the current node.

Step4: From the current node, analyze all of its neighbors that are not visited yet, and compute their distances by adding the weight of the edge, which establishes the connection between the current node and neighbor node to the current distance of the current node.

Step5: Now, compare the recently computed distance with the distance allotted to the neighboring node, and treat it as the current distance of the neighboring node,

Step6: After that, the surrounding neighbors of the current node, which has not been visited, are considered, and the current nodes are marked as visited.

Step7: When the ending node is marked as visited, then the algorithm has done its job; otherwise,

Step8: Pick the unvisited node which has been allotted the minimum distance and treat it as the new current node. After that, start again from step4.

Dijkstra Algorithm Pseudo Code
Method Dijkstra(G, s): // G is graph, s is source  
distance[s] -> 0               // Distance from the source to source is always 0  
for every vertex vx in the Graph G: // doing the initialization work  
{  
if vx ? s  
{  
// Unknown distance function from source to each node set to infinity  
distance[vx] -> infinity   
}  
add vx to Queue Q   // Initially, all the nodes are in Q  
}  
  
// The while loop  
Untill the Q is not empty:                    
{  
// During the first run, this vertex is the source or starting node  
vx = vertex in Q with the minimum distance[vx]   
delete vx from Q   
}  
// where the neighbor ux has not been deleted yet from Q.  
for each neighbor ux of vx:             
              alt = distance[vx] + length(vx, ux)  
              // A path with lesser weight (shorter path), to ux is found  
              if alt < distance[ux]:                 
                  distance[ux] = alt            // updating the distance of ux   
  
      return dist[]  
  end Method  