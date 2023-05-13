/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.*/

//Time Complexity: O(N), Space Complexity = O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int sumOfRange = range*(range+1)/2;
        int sum =0;
        int missingNumber = 0;

        for (int i:nums){
            sum +=i;
        }

        missingNumber = sumOfRange - sum; 
        return missingNumber;     
    }

}
