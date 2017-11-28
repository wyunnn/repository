/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)    return null;
        
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);
        
        ListNode res = new ListNode(0); 
        ListNode cur = res;
        int x = 0;
        
        while(r1 != null || r2 != null || x != 0){
            if(r1 == null && r2 == null){ //x !=0
                cur.next = new ListNode(x);
                break;
            }
            else {
                int v1 = 0, v2 = 0, v = 0;
                if(r1 != null)  v1 = r1.val;
                if(r2 != null)  v2 = r2.val;
                
                v = v1 + v2 + x;
                if(v >= 10){
                    x = 1;
                    v-=10;
                }
                else{
                    x = 0;
                }
                
                cur.next = new ListNode(v);
                cur = cur.next;
                if(r1 != null)  r1 = r1.next;
                if(r2 != null)  r2 = r2.next;
            }
        }
        return reverse(res.next);
    }
    
    public ListNode reverse(ListNode l){
        if(l == null || l.next == null)  return l;
        else{
            ListNode next = l.next;
            ListNode n = reverse(l.next);
            next.next = l;
            l.next = null;
            return n;
        }
    }
}
