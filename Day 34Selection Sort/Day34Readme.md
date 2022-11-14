Selction Sort
Selection sort is a sorting algorithm, specifically an in-place comparison sort. It has O(n2) time complexity, making it inefficient on large lists, and generally performs worse than the similar insertion sort. Selection sort is noted for its simplicity, and it has performance advantages over more complicated algorithms in certain situations, particularly where auxiliary memory is limited.

The algorithm divides the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.

Example
To sort an array of integers in ascending order:

Assume the array is [5, 3, 6, 2, 10]

Find the smallest element in the array, 2, and exchange it with the first element, 5.

The array is now [2, 3, 6, 5, 10]

Find the second smallest element in the array, 3, and exchange it with the second element, 3.

The array is now [2, 3, 6, 5, 10]

Find the third smallest element in the array, 5, and exchange it with the third element, 6.

The array is now [2, 3, 5, 6, 10]

Find the fourth smallest element in the array, 6, and exchange it with the fourth element, 6.

The array is now [2, 3, 5, 6, 10]

The array is now sorted.

Pseudocode

procedure selectionSort( A : array of items )
   n = length(A)
   for i = 1 to n - 1
      /* set current element as minimum*/
      min = i    
      /* check the element to be minimum */         
      for j = i+1 to n 
         if A[j] < A[min] then
            min = j;
         end if
      end for
      /* swap the minimum element with the current element*/         
      if indexMin != i  then
         swap A[i] and A[min]
      end if
   end for
end procedure

Complexity
Worst case performance	O(n2)
Best case performance	O(n2)
Average case performance	O(n2)
Worst case space complexity	O(1) auxiliary

