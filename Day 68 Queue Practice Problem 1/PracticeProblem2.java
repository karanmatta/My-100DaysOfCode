/*Suppose there is a circle. There are  petrol pumps on that circle. Petrol pumps are numbered  to  (both inclusive). You have two pieces of information corresponding to each of the petrol pump: (1) the amount of petrol that particular petrol pump will give, and (2) the distance from that petrol pump to the next petrol pump.

Initially, you have a tank of infinite capacity carrying no petrol. You can start the tour at any of the petrol pumps. Calculate the first point from where the truck will be able to complete the circle. Consider that the truck will stop at each of the petrol pumps. The truck will move one kilometer for each litre of the petrol.

Input Format

The first line will contain the value of .
The next  lines will contain a pair of integers each, i.e. the amount of petrol that petrol pump will give and the distance between that petrol pump and the next petrol pump.

Constraints:


Output Format

An integer which will be the smallest index of the petrol pump from which we can start the tour.

Sample Input

3
1 5
10 3
3 4
Sample Output

1
Explanation

We can start the tour from the second petrol pump.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PracticeProblem2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int tank = 0;
        int result = -1;
        for(int loop=0; loop<n; loop++) {
            int net = in.nextInt() - in.nextInt();
            if(tank + net > 0) {
                if(result==-1) {
                    result = loop;
                }
                list.add(net);
                tank += net;
            } else {
                list.clear();
                tank = 0;
                result = -1;
            }
        }
        System.out.println(result);
        in.close();
    }
}
