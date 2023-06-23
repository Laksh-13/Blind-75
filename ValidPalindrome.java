                                     //Solution 2
//Time Compleixty : O(N), Space Compleixty: O(1)
public boolean isPalindrome(String s) {
        
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        
        Character start = s.charAt(i);
        Character end = s.charAt(j);
        
        if (!Character.isLetterOrDigit(start)) {
            i++;
            continue;
        }
        
        if (!Character.isLetterOrDigit(end)) {
            j--;
            continue;
        }
        
        if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
            return false;
        }
        
        i++;
        j--;    
    }
    
    return true;
}




                                    //Solution 1
//This one passed testcases but failed to submit so not sure what went wrong.


//Time Complexity: O(N)
//Space: O(1)
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z]+", "");

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if (s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;

    }
}
