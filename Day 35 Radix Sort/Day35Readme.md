Radix Sort
Radix sort is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys by the individual digits which share the same significant position and value. A positional notation is required, but because integers can represent strings of characters (e.g., names or dates) and specially formatted floating point numbers, radix sort is not limited to integers.

Algorithm

The algorithm for radix sort is as follows:

    function radixSort(list)
        bucket ← new array of 10 buckets for 0-9
        for i = 0 to length of list
            bucket[digit(list[i],i)].append(list[i])
        concatenate buckets and return

    function digit(number, base)
        return (number/base) mod 10

The algorithm is based on the following assumptions:

    1. The list is an array of integers.
    2. The integers are in base 10.
    3. The integers have the same number of digits.

The algorithm works as follows:

    1. Create 10 buckets for each digit (0-9).
    2. Iterate through the list, placing each element into the correct bucket based on the current digit.
    3. Replace the list with the concatenation of the buckets.
    4. Repeat steps 2 and 3 for each digit, starting with the least significant digit.

The algorithm is stable, meaning that the relative order of elements with the same value is preserved. This is because the algorithm places each element into a bucket based on the current digit, and preserves the order of elements within each bucket.

The algorithm is in-place, meaning that it only allocates additional memory that is independent of the number of elements being sorted. This is because the algorithm uses a fixed number of buckets, and each bucket is emptied after each iteration.

The algorithm is not adaptive, meaning that the algorithm's performance is not affected by the order of the input data. This is because the algorithm places each element into a bucket based on the current digit, and does not make any assumptions about the order of the elements within each bucket.

The algorithm is not online, meaning that the algorithm's performance is not affected by the order in which the elements are presented. This is because the algorithm places each element into a bucket based on the current digit, and does not make any assumptions about the order of the elements within each bucket.

The algorithm is not recursive, meaning that the algorithm does not make any recursive calls. This is because the algorithm iterates through the list, placing each element into a bucket based on the current digit, and does not make any recursive calls.

The algorithm is not stable, meaning that the algorithm's performance is not affected by the order of the input data. This is because the algorithm places each element into a bucket based on the current digit, and does not make any assumptions about the order of the elements within each bucket.


Complexity

The time complexity of radix sort is O(d(n+k)), where d is the length of the longest number, n is the size of the list, and k is the base of the number system used. The space complexity of radix sort is O(n+k), where n is the size of the list and k is the base of the number system used.

