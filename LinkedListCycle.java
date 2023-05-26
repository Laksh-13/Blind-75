//Space Compleixty: O(N)
//Time Complexity: if the List is non cyclic then O(N). In the case of a cyclic list, it takes the fast node an entire cycle to meet the slow node. Assume cyclic length is 'K'(Maybe O(N+K)) 


public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) return true;
        }

        return false;
    
        
    }
}
