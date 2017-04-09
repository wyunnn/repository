package package1;

import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Sol513 {
    public int findBottomLeftValue(TreeNode root) {
        TreeNode cur = root;
        Queue<TreeNode> qe = new LinkedList<TreeNode>();
        qe.add(root);
        
        while(!qe.isEmpty()){
            cur = qe.remove();
            if(cur.right != null)       qe.add(cur.right);
            if(cur.left != null)        qe.add(cur.left);
        }
        
        return cur.val;
    }
}