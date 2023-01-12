/*Consider an -integer sequence, . We perform a query on  by using an integer, , to calculate the result of the following expression:

In other words, if we let , then you need to calculate .

Given  and  queries, return a list of answers to each query.

Example


The first query uses all of the subarrays of length : . The maxima of the subarrays are . The minimum of these is .

The second query uses all of the subarrays of length : . The maxima of the subarrays are . The minimum of these is .

Return .

Function Description

Complete the solve function below.

solve has the following parameter(s):

int arr[n]: an array of integers
int queries[q]: the lengths of subarrays to query
Returns

int[q]: the answers to each query
Input Format

The first line consists of two space-separated integers,  and .
The second line consists of  space-separated integers, the elements of .
Each of the  subsequent lines contains a single integer denoting the value of  for that query.

Constraints

Sample Input 0

5 5
33 11 44 11 55
1
2
3
4
5
Sample Output 0

11
33
44
44
55
Explanation 0

For , the answer is

.
For , the answer is
.
For , the answer is
.
For , the answer is
.
For , the answer is
.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY queries
     */

    public static List<Integer> solve(List<Integer> arr, List<Integer> queries) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> queries = IntStream.range(0, q).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.solve(arr, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}