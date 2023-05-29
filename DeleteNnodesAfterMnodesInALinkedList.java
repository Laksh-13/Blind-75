//Time Complexity: O(N) because we are traversing the list only once.
//Space Complexity: O(1)

class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {

        ListNode curr = head;
        ListNode mnode = head;
        while (curr != null) {           
            int mCount = m, nCount = n;
         
            while (curr != null && mCount != 0) {
                mnode = curr;
                curr = curr.next;
                mCount--;
            }
            
            while (curr != null && nCount != 0) {
                curr = curr.next;
                nCount--;
            }
            
            mnode.next = curr;
        }
        return head;
    }
}
