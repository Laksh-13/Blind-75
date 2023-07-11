//TC: O(N) //SC: O(N)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int capacity = 2 * nums.length;
        int[] numsTwice = new int [capacity];
        int i =0;

        while(i < len){
            numsTwice[i] = nums[i];
            numsTwice[i+len] = nums[i];
            i++;
        }
        return numsTwice;
    }
}
