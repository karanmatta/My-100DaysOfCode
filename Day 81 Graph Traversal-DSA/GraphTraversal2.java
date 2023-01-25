public class GraphTraversal2 {
    public static void bfs(Node startNode) {
        Queue<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(startNode);
        visited.add(startNode.value);
        
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.println(currentNode.value);
            
            for (Node n : currentNode.neighbors) { // Check each neighbor node
                if (!visited.contains(n.value)) { // If neighbor node's value is not in visited set
                    queue.add(n);
                    visited.add(n.value);
                }
            }
        }
    }
}
