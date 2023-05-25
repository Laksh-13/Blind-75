//Time Complexity: O(3N)-->O(N)
//Space Complexity: O(2N) -->O(N) as I am using 2 lists. The question asks for O(1) Space complexity which is a criteria I am not satisfying.
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;

        List<Integer> list = new ArrayList<>();
        List<Integer> revList = new ArrayList<>();

        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }

        for(int i=list.size()-1; i>=0; i--){
            revList.add(list.get(i));
        }

        for (int i=0; i<=list.size()-1;i++){
            if(list.get(i)!=revList.get(i)) return false;
        }
     return true;
    }
}
