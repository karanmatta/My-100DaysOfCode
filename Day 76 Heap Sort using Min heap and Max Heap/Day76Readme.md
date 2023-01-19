Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning. Repeat the same process for the remaining elements.

Heap sort is an in-place algorithm. 
Its typical implementation is not stable, but can be made stable (See this)
Typically 2-3 times slower than well-implemented QuickSort.  The reason for slowness is a lack of locality of reference.
Advantages of heapsort:
Efficiency –  The time required to perform Heap sort increases logarithmically while other algorithms may grow exponentially slower as the number of items to sort increases. This sorting algorithm is very efficient.
Memory Usage – Memory usage is minimal because apart from what is necessary to hold the initial list of items to be sorted, it needs no additional memory space to work
Simplicity –  It is simpler to understand than other equally efficient sorting algorithms because it does not use advanced computer science concepts such as recursion.
Disadvantages of Heap Sort:
Costly: Heap sort is costly.
Unstable: Heat sort is unstable. It might rearrange the relative order.
Efficient: Heap Sort are not very efficient when working with highly complex data. 
Applications of HeapSort:
Heapsort is mainly used in hybrid algorithms like the IntroSort.
Sort a nearly sorted (or K sorted) array 
k largest(or smallest) elements in an array 
The heap sort algorithm has limited uses because Quicksort and Mergesort are better in practice. Nevertheless, the Heap data structure itself is enormously used. See Applications of Heap Data Structure

Recommended Problem
Heap Sort
Heap
Sorting
+2 more
24*7 Innovation Labs
Amazon
+7 more
Solve Problem
Submission count: 68.4K
What is meant by Heapify? 
Heapify is the process of creating a heap data structure from a binary tree represented using an array. It is used to create Min-Heap or Max-heap. Start from the first index of the non-leaf node whose index is given by n/2 – 1. Heapify uses recursion.

Algorithm for Heapify:
heapify(array)
 Root = array[0]

   Largest = largest( array[0] , array [2 * 0 + 1]/ array[2 * 0 + 2])
if(Root != Largest)
 Swap(Root, Largest)