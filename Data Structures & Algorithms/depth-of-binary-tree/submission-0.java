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

        this represents the BFS solution where we use a queue
        the number of levels = the depth

        we use a queue to which hodls all nodes at that level and we 
        keep going until the queue is empty. 
        */

        if(root == null){
            return 0;
        }

        Queue<TreeNode> nodes = new ArrayDeque<>();

        int level = 0;
        nodes.add(root);

        while (!nodes.isEmpty()){
            int levelSize = nodes.size();
            for(int i=0; i<levelSize;i++){
                TreeNode n = nodes.remove();
    
                if(n.right!=null) nodes.add(n.right);
                if(n.left!=null) nodes.add(n.left);
                
            }

            level+=1;

        }

        return level;
        
    }
}
