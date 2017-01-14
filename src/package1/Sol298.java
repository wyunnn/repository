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
public class Sol298 {
    public int longestConsecutive(TreeNode root) {
        if(root == null)   return 0;
        return helper(root, 1, root.val+1);
    }
    
    private int helper(TreeNode node, int len, int target){
        if (node == null)   return len; 
        int l = (node.val == target) ? len+1 : 1; 
        return Math.max(l, Math.max(helper(node.left, l, node.val+1), helper(node.right, l, node.val+1)));
    }
}