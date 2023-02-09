/*Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique. */

class Solution {
    static void subsequence(int i,int[] arr, List<Integer> lst, List<List<Integer>> res){
        if(res.contains(lst)) return;
        if(i==arr.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        lst.add(arr[i]);
        subsequence(i+1, arr, lst, res);
        lst.remove(lst.size()-1);
        subsequence(i+1, arr, lst, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        subsequence(0, nums, new ArrayList<>(), res);
        return res;
    }
}