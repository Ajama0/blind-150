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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        /**

        what we can do is create a Dummy node which starts our list
        and the tail is what allows us to advance, otherwise
        we wont be able to return the list if we advance the dummy

        compare l1 and l2 values which ever is smaller set it to
        tail.next and advance that
        later make sure you advance tail to cos initially before
        first insert it is at 0

        and then if one of them is null then we can just 
        set tail.next = one that isnt null
        */

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1!=null & list2!=null){
            //compare the values in each list

            if(list1.val<list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        //what if one of the lists is null and the other contains values
        //because its sorted we can just add to it

        if(list1==null){
            tail.next = list2;
        }else{
            tail.next = list1;
        }

        return dummy.next;
    

    


        
    }
}