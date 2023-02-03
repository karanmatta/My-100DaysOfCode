class Search_Trie {  
  
    private Node_Trie Prefix_Search(String W) {  
        Node_Trie node = R;  
        for (int x = 0; x < W.length(); x++) {  
           char curLetter = W.charAt(x);  
           if (node.containsKey(curLetter))   
             {  
               node = node.get(curLetter);  
              }   
           else {  
               return null;  
           }  
        }  
        return node;  
    }  
  
    public boolean search(String W) {  
       Node_Trie node = Prefix_Search(W);  
       return node != null && node.isEnd();  
    }  
}  