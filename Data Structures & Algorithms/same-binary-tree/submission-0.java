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

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }   

        //if this executes it means that one of them is non null
        if(p == null || q== null){
            return false;
        }

        if(p.val != q.val){
            return false;

        }

        //they will both return true to the caller if same tree
        //then we can compare them against each other

        //both left and right subtrees will return true 
        return isSameTree(p.left,q.left) && 
        isSameTree(p.right,q.right);
        
        

    }
}
