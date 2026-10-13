/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        /*
        we can move n+1 steps which means the slow will always land
        one one before the nth node

        we need a dummy just in case we need to remove the head itself
        like in example 2

        fast always advances n+1 steps and then after advance them both
        at the same rate. 

        dummy -> 1,2,3,4] n = 2

        if fast is advanced n times then when fast reaches the end
        (fast.next = null) then slow will be at 2 which is one before
        the nth node that we need to unlink/remove

        we can iterate fast n times to get it advanced

        */

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i<n; i++){
            fast = fast.next;
        }

        while(fast.next!= null && fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        //at this point we need to unlink the node
        // slow represents the prev of the nth node

        slow.next = slow.next.next;

        return dummy.next;



    }
}
