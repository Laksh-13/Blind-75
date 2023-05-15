//Time Complexity: O(N), Space Complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!= null){
            ListNode temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr = temp;

        }
        return prev;
        
    }
}
