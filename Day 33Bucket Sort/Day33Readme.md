Bucket Sort
Bucket sort is a sorting algorithm that works by distributing the elements of an array into a number of buckets. Each bucket is then sorted individually, either using a different sorting algorithm, or by recursively applying the bucket sorting algorithm. It is a distribution sort, and is a cousin of radix sort in the most to least significant digit flavour.

Bucket sort is a generalization of pigeonhole sort. Bucket sort can be implemented with comparisons and therefore can also be considered a comparison sort algorithm. The computational complexity estimates involve the number of buckets.


Complexity
The average and worst case complexity of bucket sort is O(n+k), where n is the number of elements to be sorted and k is the number of buckets. The average case is also O(n+k) because the algorithm's performance does not depend on the input distribution. The best case complexity is O(n+k) when the input is uniformly distributed.

The space complexity of bucket sort is O(n+k), because the algorithm needs to store the elements in the buckets and the buckets themselves.

Bucket sort is a stable sort, and can be made to be in-place. The in-place variant of bucket sort is called block sort.

Bucket sort is used in external sorting when the data being sorted is too large to fit into main memory. Bucket sort can be implemented with comparisons and therefore can also be considered a comparison sort algorithm. The computational complexity estimates involve the number of buckets.


Algorithm
Bucket sort works as follows:

Set up an array of initially empty "buckets".
Scatter: Go over the original array, putting each object in its bucket.
Sort each non-empty bucket.
Gather: Visit the buckets in order and put all elements back into the original array.

The following pseudocode implements bucket sort for an array of numbers in the range 0 to 1. The numbers are scaled up by multiplying them by n, where n is the number of buckets. The numbers are then placed in the appropriate bucket. Each bucket is then sorted using insertion sort. Finally, the numbers are gathered from the buckets and placed back into the original array.

function bucketSort(array, bucketCount) {
    if (array.length === 0) {
        return array;
    }

    // Determine minimum and maximum values
    var i;
    var minValue = array[0];
    var maxValue = array[0];
    for (i = 1; i < array.length; i++) {
        if (array[i] < minValue) {
            minValue = array[i];
        } else if (array[i] > maxValue) {
            maxValue = array[i];
        }
    }

    // Initialise buckets
    var DEFAULT_BUCKET_SIZE = 5;
    bucketCount = bucketCount || Math.floor(array.length / DEFAULT_BUCKET_SIZE);
    var buckets = new Array(bucketCount);
    for (i = 0; i < buckets.length; i++) {
        buckets[i] = [];
    }

    // Distribute input array values into buckets
    for (i = 0; i < array.length; i++) {
        buckets[Math.floor((array[i] - minValue) / (maxValue - minValue) * (bucketCount - 1))].push(array[i]);
    }

    array.length = 0;
    for (i = 0; i < buckets.length; i++) {
        insertionSort(buckets[i]); // Or another sorting method
        for (var j = 0; j < buckets[i].length; j++) {
            array.push(buckets[i][j]);
        }
    }

    return array;
}

function insertionSort(array) {
    var length = array.length;
    for (var i = 1; i < length; i++) {
        var temp = array[i];
        for (var j = i - 1; j >= 0 && array[j] > temp; j--) {
            array[j + 1] = array[j];
        }
        array[j + 1] = temp;
    }
    return array;
}

Bucket sort is a comparison sort, and the complexity of the comparison sort used to sort each bucket can be significant. For example, if insertion sort is used to sort each bucket, and the input is uniformly distributed, then the complexity of bucket sort is O(n). However, if the input is not uniformly distributed, then the complexity of bucket sort is O(n2). In the worst case, the complexity of bucket sort is O(n2).

Bucket sort can be made stable by sorting the elements in each bucket in reverse order. This is because the last element in each bucket will be the first element inserted into the bucket, and therefore will be the first element to be inserted into the sorted array. This is because the elements are inserted into the buckets in the order that they appear in the input array.

Bucket sort can be made in-place by using a linked list to store the elements in each bucket. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order in the linked list. This means that the elements in each bucket do not need to be copied into a temporary array before being inserted into the sorted array. This is because the elements in each bucket are sorted, and therefore can be stored in the same order


