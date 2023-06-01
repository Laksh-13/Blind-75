//Time Compleixty: O(N)
//Space: O(N) stack space for recursion
//Didin't do it on my own, took help from other solutions

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
