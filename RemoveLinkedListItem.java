//Time Compleoxty: O(N)
//Space Complexity: O(1)

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode current = head;
        
        while(current!=null){
            if(current.val==val){
                prev.next = current.next;
            }else {
                prev = current;
            }
            current= current.next;

        }

        return temp.next;
    }
}
