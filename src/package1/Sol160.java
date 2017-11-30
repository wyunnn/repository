/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1 = 0, n2 = 0;
        ListNode curA = headA, curB = headB;
        
        while(curA != null){
            n1++;
            curA = curA.next;
        }
        
        while(curB != null){
            n2++;
            curB = curB.next;
        }
        
        curA = headA;
        curB = headB;
        
        if(n1 > n2){
            while(n1 - n2 > 0){
                curA = curA.next;
                n1--;
            }
        }
        else if(n1 < n2){
            while(n2 - n1 > 0){
                curB = curB.next;
                n2--;
            }
        }
        
        while(curA != null && curB != null){
            if(curA == curB){
                return curA;
            }
            else{
                curA = curA.next;
                curB = curB.next;
            }
        }
        
        return null;
        
    }
}
