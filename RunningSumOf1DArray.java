//Starting the Leetcode 75 Challenge
//TC: O(N), SC: O(1)
class Solution {
    public int[] runningSum(int[] nums) {
        int [] result = new int[nums.length];
        result[0] = nums[0];
        for (int i=1;i < nums.length; i++){
            result[i] = nums[i]+result[i-1];
        }
        return result;
    }
}