package package1;


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

  public int sumOfLeftLeaves(TreeNode root) {
      int s = 0;
      if(root==null){
          return 0;
      }
      if(hasLeftLeaf(root)){
          s+=root.left.val;
      }
      if(hasLeftTree(root)){
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
  
  public static void main(String[] args){
  	 TreeNode a = new TreeNode(3); 
  	 a.left=new TreeNode(9);
  	 a.right=new TreeNode(20);
  	 a.right.right=new TreeNode(7);
  	 a.right.left=new TreeNode(15);
  	 System.out.println(a.sumOfLeftLeaves(a));
  }
}