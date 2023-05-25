//Time Complexity: O(3N)-->O(N)
//Space Complexity: O(2N) -->O(N) as I am using 2 lists. The question asks for O(1) Space complexity which is a criteria I am not satisfying.Need to impr
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;

        List<Integer> list = new ArrayList<>();
        List<Integer> revList = new ArrayList<>();

        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }

        for(int i=list.size()-1; i>=0; i--){
            revList.add(list.get(i));
        }

        for (int i=0; i<=list.size()-1;i++){
            if(list.get(i)!=revList.get(i)) return false;
        }
     return true;
    }
}


//Understod the execution of this one because knew it in theory but was struggling to execute it. 3 attemtps and through
//Algo for my revision:1. Find the end of the first half. 2. Reverse the second half. 3. Determine whether palindrome or not. 4. Return result.
//Time Complexity: Finding the middle is O(N), reversing a list in place is O(N), and then comparing the 2 resulting Linked Lists is also O(N)--> O(N)
//Space Complexiy: O(1) because I am only changin pointers for the nodes which is a memory that is already allocated.

class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head== null) return true;

        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = revList(firstHalfEnd.next);

        ListNode p1=head;
        ListNode p2 = secondHalfStart;
        boolean result = true;

        while(result && p2!=null){
            if(p1.val!=p2.val) return false;

            p1= p1.next;
            p2= p2.next;
        }

        return result;
    }

    private ListNode revList (ListNode head){

            ListNode prev = null;
            ListNode curr = head;

            while(curr!=null){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
           return prev;
        }

    private ListNode endOfFirstHalf(ListNode head){
            ListNode slow= head;
            ListNode fast= head;

            while(fast.next !=null && fast.next.next !=null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
        
}
