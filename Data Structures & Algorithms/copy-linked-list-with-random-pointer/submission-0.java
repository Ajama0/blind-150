/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        /**

        for this question we are given a ll, each node can point to
        a random other node in the list and a next

        we essentially need to create a copy of how they are linked
        so we first do a single pass where we set the copy to its val

        and we create a map that maps old to new

        so we map (curr).next to whatever (curr.next) is
        and the value at (curr.next) will allow us to point it that way
        same thing for random too

        this is a o(n) time complexity and o(n) space witht the map
        */

        Map<Node,Node> map = new HashMap<>();


        Node curr = head;

        while(curr!=null){
            Node copy = new Node(curr.val);
            map.put(curr,copy);
            curr = curr.next;
        }

        //we create another pass where we set each copy next 
        //to whatever the curr.next was pointing to. 
        //reset the head
        curr = head;
        while(curr!=null){
            //get the next pointer for the copy
            //and then set it to the copy, from wherever the curr.next
            //was pointing to
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;

        }


        return map.get(head);
    }


}
