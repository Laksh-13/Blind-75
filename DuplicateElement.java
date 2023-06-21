//Time Complexity: O(N) as we do search and insert n times which is const time operation
//Space Complexity: O(N)

class Solution{
public boolean containsDuplicate(int[] nums) {
    Set<Integer> unique = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
        if (unique.contains(nums[i])) return true;
        unique.add(nums[i]);
    }
    return false;
}
}
