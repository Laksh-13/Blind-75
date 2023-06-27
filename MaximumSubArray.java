//Time Compleixty: O(N)
//Space Compexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int currSum = 0;

        for(int num:nums){
            currSum += num;
            maxSub = Math.max(currSum,maxSub);

            if(currSum<0) currSum = 0;
        }

        return maxSub;
        
    }
}
