//Time: O(N)
//Space: 0(N) [due to left prod and right prod arrays]--->next step: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] leftProd = new int[length];
        int[] rightProd = new int[length];
        int[] output = new int[length];

        leftProd[0] = 1;
        for (int i = 1; i < length; i++) {
            leftProd[i] = nums[i - 1] * leftProd[i - 1];
        }

        rightProd[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            rightProd[i] = nums[i + 1] * rightProd[i + 1];
        }
        
        for (int i = 0; i < length; i++) {
            output[i] = leftProd[i] * rightProd[i];
        }
        return output;
    }
}
