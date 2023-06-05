//Time Complexity: O(N)
//Space Compleixty: O(1)

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode oldTail = head;
        int totalNodes = 0;

        if(head == null) return null;
        if(head.next == null) return head;

        int n;
        for(n = 1; oldTail.next != null; n++){
            oldTail = oldTail.next;
        }
        oldTail.next = head;

        //newHead = totalNodes - k;
        //newTail = totalNodes-k - 1; case valid for when k < n
        //replacing k by k%n tto always have no. of rotation places smaller than n : I couldn't think of this edge case myself.
        ListNode newTail = head;
        for(int i = 0; i <  n - (k % n)-1 ; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
