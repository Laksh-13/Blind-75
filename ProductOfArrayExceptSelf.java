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


//Space: O(1) considering the o/p array does not contribute to the space complexity. I m updating the right prod array on the fly
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] output = new int[length]; //would contain the prod of all elements to the right

        output[0] = 1;
        for (int i = 1; i < length; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }

        int rightProd = 1;
        for (int i = length - 1; i >= 0; i--) {
            output[i] = output[i] * rightProd;
            rightProd *= nums[i];
        }
        
        return output;
    }
}
