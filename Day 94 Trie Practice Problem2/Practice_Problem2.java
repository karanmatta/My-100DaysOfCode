/*  A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.

Implement the Trie class:

Trie() Initializes the trie object.
void insert(String word) Inserts the string word into the trie.
boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.
 

Example 1:

Input
["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
Output
[null, null, true, false, true, null, true]

Explanation
Trie trie = new Trie();
trie.insert("apple");
trie.search("apple");   // return True
trie.search("app");     // return False
trie.startsWith("app"); // return True
trie.insert("app");
trie.search("app");     // return True
 

Constraints:

1 <= word.length, prefix.length <= 2000
word and prefix consist only of lowercase English letters.
At most 3 * 104 calls in total will be made to insert, search, and startsWith. */

class TrieNode{
    Map<Character,TrieNode> childrens;
    boolean isEndOfWord;
    
    public TrieNode(){
        childrens = new HashMap<Character,TrieNode>();
    }
}

class Trie {
    
    TrieNode root = null;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode crawler = root;
        
        for(Character currentChar : word.toCharArray()){
            if(!crawler.childrens.containsKey(currentChar)){
                crawler.childrens.put(currentChar,new TrieNode());
            }
            crawler = crawler.childrens.get(currentChar);
        }// Complete Word Is Exhausted
        
        crawler.isEndOfWord = true;
        return;
    }
    
    public boolean search(String word) {
        TrieNode crawler = root;
        
        for(Character currentChar : word.toCharArray()){
            if(!crawler.childrens.containsKey(currentChar)){
                return false;
            }
            crawler = crawler.childrens.get(currentChar);
        }// Complete Word Is Exhausted
        
        return crawler.isEndOfWord;
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode crawler = root;
        
        for(Character currentChar : prefix.toCharArray()){
            if(!crawler.childrens.containsKey(currentChar)){
                return false;
            }
            crawler = crawler.childrens.get(currentChar);
        }// Complete Word Is Exhausted
        return true;
    }
}