//Time Complexity: O(max(m,n)) where m, n are lengths of the two ll resp.
//Sapce Complexity: O(max(m.n)+1) to account for the carry.

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode curr = l3;
        int carry = 0;
        int sum = 0;
        
        while(l1!=null || l2!=null || carry!=0){
            int x = (l1!=null)?l1.val:0;
            int y = (l2!=null)?l2.val:0;
            sum = x + y + carry;
            carry =sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return l3.next;
    }
}
