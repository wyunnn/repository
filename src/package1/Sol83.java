package package1;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Sol83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = head;
        
        if (pointer == null)    return head;
        
        while (pointer.next != null) {
            while (pointer.next != null && pointer.val == pointer.next.val){
                pointer.next = pointer.next.next;
            }
            pointer = pointer.next;
        }
        
        return head;
    }
}