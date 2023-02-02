A trie is a discrete data structure that's not quite well-known or widely-mentioned in typical algorithm courses, but nevertheless an important one.

A trie (also known as a digital tree) and sometimes even radix tree or prefix tree (as they can be searched by prefixes), is an ordered tree structure, which takes advantage of the keys that it stores – usually strings.

A node's position in the tree defines the key with which that node is associated, which makes tries different in comparison to binary search trees, in which a node stores a key that corresponds only to that node.

All descendants of a node have a common prefix of a String associated with that node, whereas the root is associated with an empty String.

Here we have a preview of TrieNode that we will be using in our implementation of the Trie:

public class TrieNode {
    private HashMap<Character, TrieNode> children;
    private String content;
    private boolean isWord;
    
   // ...
}
Copy
There may be cases when a trie is a binary search tree, but in general, these are different. Both binary search trees and tries are trees, but each node in binary search trees always has two children, whereas tries' nodes, on the other hand, can have more.

In a trie, every node (except the root node) stores one character or a digit. By traversing the trie down from the root node to a particular node n, a common prefix of characters or digits can be formed which is shared by other branches of the trie as well.

By traversing up the trie from a leaf node to the root node, a String or a sequence of digits can be formed.

Here is the Trie class, which represents an implementation of the trie data structure:

public class Trie {
    private TrieNode root;
    //...
}
Copy
3. Common Operations
Now, let's see how to implement basic operations.

3.1. Inserting Elements
The first operation that we'll describe is the insertion of new nodes.

Before we start the implementation, it's important to understand the algorithm:

Set a current node as a root node
Set the current letter as the first letter of the word
If the current node has already an existing reference to the current letter (through one of the elements in the “children” field), then set current node to that referenced node. Otherwise, create a new node, set the letter equal to the current letter, and also initialize current node to this new node
Repeat step 3 until the key is traversed
The complexity of this operation is O(n), where n represents the key size.

Here is the implementation of this algorithm:

public void insert(String word) {
    TrieNode current = root;

    for (char l: word.toCharArray()) {
        current = current.getChildren().computeIfAbsent(l, c -> new TrieNode());
    }
    current.setEndOfWord(true);
}
Copy
Now let's see how we can use this method to insert new elements in a trie:

private Trie createExampleTrie() {
    Trie trie = new Trie();

    trie.insert("Programming");
    trie.insert("is");
    trie.insert("a");
    trie.insert("way");
    trie.insert("of");
    trie.insert("life");

    return trie;
}
Copy
We can test that trie has already been populated with new nodes from the following test:

@Test
public void givenATrie_WhenAddingElements_ThenTrieNotEmpty() {
    Trie trie = createTrie();

    assertFalse(trie.isEmpty());
}
Copy
3.2. Finding Elements
Let's now add a method to check whether a particular element is already present in a trie:

Get children of the root
Iterate through each character of the String
Check whether that character is already a part of a sub-trie. If it isn't present anywhere in the trie, then stop the search and return false
Repeat the second and the third step until there isn't any character left in the String. If the end of the String is reached, return true
The complexity of this algorithm is O(n), where n represents the length of the key.

Java implementation can look like:

public boolean find(String word) {
    TrieNode current = root;
    for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        TrieNode node = current.getChildren().get(ch);
        if (node == null) {
            return false;
        }
        current = node;
    }
    return current.isEndOfWord();
}