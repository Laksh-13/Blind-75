//Optimized sol
//Time Complexity: O(N) because we are accessing the counter arr
//Space Complexity: O(1)? because the couunter's size remians constant i.e. 26 no matter how large N ends being.

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() !=t.length()) return false;

        //becasue both s and t contain only letters from a to z, an array of int 26 is taken

        int[] sCounter = new int[26];
        int[] tCounter = new int[26];

        for(int i=0; i< s.length(); i++){
            sCounter[s.charAt(i) - 'a']++;
            tCounter[t.charAt(i) - 'a']++;
        }

        for(int i=0; i <26; i++){
            if(sCounter[i] != tCounter[i]) return false;
        }
        return true;
    }
}





//Time Compleixty: O(N log N) because of sorting. O(N) cost of comparison but N log N dominates.
//Space Compleixty: O(N) because toCharArray() makes a copy of the string so it costs O(N) extra sapce.

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() !=t.length()) return false;

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        return Arrays.equals(sChars,tChars);
        
    }
}
