package package1;

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Sol116 {
    public void connect(TreeLinkNode root) {
        if(root == null)    return;

        TreeLinkNode pre = root;
        TreeLinkNode cur;
        while(pre.left != null){
            cur = pre;
            pre = cur.left;
            while(cur != null){
                cur.left.next = cur.right;
                if(cur.next != null)cur.right.next = cur.next.left; //perfect binary tree;
                cur = cur.next;
            }
        }
    }
}