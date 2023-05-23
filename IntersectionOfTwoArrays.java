//Using sets because only unique elements would be added in
//Comparing the values of set 1 and set 2 and adding them in the resultant set which contains all elements of set1 that also belong to set2 or equivalently
//Finally transferring all the values of the set into an array and returning the array because an array output was expected.

//Time Complexity: O(N+M) perhaps?
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i: nums2){
            set2.add(i);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (Integer i: set1){
            if(set2.contains(i)){
                intersectionSet.add(i);
            }
        }

        int[] arr = new int[intersectionSet.size()];
        int j = 0;
         for (Integer i : intersectionSet) {
            arr[j] = i.intValue();
            j++;
        }
        return arr;
    }
}
