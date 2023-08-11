// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
//TC: O(N log N)
class Solution {
    public int[] countBits(int n) {
         int[] arr = new int[n+1];
         for(int i =0; i<=n ; i++){
             int bits = 0;
             int num = i;
             while(num>0){
                 bits += num % 2;
                 num = num/2;
             }

             arr[i] = bits;        
    }
 
    return arr;
   }
}
