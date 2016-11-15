package package1;

import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Sol382 {
    ListNode head;
    Random r;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Sol382(ListNode head) {
        this.head = head;
        this.r = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int m,i = 1;
        int tmp = head.val;
        ListNode current = head;
        
        while(current !=null){
            m = r.nextInt(i);
            if(m == 0){
                tmp = current.val;
            }
            i++;
            current = current.next;
        }
        return tmp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */