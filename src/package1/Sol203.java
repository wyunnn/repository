/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode nhead = new ListNode(0);
        ListNode cur = nhead;
        cur.next = head;
        while(cur != null){
            if(cur.next != null && cur.next.val == val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;   
            }
        }
        return nhead.next;
    }
}
