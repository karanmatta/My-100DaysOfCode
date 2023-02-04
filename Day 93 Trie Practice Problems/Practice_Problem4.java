/*  There is a given list of strings where each string contains only lowercase letters from , inclusive. The set of strings is said to be a GOOD SET if no string is a prefix of another string. In this case, print GOOD SET. Otherwise, print BAD SET on the first line followed by the string being checked.

Note If two strings are identical, they are prefixes of each other.

Example

Here 'abcd' is a prefix of 'abcde' and 'bcd' is a prefix of 'bcde'. Since 'abcde' is tested first, print

BAD SET  
abcde
.

No string is a prefix of another so print

GOOD SET 
Function Description
Complete the noPrefix function in the editor below.

noPrefix has the following parameter(s):
- string words[n]: an array of strings

Prints
- string(s): either GOOD SET or BAD SET on one line followed by the word on the next line. No return value is expected.

Input Format
First line contains , the size of .
Then next  lines each contain a string, .

Constraints

 the length of words[i] 
All letters in  are in the range 'a' through 'j', inclusive.

Sample Input00

STDIN       Function
-----       --------
7            words[] size n = 7
aab          words = ['aab', 'defgab', 'abcde', 'aabcde', 'bbbbbbbbbb', 'jabjjjad']
defgab  
abcde
aabcde
cedaaa
bbbbbbbbbb
jabjjjad
Sample Output00

BAD SET
aabcde
Explanation
'aab' is prefix of 'aabcde' so it is a BAD SET and fails at string 'aabcde'.

Sample Input01

4
aab
aac
aacghgh
aabghgh
Sample Output01

BAD SET
aacghgh
Explanation
'aab' is a prefix of 'aabghgh', and aac' is prefix of 'aacghgh'. The set is a BAD SET. 'aacghgh' is tested before 'aabghgh', so and it fails at 'aacghgh'.

Language
Java 15

More
293031323334353612345678910111213141516171819202122232425262728
        int n = Integer.parseInt(in.readLine());
        
        boolean bad = false;
        while (n-- > 0) {
            String word = in.readLine();  
            bad = !trie.insert(word);            
            if (bad) {
                out.println("BAD SET\n"+word);    
                break;
            }
…}
Line: 91 Col: 2

Submit Code

Run Code

Upload Code as File

Test against custom input
Problem Solving
You have earned 50.00 points!
You are now 344.7 points away from the 6th star for your problem solving badge.
74%1855.3/2200
Congratulations
You solved this challenge. Would you like to challenge your friends?Share on FacebookShare on TwitterShare on LinkedIn
Next Challenge

Test case 0

Test case 1

Test case 2

Test case 3

Test case 4

Test case 5

Test case 6

Test case 7

Test case 8

Test case 9

Test case 10

Test case 11

Test case 12

Test case 13

Test case 14

Test case 15

Test case 16

Test case 17

Test case 18

Test case 19

Test case 20

Test case 21

Test case 22

Test case 23

Test case 24

Test case 25

Test case 26

Test case 27

Test case 28

Test case 29

Test case 30

Test case 31

Test case 32

Test case 33

Test case 34

Test case 35

Test case 36

Test case 37

Test case 38

Test case 39

Test case 40

Test case 41
Compiler Message
Success
Hidden Test Case
Unlock this testcase for 5 hackos.

Unlock
 */


 import java.io.*;
import java.util.*;

public class Trie {

    private static final int ALPHABET_SIZE = 26;

    class Node {
        
        Node[] edges;
        char key;
        int wordCount = 0;
        int prefixCount = 0;
        
        Node(char key) {
            this.key = key;
            this.edges = new Node[ALPHABET_SIZE];
        }
        
        boolean has(char key) {
            return get(key) != null;
        }
        
        Node get(char key) {
            return edges[getKey(key)];
        }
        
        void put(char key, Node node) {
            this.edges[getKey(key)] = node;
        }
        
        char getKey(char ch) {
            return (char) (ch - 'a');
        }
        
    }
        
    private Node root = new Node('\0');
    
    public boolean insert(String word) {
        return insert(word, root);
    }
    
    private boolean insert(String word, Node root) {
        root.prefixCount++;
        if (word.length() >= 0 && root.wordCount > 0) {
            return false;
        }
        if (word.length() == 0) {
            if (root.prefixCount > 1) {
                return false;
            }
            root.wordCount++;            
            return true;
        }        
        char ch = word.charAt(0);
        Node next = root.get(ch);        
        if (next == null) {
            next = new Node(ch);            
            root.put(ch, next);
        }        
        return insert(word.substring(1), next);        
    }    
    
    public static void main(String[] args) throws IOException {        
    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));        
        
        Trie trie = new Trie();        
        int n = Integer.parseInt(in.readLine());
        
        boolean bad = false;
        while (n-- > 0) {
            String word = in.readLine();  
            bad = !trie.insert(word);            
            if (bad) {
                out.println("BAD SET\n"+word);    
                break;
            }
        }
        

        if (!bad) {
            out.println("GOOD SET");
        }        
        out.close();
        
    }    
    
}