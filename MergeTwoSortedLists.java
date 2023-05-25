//Time Complexity: O(N+M)
//Space Complexity: O(1)

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {  
        ListNode head = new ListNode();
        ListNode tail = head;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

    if(list1==null) tail.next = list2;
    else tail.next = list1;

    head = head.next; //because the head is still pointing to the empty list node. I can return head.next as well instead of doing this step.
    return head;
       
    }
}
