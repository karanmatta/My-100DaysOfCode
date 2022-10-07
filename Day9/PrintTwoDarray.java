import java.util.*;
 
public class PrintTwoDarray {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();
 
       int[][] numbers = new int[rows][cols];
 
       if(rows==0 && cols==0){
        System.out.println("Array is empty");
        return;  
    }
       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
 
 
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                   System.out.print(+numbers[i][j]+" ");
               }
               System.out.println();
           }
   }
}