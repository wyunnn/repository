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
public class Sol404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int s = 0;
        if(root==null){
            return 0;
        }
        if(hasLeftLeaf(root)){
            s+=root.left.val;
        }
        else if(hasLeftTree(root)){
            s+=sumOfLeftLeaves(root.left);
        }
        if(hasRightTree(root)){
            s+=sumOfLeftLeaves(root.right);
        }
        return s;
    }
    
    boolean hasLeftLeaf(TreeNode node){
        if(node!=null && node.left!=null && node.left.left==null && node.left.right ==null){
            return true;
        }
        else
            return false;
        
    }
    boolean hasRightTree(TreeNode node){
        if (node !=null && node.right !=null){
             if (node.right.left!=null || node.right.right != null){
                return true;
             }
        }
        return false;
    }
    boolean hasLeftTree(TreeNode node){
        if(node == null){
            return false;
        }
        else if (node.left != null){
            if(node.left.right!=null || node.left.left!=null){
                return true;
            }
        }
        return false;
        
    }
}