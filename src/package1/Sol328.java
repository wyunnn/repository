/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddhead = head, evenhead = null;
        
        if(head == null || head.next == null)       return head;
        else                                        evenhead = head.next;
        
        ListNode odd = oddhead;
        ListNode even = evenhead;
        
        ListNode no = null, ne = null;

        while(odd.next != null && even.next != null){
            if(odd.next.next != null){
                no = odd.next.next;
                odd.next = no;
                odd = no;
            }
            if(even.next.next != null){
                ne = even.next.next;
                even.next = ne;
                even = ne;
            }
        }
        
        even.next = null; /**NOTICE*************/
        odd.next = evenhead;
        
        return oddhead;
        
    }
}
