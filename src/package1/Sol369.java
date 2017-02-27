package package1;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Sol369 {
    public ListNode plusOne(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode i = dummy;
        ListNode j = dummy;
        
        while(i != null){
            if(i.val != 9){
                j = i;
            }
            i = i.next;
        }
        
        j.val++;
        i = j.next;
        while(i != null){
            i.val = 0;
            i = i.next;
        }
        
        if(dummy.val == 0){
            return dummy.next;
        }else{
            return dummy;
        }
        
    }
}