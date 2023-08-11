// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

class Solution {
    public int[] countBits(int n) {
         int[] arr = new int[n+1];

         for(int i =0; i<=n ; i++){
             int number = Integer.parseInt(Integer.toBinaryString(i));
             int mask =1;
             int bits =0;
             for(int j =0; j<32; j++){
                 if((number & mask )!=0) bits++;
                 mask <<=1;
             }
             arr[i] = bits;
         }

         return arr;
        
    }
}
