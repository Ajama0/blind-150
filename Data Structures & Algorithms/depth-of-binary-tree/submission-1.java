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
    public int maxDepth(TreeNode root) {

        /**
        this is the recusive solution, which uses a post order traversl
        we traverse all the way left, first call dfs(2) 
        so dfs(2) means maxDepth(2.left), maxDepth(2.right) returns 0,0

        so 1 + max(0,0) returns 1. 

        we now go to dfs(3) which returns 1 + max(1,0) returns 2

        and then dfs(1) is 1 + max (1,2) = 3
        */
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

        
        
    }
}
