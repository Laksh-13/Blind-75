//Time complexity: iterating over word1 and word2 once so O(M+N) whereee M and N are lenghts of word1 and wordr resp
//Space Complexity: O(M+N)?
class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder output = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                output.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                output.append(word2.charAt(j++));
            }
        }

        return output.toString();
    }
        
}
