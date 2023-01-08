/* There are a number of plants in a garden. Each of the plants has been treated with some amount of pesticide. After each day, if any plant has more pesticide than the plant on its left, being weaker than the left one, it dies.

You are given the initial values of the pesticide in each of the plants. Determine the number of days after which no plant dies, i.e. the time after which there is no plant with more pesticide content than the plant to its left.

Example

 // pesticide levels

Use a -indexed array. On day , plants  and  die leaving . On day , plant  in  dies leaving . There is no plant with a higher concentration of pesticide than the one to its left, so plants stop dying after day .

Function Description
Complete the function poisonousPlants in the editor below.

poisonousPlants has the following parameter(s):

int p[n]: the pesticide levels in each plant
Returns
- int: the number of days until plants no longer die from pesticide

Input Format

The first line contains an integer , the size of the array .
The next line contains  space-separated integers .

Constraints



Sample Input

7
6 5 8 4 7 10 9
Sample Output

2
Explanation

Initially all plants are alive.

Plants = {(6,1), (5,2), (8,3), (4,4), (7,5), (10,6), (9,7)}

Plants[k] = (i,j) => jth plant has pesticide amount = i.

After the 1st day, 4 plants remain as plants 3, 5, and 6 die.

Plants = {(6,1), (5,2), (4,4), (9,7)}

After the 2nd day, 3 plants survive as plant 7 dies.

Plants = {(6,1), (5,2), (4,4)}

Plants stop dying after the 2nd day.  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] p = new int[n+1];
    int[] surv = new int[n+1];
    int[] index = new int[n+1];
    p[0] = Integer.MAX_VALUE;
    
    for (int i = 1; i <= n; i++)
    {
        p[i] = sc.nextInt();
        index[i] = i;
    }
    
    int min = p[1];
    surv[1] = -1;
    int longest = -1;
    for (int i = 2; i <= n; i++)
    {
        
        if (p[i] > min)
        {
        
        int j = i -1;
        int max = 0;
        while (j >= 1 && surv[j] != -1)
        {
            if (p[j] < p[i])
                break;
            max = Math.max(surv[j] + 1, max);
            j = index[j];
        }
        surv[i] = max;
        index[i] = j;
        longest = Math.max(longest, max);
        
        }
        else
        {
        surv[i] = -1;
        min = p[i];
        }
        
        
    }
    
    
    
    
    System.out.println(longest+1);
    
    }
}
                    