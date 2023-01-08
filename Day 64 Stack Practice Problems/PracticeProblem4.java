/*  Given an array  of  distinct elements. Let  and  be the smallest and the next smallest element in the interval  where .

.

where , are the bitwise operators ,  and  respectively.
Your task is to find the maximum possible value of .

Input Format

First line contains integer .
Second line contains  integers, representing elements of the array .

Constraints


Output Format

Print the value of maximum possible value of .

Sample Input

5
9 6 3 5 2
Sample Output

15
Explanation

Consider the interval  the result will be maximum.

 */

 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for(int i = 0; i < n; i++){
            while(true){
                if(stack.isEmpty()){
                    stack.add(arr[i]);
                    break;
                } else if(stack.peek() < arr[i]){
                    result = Math.max(result, stack.peek() ^ arr[i]);
                    stack.add(arr[i]);
                    break;
                } else{
                    stack.pop();
                }
            }
        }
        stack = new Stack<Integer>();
        
        for(int i = n - 1; i >= 0; i--){
            while(true){
                if(stack.isEmpty()){
                    stack.add(arr[i]);
                    break;
                } else if(stack.peek() < arr[i]){
                    result = Math.max(result, stack.peek() ^ arr[i]);
                    stack.add(arr[i]);
                    break;
                } else{
                    stack.pop();
                }
            }
        }
        
        System.out.println(result);        
    }
}
