/*  Given a directed graph, find out if a vertex j is reachable from another vertex i for all vertex pairs (i, j) in the given graph. Here reachable mean that there is a path from vertex i to j. The reach-ability matrix is called transitive closure of a graph. The directed graph is represented by adjacency list graph where there are N vertices.

Example 1:

Input: N = 4
graph = {{1, 1, 0, 1}, 
         {0, 1, 1, 0}, 
         {0, 0, 1, 1}, 
         {0, 0, 0, 1}}
Output: {{1, 1, 1, 1}, 
         {0, 1, 1, 1}, 
         {0, 0, 1, 1}, 
         {0, 0, 0, 1}}
Explaination: The output list shows the 
reachable indexes.
Your Task:
You do not need to read input or print anything. Your task is to complete the function transitiveClosure() which takes N and graph as input parameters and returns the transitive closure of the graph in form of 2d array.

Expected Time Complexity: O(N3)
Expected Auxiliary Space: O(N2) */

class Solution{
    
    // code here
    
static class Graph{
   public int v;
   public LinkedList<Integer>[] path;
   public Graph(int v){
       this.v = v;
        path = new LinkedList[v];
   }
   
   public void addPath(int graph[][]){
       for(int i = 0; i < v; i++){
           path[i] = new LinkedList<Integer>();
           path[i].add(i);
           for(int j = 0; j < v; j++){
               if(graph[i][j] == 1){
                   path[i].add(j);
               }
           } 
       }
   }
   
}

static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
{
   // code here
   boolean[] visited = new boolean[N];
   int[][] reached = new int[N][N];
   
   for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++){
        reached[i][j] = graph[i][j];
      } 
   }
   
   Graph graphObj = new Graph(N);
   graphObj.addPath(graph);
   
   for(int i = 0; i < N; i++){
       for(int j = 0; j < N; j++){
           visited[j] = false;
       }
       
       Queue<Integer> queue = new LinkedList<Integer>();
       queue.add(i);
       visited[i] = true;
       
       while(!queue.isEmpty()){
           int peek = queue.peek();
           queue.remove();
           
           reached[i][peek] = 1;
           
           for(int k = 0; k < graphObj.path[peek].size(); k++){
               if(!visited[graphObj.path[peek].get(k)]){
                   queue.add(graphObj.path[peek].get(k));
                   visited[graphObj.path[peek].get(k)] = true;
               }
           }
           
       }
   }
   
   ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
   for(int i = 0; i < N; i++){
       ArrayList<Integer> local = new ArrayList<Integer>();
      for(int j = 0; j < N; j++){
        local.add(reached[i][j]);
      } 
      
      result.add(local);
   }
   
   return result;
   
}
}
