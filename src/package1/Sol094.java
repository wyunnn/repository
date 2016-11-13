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
public class Sol094 {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = root;
        
        while(current != null || s.size()>0){
            if(current != null){
                s.push(current);
                current = current.left;
            }
            else{
                current = s.pop();
                a.add(current.val);
                current = current.right;
            }
        }
        return a;

    }
	
    /*public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        
        if(root != null && root.left != null)
            a.addAll(inorderTraversal(root.left));
        
        if(root != null)
            a.add(root.val);

        if(root !=null && root.right != null)
            a.addAll(inorderTraversal(root.right));
        
        return a;
    }*/
}