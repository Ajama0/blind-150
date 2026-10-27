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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if(sameTree(root,subRoot)){
            //if same root, then sameTree walks the children 
            //if its true it returns true. 
            return true;
        }
        
        //if we exhaust the left as a starting point and find nothing
        //lets search the right as the starting point
        //then after the out come will be dependent on if a side has the
        //subroot, 
        //each call is searching for a new starting point against subroot

        return isSubtree(root.left, subRoot) || 
        isSubtree(root.right, subRoot);
         


    }


    private boolean sameTree(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }

        
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val != subRoot.val){
          return false;
        }

        //this case means they are equal so lets explore the children
        //so when we see that 2 and 2 are equal we could have a subtre
        return sameTree(root.left, subRoot.left) && 
        sameTree(root.right, subRoot.right);


    }
}
