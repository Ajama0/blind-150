/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


  /*  
        at each node the diameter is equal to the height of the left
        subtree + right subtree, plus the 2 nodes pointing to the children

        the max height of each node is equal to 1 + max(left,right)

        in this example we start at node 5
        height of node 5  = 1 + max(-1,-1) = 0
        the diameter = l + r + 2 = -1 + -1 + 2 = 0

        then we go to node 3 and it has height = 1 + max(0,-1) = 1
        the diameter at node 3 = l + r + 2 = 0 + -1 + 2 = 1

        the max diameter is now 1 

        so for 2 height = 1 + max(1,0) = 2 
        diameter = l + r + 2 = 1 + 0 + 2 = 3

        now max diameter is 3

        we go to node 1 

        node 1 height = 1 + max(-1,2 ) = 3
        diameter at node 1 = -1 + 2 + 2 = 3 

        so the maximum diameter is equal to 3 

        */

class Solution {

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfsHeight(root);
        return diameter;
    
    }

    private int dfsHeight(TreeNode root){
        if(root == null){
            return -1;
        }

        var left = dfsHeight(root.left);
        var right = dfsHeight(root.right);

        //diameter
        diameter = Math.max(diameter,2 + left+right);

        return 1 + Math.max(left,right);

    }
}
