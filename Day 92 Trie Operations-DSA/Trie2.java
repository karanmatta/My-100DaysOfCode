import java.util.HashMap;
import java.util.Map;
 
// A class to store a Trie node
class Trie
{
    private boolean isLeaf;
    private Map<Character, Trie> children;
 
    // Constructor
    Trie()
    {
        isLeaf = false;
        children = new HashMap<>();
    }
 
    // Iterative function to insert a string into a Trie
    public void insert(String key)
    {
        System.out.println("Inserting \"" + key + "\"");
 
        // start from the root node
        Trie curr = this;
 
        // do for each character of the key
        for (char c: key.toCharArray())
        {
            // create a new node if the path doesn't exist
            curr.children.putIfAbsent(c, new Trie());
 
            // go to the next node
            curr = curr.children.get(c);
        }
 
        // mark the current node as a leaf
        curr.isLeaf = true;
    }
 
    // Iterative function to search a key in a Trie. It returns true
    // if the key is found in the Trie; otherwise, it returns false
    public boolean search(String key)
    {
        System.out.print("Searching \"" + key + "\" : ");
 
        Trie curr = this;
 
        // do for each character of the key
        for (char c: key.toCharArray())
        {
            // go to the next node
            curr = curr.children.get(c);
 
            // if the string is invalid (reached end of a path in the Trie)
            if (curr == null) {
                return false;
            }
        }
 
        // return true if the current node is a leaf node and the
        // end of the string is reached
        return curr.isLeaf;
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        // construct a new Trie node
        Trie head = new Trie();
 
        head.insert("techie");
        head.insert("techi");
        head.insert("tech");
 
        System.out.println(head.search("tech"));            // true
        System.out.println(head.search("techi"));           // true
        System.out.println(head.search("techie"));          // true
        System.out.println(head.search("techiedelight"));   // false
 
        head.insert("techiedelight");
 
        System.out.println(head.search("tech"));            // true
        System.out.println(head.search("techi"));           // true
        System.out.println(head.search("techie"));          // true
        System.out.println(head.search("techiedelight"));   // true
    }
}
