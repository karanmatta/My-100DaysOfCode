import java.util.*;
 
public class SearchinTwoDarray {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows");
       int rows = sc.nextInt();
         System.out.println("Enter the number of columns");
       int cols = sc.nextInt();
 
       int[][] numbers = new int[rows][cols];
       if(rows==0 && cols==0){
        System.out.println("Array is empty");
        return ;}
 
       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
              
           }
           

       }
       System.out.println("Enter the number to be searched");
          int x= sc.nextInt();
 //Output
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                   if(numbers[i][j] ==x){
                    System.out.println("x is found at location("+i+","+j+")");
                   }else{
                    System.out.println("x is not there");
                   }
               }
               System.out.println();
           }
   }
}
/*Test case 1:- If rows && column==0(rows==0 && cols==0)
Output:- Array is empty

Test case 2:- If element to be searched is found
Expected Output:-x is found at location _
Example :- 1 2
           3 4

           Element to be searched is 3
           Output:-x is found at location(1,1)

Test case 3:If element to be searched is not found
Expected Output:-x is found at location _
Example :- 1 2
           3 4

           Element to be searched is 8
           Output:-x is not in the array


 * 
 * 
 * 
 * 
 * 
 */