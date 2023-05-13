/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.*/

//Time Complexity: O(N), Space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int uniqueDigit = 0;
        for (int i:nums){
            uniqueDigit ^= i;
        }
        return uniqueDigit;
    }
}
