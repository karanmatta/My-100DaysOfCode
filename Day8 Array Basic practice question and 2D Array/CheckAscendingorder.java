import java.util.*;
 
public class CheckAscendingorder {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


 
      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }
      if(size==0){
        System.out.println("Array is empty");
        
      }

      boolean isAscending = true;
     
       for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }
 
       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }
      
   }
}
/*Test case 1: If size os array =0
Expected Output:- Array is empty
 * 
  Test Case 2:- If array is sorted and has no repeated values 
 * Input : 20 21 45 89 89 90
Output : The array is sorted in ascending order

Test Case 2:- If array is sorted and has repeated values 
Input : 20 20 45 89 89 90
Output : The array is sorted in ascending order

Test Case 3:-If array is Not sorted 
Input : 20 20 78 98 99 97
Output : The array is not sorted in ascending order


Logic:-
If the length of the array is zero or one, then the array is sorted.

Start looping from the first element.

Compare every two elements.

a. If the two elements are sorted, move to the next element, i.e., i+1.

b. Otherwise it will return false, which indicates that the array is not sorted.

The loop will eventually come to the end of the array when all the array elements are in sorted order.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
