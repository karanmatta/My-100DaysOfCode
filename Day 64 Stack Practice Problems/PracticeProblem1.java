/*  Skyline Real Estate Developers is planning to demolish a number of old, unoccupied buildings and construct a shopping mall in their place. Your task is to find the largest solid area in which the mall can be constructed.

There are a number of buildings in a certain two-dimensional landscape. Each building has a height, given by . If you join  adjacent buildings, they will form a solid rectangle of area .

Example

A rectangle of height  and length  can be constructed within the boundaries. The area formed is .

Function Description

Complete the function largestRectangle int the editor below. It should return an integer representing the largest rectangle that can be formed within the bounds of consecutive buildings.

largestRectangle has the following parameter(s):

int h[n]: the building heights
Returns
- long: the area of the largest rectangle that can be formed within the bounds of consecutive buildings

Input Format

The first line contains , the number of buildings.
The second line contains  space-separated integers, each the height of a building.

Constraints

Sample Input

STDIN       Function
-----       --------
5           h[] size n = 5
1 2 3 4 5   h = [1, 2, 3, 4, 5]
Sample Output

9
Explanation

An illustration of the test case follows.
image */

import java.io.*;
import java.util.*;

public class Solution {
    static boolean[] valid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ar = new long[n];


        for(int i=0; i<n; i++)
            ar[i] = sc.nextInt();
        
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, -1); Arrays.fill(right, -1);

        Stack<Integer> st = new Stack<Integer>();

        for(int i=0; i<n; i++){
            while(st.size() > 0){
                if(ar[st.peek()] < ar[i]){
                    left[i] = st.peek();
                    break;
                }
                else
                    st.pop();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1; i>=0; i--){
            while(st.size() > 0){
                if(ar[st.peek()] < ar[i]){
                    right[i] = st.peek();
                    break;
                }
                else
                    st.pop();
            }
            st.push(i);
        }
        // pArray(left);
        // pArray(right);
        long max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            long ans = 0;
            if(left[i] >= 0)
                ans+=ar[i]*(i - left[i] -1);
            else
                ans += ar[i] * i;
            if(right[i] > -1)
                ans+=ar[i]*(right[i] - i -1);
            else
                ans += ar[i] * (n - i-1);
            ans += ar[i];
            if(ans > max)
                max = ans;
            //System.out.println(ans);
        }
        System.out.println(max);
    }

    static void pArray(int[] ar){
        for(int i=0; i<ar.length; i++)
            System.out.print(ar[i] + " ");
        System.out.println();

    }
}