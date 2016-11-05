package package1;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Sol019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null)    return null;

        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode fast = newhead;
        ListNode slow = newhead;
        
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        
        while(fast != null && fast.next != null){
                fast = fast.next;
                slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return newhead.next;
    }
}