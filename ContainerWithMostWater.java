//Time Complexity: O(N) 
//Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int area = 0;
        int width = 0;

        while(left < right){
            width = Math.min(height[left], height[right]);
            area = width * (right - left);
            maxArea = Math.max(maxArea,area);

            if(width == height[left]) left++;
            else right--;
             
        }

        return maxArea;

        }
        
    }
