import java.util.*;
 
public class TwoDarrray {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();
 
       int[][] numbers = new int[rows][cols];
 
       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
 
 //Output
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                   System.out.print(numbers[i][j]+" ");// Har ek element pr jaanege aur usk cell print krddenge
               }
               System.out.println();
           }
   }
}
