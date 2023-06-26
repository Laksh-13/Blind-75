//Time Compeixty: O(N)
//Space Complexity: O(1)
class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();//trimming leading and trailing spaces.
        int len = s.length()-1;
        int wordCount = 0;

        while(len>=0 && s.charAt(len)!= ' '){
            len--;
            wordCount++;
        }

        return wordCount;
        
    }
}
