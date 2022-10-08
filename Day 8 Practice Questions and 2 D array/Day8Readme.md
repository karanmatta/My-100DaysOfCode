PROBLEM 1:-Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.

LOGIC:-If the length of the array is zero or one, then array is empty and the array is sorted.

Start looping from the first element.

Compare every two elements.

a. If the two elements are sorted, move to the next element, i.e., i+1.

b. Otherwise it will return false, which indicates that the array is not sorted.

The loop will eventually come to the end of the array when all the array elements are in sorted order.


 
 Test Cases:-
 
 *Test case 1: If size os array =0
Expected Output:- Array is empty
 * 
  Test Case 2:- If array is sorted and has no repeated values 
 * Input : 20 21 45 89 89 90
Output : The array is sorted in ascending order

Test Case 3:- If array is sorted and has repeated values 
Input : 20 20 45 89 89 90
Output : The array is sorted in ascending order

Test Case 3:-If array is Not sorted 
Input : 20 20 78 98 99 97
Output : The array is not sorted in ascending order


PROBLEM 2:-Searching for an element x in a matrix.
LOGIC:-A Simple Solution is to one by one compare x with every element of the matrix. If matches, then return position. If we reach the end, return False. The time complexity of this solution is O(n x m).

Test Cases:-
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


