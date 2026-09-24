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
    public boolean hasCycle(ListNode head) {

        /**
        we can use a fast and slow pointer to detect whether there is 
        a cycle. if slow == fast it means that there must have been
        a cycle for them to meet because fast is always ahead of slow

        slow moves up by one each time and fast moves by 2. 

        this is floyds algorithm

        */

        ListNode fp = head;
        ListNode sp = fp;

        while(fp!=null && fp.next!=null){
            sp = sp.next;
            fp = fp.next.next;
    
            if(sp == fp){
                return true;
            }

        }
        return false;


        
    }
}
