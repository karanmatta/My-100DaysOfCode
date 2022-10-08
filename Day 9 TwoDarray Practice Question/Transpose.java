import java.util.*;
 
public class Transpose {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      if(n==0 && m==0){
         System.out.println("Array is empty");
         return;
        }
 
      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }
 
      System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
   }
}
/*
 * Transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, 
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
if rows==0 && colums==0
print array is empty



*/