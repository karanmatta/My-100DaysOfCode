public void Node_delete(String W)   
{  
    Node_delete(R, W, 0);  
}  
   
private boolean Node_delete(Node_Trie current, String W, int Node_index) {  
    if (Node_index == W.length()) {  
        if (!current.isEndOfWord()) {  
            return false;  
        }  
        current.setEndOfWord(false);  
        return current.getChildren().isEmpty();  
    }  
    char A = W.charAt(Node_index);  
    Node_Trie node = current.getChildren().get(A);  
    if (node == null) {  
        return false;  
    }  
    boolean Current_Node_Delete = Node_delete(node, W, Node_index + 1) && !node.isEndOfWord();  
   
    if (Current_Node_Delete) {  
        current.getChildren().remove(A);  
        return current.getChildren().isEmpty();  
    }  
    return false;  
}  