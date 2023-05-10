//Time Complexity: O(N^2), Space Complexity: O(1)
class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int i =0; i<nums.length; i++){
            if(countDigits(nums[i])%2 ==0){
                evenCount++;
            }
        }
        return evenCount;
    }
    
    public int countDigits(int num){
        int count = 0;
        while (num!=0){
            int temp = num %10;
            num = num/10;
            count ++;
        }
        return count;
    
    }
}

//Alternate Solution
//Time Complexity: O(N), Space Complexity: O(1)

class Solution2 {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int i =0; i<nums.length; i++){
            if(Integer.toString(nums[i]).length()%2 ==0){
                evenCount++;
            }
        }
        return evenCount;
    }
    
}
