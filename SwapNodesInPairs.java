//Time Compleixty: O(N)
//Space: O(N) stack space for recursion

class Solution {
    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }
        ListNode firstNode = head;
        ListNode secondNode = head.next;

        firstNode.next  = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }
}
