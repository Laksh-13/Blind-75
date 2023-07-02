//Time Complexity: dominated by sorting so O(NLogN)
//Space: O(1)

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;

        if(nums.length == 0) return 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i] == nums[i-1]+1) currentStreak +=1;
            }

            else{
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }
        }


        return Math.max(longestStreak, currentStreak);

    }
}
