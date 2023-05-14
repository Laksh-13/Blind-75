/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.*/
//Time Complexity : O(N), Space Complexity : O(N)
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int ind=n-1; ind>=0; ind--){
            if (digits[ind]==9){
                digits[ind]=0;
            }
            else{
                digits[ind]++;
                return digits;
            }
        }
    //Case when all digits are 9s
    digits = new int[n+1];
    digits[0] = 1;
    return digits;
    }
}
