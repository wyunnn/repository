/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return true;
        }
        return symmetric(root.left, root.right);
    }
    public boolean symmetric(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        else if(root1== null || root2 == null){
            return false;
        }
        else{
            if(root1.val == root2.val &&
              symmetric(root1.left, root2.right) &&
              symmetric(root1.right, root2.left)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
