//Time Complexity: O(N), Space Complexity: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int count = nums.length;
        int i=0;
        int j= i+1;

        while(i<j && j<=count-1){
            if(nums[i]!=0){
                i++;
                j++;
            }
            else if(nums[j]==0){
                j++;
            }
            else if(nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j++;

            }
        }

    }
        
}
        
