//Time Complexity: O(nlogn) because sorting the array costs that much time. Space Complexity: O(1) because I have sorted the same array.

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
