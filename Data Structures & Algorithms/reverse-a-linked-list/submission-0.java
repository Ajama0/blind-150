/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) 
        { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode reverseList(ListNode head) {

        /**

        0->1->2->3
        to
        3->2->1->0

        we need to set the prev to null, the current is the head
        the current.next becomes prev 

        then prev becomes the current and then current = next
        current.next = prev
        */

    

        ListNode current = head;
        ListNode prev = null;

        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

        

        

        





        
    }
}
