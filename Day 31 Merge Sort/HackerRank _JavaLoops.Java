//Task 
//Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//Input Format
//
//A single integer N
//
//Constraints
//  N >= 2 AND N <=20

//Sample Input
//
//2

//Sample Output
//
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <=10; i++)
        {
            System.out.println(N + " x "+i+" = "+i*N);
        }
    }
}

//Test Case 1
//2
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20

//Test Case 2
//3
//3 x 1 = 3
//3 x 2 = 6
//3 x 3 = 9
//3 x 4 = 12
//3 x 5 = 15
//3 x 6 = 18
//3 x 7 = 21
//3 x 8 = 24
//3 x 9 = 27
//3 x 10 = 30

//Test Case 3
//0
//0 x 1 = 0
//0 x 2 = 0
//0 x 3 = 0
//0 x 4 = 0
//0 x 5 = 0
//0 x 6 = 0
//0 x 7 = 0
//0 x 8 = 0
//0 x 9 = 0
//0 x 10 = 0



