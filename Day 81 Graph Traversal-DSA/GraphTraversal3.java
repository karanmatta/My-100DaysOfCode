public class GraphTraversal3 {
    public static void dfsIterative(Node startNode) {
        Stack<Node> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
    
        stack.push(startNode);
    
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
    
            if (!visited.contains(currentNode.value)) { // if current node has not been visited yet
                System.out.println(currentNode.value);
                visited.add(currentNode.value);
            }
    
            for (Node n : currentNode.neighbors) { // check each neighbor node. Push all unvisited nodes into stack
                if (!visited.contains(n.value)) {
                    stack.push(n);
                }
            }
        }
    }
}
