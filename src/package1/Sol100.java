package package1;

public class Sol100 {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p==null && q==null){
	                return true;
	        }
	        else if(p==null && q!=null){
	                return false;
	        }
	        else if(q==null && p!=null){
	            return false;
	        }
	        else if(p.val!=q.val){
	            return false;
	        }
	        if(!isSameTree(p.left, q.left)){
	            return false;
	        }
	        if(!isSameTree(p.right, q.right)){
	            return false;
	        }
	        else
	            return true;
	    }


}
