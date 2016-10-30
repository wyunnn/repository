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
public class Sol226 {
    public TreeNode invertTree(TreeNode root) {
        
        if (root == null)   return null;
        
        TreeNode a = new TreeNode(root.val);
        a.left = invertTree(root.right);
        a.right = invertTree(root.left);
        
        return a;
        
    }
}