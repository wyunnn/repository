package package1;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Sol206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }      
        else{
            ListNode a = reverseList(head.next);
            head.next.next = head; //orzorz
            head.next = null; //orzorz
            return a;
        }
    }
}