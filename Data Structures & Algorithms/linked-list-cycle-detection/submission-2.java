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
        a tail is where the nodes next points to null,
        in a cycle there doesnt exist a node whos next is null

        what if we walk the list and check if we've seen this value 
        before using a hashset. this is o(n) and o(n)

        an alternative is using floyds algorithm.

        */ 

        Set<ListNode> vals = new HashSet<>();
        ListNode current = head;

        while(current!=null){
            //if i cant add this element to the set, 
            if(!vals.add(current)){
                return true;
            }
            current = current.next;
            
        }

        return false;






        
    }



}
