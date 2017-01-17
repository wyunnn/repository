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
public class Sol110 {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    
    private int height(TreeNode node){
        // return height
        if(node == null)    return 0;
        
        int l = height(node.left);
        int r = height(node.right);
        
        if(l == -1 || r == -1)      return -1;
        if(l - r > 1 || r - l > 1)  return -1;
        else                        return Math.max(l, r)+1;
        
    }
    
}