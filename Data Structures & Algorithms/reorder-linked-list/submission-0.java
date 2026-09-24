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
    public void reorderList(ListNode head) {


        /*

        the flow is after the head we take from the last(n-1),
        shift the one already there to the right, then take from 
        the back again etc etc. 

        we can find the middle node. and if we reverse that
        we can then merge it with our list. 
        
        [0123] [456]
        reverse -> [654]
        [0,6,1,5,2,4,3]

        */

        ListNode fp = head;
        ListNode sp = fp;

        while(fp!=null && fp.next!=null){
            sp = sp.next;
            fp = fp.next.next;
        }

        //now lets reverse the list from the end
        //the middle will always be the end of the reorderd list
        //so we can always start reversing from sp.next
        //our second portion needs to be reversed and broken from first


        ListNode prev = null;

        ListNode second = sp.next;
        sp.next = null;// pointer after 3 is equal to null. 

        while(second!=null){
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
        //prev here is our head.
        //we essentially now have [4,5,6]
        //we have second and sp(first part)

        second = prev; //this is the second list
        ListNode first = head;

        while(second!=null){
            ListNode temp = first.next;
            ListNode temp2 = second.next; 

            first.next = second;
            second.next = temp;
            first = temp;
            second = temp2;

        }




        





        
    }
}
