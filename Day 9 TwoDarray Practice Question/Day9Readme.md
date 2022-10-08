Problem1:-Print the spiral order matrix as output for a given matrix of numbers. 
Example:Input: { {1,   2,   3,   4,  5,   6},
           {7,   8,   9,  10,  11,  12},
          {13,  14,  15, 16,  17,  18}}

Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
Explanation: The output is matrix in spiral format.

Logic:-* 1. We will need 4 variables:
a. row_start - initialized with 0.
b. row_end - initialized with n-1.
c. column_start - initialized with 0.
d. column_end - initialized with m-1.
2. First of all, we will traverse in the row row_start from column_start
to column_end and we will increase the row_start with 1 as we have
traversed the starting row.
3. Then we will traverse in the column column_end from row_start to
row_end and decrease the column_end by 1.
4. Then we will traverse in the row row_end from column_end to
column_start and decrease the row_end by 1.
5. Then we will traverse in the column column_start from row_end to
row_start and increase the column_start by 1.
6. We will do the above steps from 2 to 5 until row_start <= row_end
and column_start <= column_end.

Test Cases:-Input: { {1,   2,   3,   4,  5,   6},
           {7,   8,   9,  10,  11,  12},
          {13,  14,  15, 16,  17,  18}}

Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
Explanation: The output is matrix in spiral format.

Test case 2:- if rows ==0 and columns==0
Output: Array is empty




Problem2:-For a given matrix of N x M, print its transpose.

Transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, 
transpose of A[N][M] is obtained by changing A[i][j] to A[j][i].

Logic:-Run a nested loop using two integer pointers i and j for 0 <= i < N and 0 <= j < M
Set B[i][j] equal to A[j][i]

Sample Input 1:
1 2 3
4 5 6
7 8 9

Sample Output 1:
1 4 7
2 5 8 Rows and columns are interchanged
3 6 9

Sample Input 2:
sample Output2:
if rows==0 && colums==0
print array is empty