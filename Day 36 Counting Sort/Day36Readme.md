Counting Sort

Counting sort is a sorting technique based on keys between a specific range. It works by counting the number of objects having distinct key values (kind of hashing). Then doing some arithmetic to calculate the position of each object in the output sequence.

For example, consider the data set {1, 4, 1, 2, 7, 5, 2} and the object to be sorted is key value. If the maximum value of key value is 7, then count array of size 8 is needed to store the count of each unique object. Here count array is

count: 0 1 2 3 4 5 6 7

arr: 1 4 1 2 7 5 2

For simplicity, consider the data set 1, 4, 1, 2, 7, 5, 2 and key value 0 to 9. Let us understand count sorting through an example.

Step 1: Take a count array to store the count of each unique object.

count: 0 1 2 3 4 5 6 7

arr: 1 4 1 2 7 5 2

Step 2: Modify the count array such that each element at each index stores the sum of previous counts. This step gives the cumulative count.

count: 0 1 3 5 5 5 5 5

arr: 1 4 1 2 7 5 2

Step 3: Output each object from the input sequence followed by decreasing its count by 1.

Step 4: Place the object in output sequence.

Step 5: Print the output sequence.

Output: 1 1 2 2 4 5 7

Time Complexity: O(n+k) where n is the number of elements in input array and k is the range of input.

Auxiliary Space: O(n+k)

Applications of Counting Sort

Counting sort is useful when:

The range of input data is not significantly greater than the number of objects to be sorted. Consider the situation where the input sequence is between range 1 to 10K and the data is 10, 5, 10K, 5K.

Counting sort uses key value as index in count array. So it should not be used when the elements to be sorted are in the form of a string because we use key value as index.

Counting sort can be extended to work for negative inputs also.

Counting sort is often used as a sub-routine to another sorting algorithm like radix sort.

Counting sort is preferred over comparison based sorting algorithms like quick sort and merge sort when the range of input data is not significantly greater than the number of objects to be sorted. Counting sort uses key value as index in count array. So it should not be used when the elements to be sorted are in the form of a string because we use key value as index.

