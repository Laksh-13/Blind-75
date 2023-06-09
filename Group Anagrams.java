//Time complexity: O(N*K*logK) because we need to traverse through each string and sort all strings where N->lenght of the i/p arr and K is the max lenght of a string in arr

//Space Compleixty: O(N*K) storing a hashtable to store N strings of lenght K

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = String.valueOf(chars);
            groups.putIfAbsent(key,new ArrayList<>());
            groups.get(key).add(s);
        }

        return new ArrayList<>(groups.values());
        
    }
}
