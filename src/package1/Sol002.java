package package1;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Sol002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int new_val = 0;
        int add_one = 0;
        int v1 = 0;
        int v2 = 0;
        ListNode l3 = new ListNode(0);
        ListNode p3 = l3;

        while (l1 != null || l2 != null) {
            
            if(l1!=null)        v1 = l1.val;
            else                v1 = 0;
            
            if(l2!=null)        v2 = l2.val;
            else                v2 = 0;

            new_val = v1 + v2 + add_one;
            
            if(new_val<10){
                add_one = 0;
            }
            else{
                new_val = new_val - 10;
                add_one = 1;
            }
            
            p3.val = new_val;
            
            if(l1 != null)      l1 = l1.next;
            if(l2 != null)      l2 = l2.next;
            
            if(l1 != null || l2 != null){
                p3.next = new ListNode(0);
                p3 = p3.next;
            }
        }
        
        //last digit
        if(add_one ==1){
            p3.next = new ListNode(1);
        }
        
        return l3;
    }
}