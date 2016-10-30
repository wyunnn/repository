package package1;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Sol104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        else{
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return ( l > r ? l : r)+1;
        }
        
    }
}