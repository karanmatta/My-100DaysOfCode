/*
 * Implement a simple text editor. The editor initially contains an empty string, . Perform  operations of the following  types:

append - Append string  to the end of .
delete - Delete the last  characters of .
print - Print the  character of .
undo - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.
Example



operation
index   S       ops[index]  explanation
-----   ------  ----------  -----------
0       abcde   1 fg        append fg
1       abcdefg 3 6         print the 6th letter - f
2       abcdefg 2 5         delete the last 5 letters
3       ab      4           undo the last operation, index 2
4       abcdefg 3 7         print the 7th characgter - g
5       abcdefg 4           undo the last operation, index 0
6       abcde   3 4         print the 4th character - d
The results should be printed as:

f
g
d
Input Format

The first line contains an integer, , denoting the number of operations.
Each line  of the  subsequent lines (where ) defines an operation to be performed. Each operation starts with a single integer,  (where ), denoting a type of operation as defined in the Problem Statement above. If the operation requires an argument,  is followed by its space-separated argument. For example, if  and , line  will be 1 abcd.

Constraints

The sum of the lengths of all  in the input .
The sum of  over all delete operations .
All input characters are lowercase English letters.
It is guaranteed that the sequence of operations given as input is possible to perform.
Output Format

Each operation of type  must print the  character on a new line.

Sample Input

STDIN   Function
-----   --------
8       Q = 8
1 abc   ops[0] = '1 abc'
3 3     ops[1] = '3 3'
2 3     ...
1 xy
3 2
4 
4 
3 1
Sample Output

c
y
a
Explanation

Initially,  is empty. The following sequence of  operations are described below:

. We append  to , so .
Print the  character on a new line. Currently, the  character is c.
Delete the last  characters in  (), so .
Append  to , so .
Print the  character on a new line. Currently, the  character is y.
Undo the last update to , making  empty again (i.e., ).
Undo the next to last update to  (the deletion of the last  characters), making .
Print the  character on a new line. Currently, the  character is a.
 
 */

 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String str = "";
        int top = 0;
        int q = Integer.parseInt(sc.nextLine());
        MyStack stack = new MyStack(q);
        for(int i = 0; i < q; ++i){
            String st[] = sc.nextLine().split(" ");
            int query = Integer.parseInt(st[0]);
            if(query == 1){
                Node newNode = new Node(query,str.length());
                stack.top++;
                stack.list[stack.top] = newNode;
                str += st[1];
            } else if(query == 2){
                int k = Integer.parseInt(st[1]);
                Node newNode = new Node(query,str.substring(str.length()-k));
                stack.top++;
                stack.list[stack.top] = newNode;
                str = str.substring(0,str.length()-k);
            } else if(query == 3){
                int index = Integer.parseInt(st[1]);
                System.out.println(str.charAt(index-1));
            } else if(query == 4){
                Node newNode = stack.list[stack.top];
                stack.top--;
                if(newNode.qtype == 1){
                    str = str.substring(0,newNode.idx);
                } else if(newNode.qtype == 2){
                    str += newNode.w;
                }
            }
        }
    }
}
class MyStack{
    Node list[];
    int top;
    MyStack(int size){
        this.list = new Node[size];
        this.top = -1;
    }
}
class Node{
    int qtype;
    int idx;
    String w;
    Node(int x, String y){
        this.qtype = x;
        this.w = y;
    }
    Node(int x, int index){
        this.qtype = x;
        this.idx = index;
    }
}