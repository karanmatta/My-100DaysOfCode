/*Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.


Example 1:

Input:
nums = {2, 8, 5, 4}
Output:
1
Explaination:
swap 8 with 4.
Example 2:

Input:
nums = {10, 19, 6, 3, 5}
Output:
2
Explaination:
swap 10 with 3 and swap 19 with 5.

Your Task:
You do not need to read input or print anything. Your task is to complete the function minSwaps() which takes the nums as input parameter and returns an integer denoting the minimum number of swaps required to sort the array. If the array is already sorted, return 0. 


Expected Time Complexity: O(nlogn)
Expected Auxiliary Space: O(n)


Constraints:
1 ≤ n ≤ 105
1 ≤ numsi ≤ 106 */

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(nums[i] != arr[i])
                count++;
            int j = arr[i];
            int idx = index(j, nums);
            
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
        return count;
    }
    public int index(int j, int[] nums) {
        int i;
        for(i=0; i<nums.length; i++) {
            if(nums[i] == j)
                break;
        }
        return i;
    }
}