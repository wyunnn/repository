package package1;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Sol024 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)   return head;
        
        ListNode n1 = head;
        ListNode n2 = head.next;
        ListNode n3 = head.next.next;
        
        head = head.next;
        n2.next = n1;
        n1.next = swapPairs(n3);
        
        return head;
        
    }
}