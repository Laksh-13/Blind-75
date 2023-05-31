//Time Compleixty: O(N)
//Space Complexity: O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr = head;
        int totalNodes = 0;

        while(curr!=null){
            totalNodes++;
            curr = curr.next;
        }
        if(totalNodes == n){
            return head.next;
        }

        int nodeBefore = totalNodes - n -1;
        curr = head;

        for(int i =0;i < nodeBefore; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
        
    }
}
