/*  We're going to make our own Contacts application! The application must perform two types of operations:

add name, where  is a string denoting a contact name. This must store  as a new contact in the application.
find partial, where  is a string denoting a partial name to search the application for. It must count the number of contacts starting with  and print the count on a new line.
Given  sequential add and find operations, perform each operation in order.

Example
Operations are requested as follows:

add ed
add eddie
add edward
find ed
add edwina
find edw
find a
Three  operations include the names 'ed', 'eddie', and 'edward'. Next,  matches all  names. Note that it matches and counts the entire name 'ed'. Next, add 'edwina' and then find 'edw'.  names match: 'edward' and 'edwina'. In the final operation, there are  names that start with 'a'. Return the array .

Function Description

Complete the contacts function below.

contacts has the following parameters:

string queries[n]: the operations to perform
Returns

int[]: the results of each find operation
Input Format

The first line contains a single integer, , the number of operations to perform (the size of ).
Each of the following  lines contains a string, .

Constraints

 and  contain lowercase English letters only.
The input does not have any duplicate  for the  operation.
Sample Input

STDIN           Function
-----           --------
4               queries[] size n = 4
add hack        queries = ['add hack', 'add hackerrank', 'find hac', 'find hak']
add hackerrank
find hac
find hak
Sample Output

2
0
Explanation

Add a contact named hack.
Add a contact named hackerrank.
Find the number of contact names beginning with hac. Both name start with hac, add  to the return array.
Find the number of contact names beginning with hak. neither name starts with hak, add  to the return array. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class TrieNode{
    int count = 0;
    TrieNode[] trieNode = new TrieNode[26];
}


class Trie{
    TrieNode contacts = new TrieNode();
    
    public void add(String contact){
        
        TrieNode temp = contacts;
        temp.count++;
        
        for(char c : contact.toCharArray()){
            
            int index = c - 'a';
            if(temp.trieNode[index] != null){
                temp = temp.trieNode[index];
            }
            else{
                temp.trieNode[index] = new TrieNode();
                temp = temp.trieNode[index];
            }
            temp.count++; 
        }
        
    }
    
    public int find(String contact){
        
        TrieNode temp = contacts;
        
        for(char c : contact.toCharArray()){
            
            int index = c -'a';
            if(temp.trieNode[index]!=null){
                temp = temp.trieNode[index];
            }
            else{
                return 0;
            }
            
        }
        return temp.count;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numContacts;
        Scanner in = new Scanner(System.in);
        int numOperations = in.nextInt();
        
        Trie trie = new Trie();
        
        for(int i = 0; i <= numOperations; i++){
            String op = in.nextLine();
            
            String spl[] = op.split(" ");
            
            //System.out.println("Input:"+op);
            if(spl[0].equals("add")){
                //System.out.println("Adding"+spl[1]);
                trie.add(spl[1]);
            }
            if(spl[0].equals("find")){
                //System.out.println("finding"+spl[1]);
                numContacts = trie.find(spl[1]);
                System.out.println(numContacts);
            }
        }
    }
}
