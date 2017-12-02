/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)    return true;
        
        int n = 0;
        ListNode cur1 = head;
        ListNode cur2 = head;
        
        while(cur2 != null && cur2.next != null){
            n++;
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }
        
        cur1 = reverse(cur1);
        cur2 = head;
        
        while(cur1 != null && cur2 != null){
            if(cur1.val != cur2.val){
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
