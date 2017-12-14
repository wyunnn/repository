/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            while(lists[i] != null){
                pq.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode ret = new ListNode(0);
        ListNode cur = ret;
        while(pq.size()>0){
            cur.next = new ListNode(pq.poll());
            cur = cur.next;
        }
        return ret.next;
    } 
}


/*
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ret = new ListNode(0);
        ListNode cur_ret = ret;
        
        ListNode[] cur = new ListNode[lists.length];
        
        for(int i = 0; i < lists.length; i++){
            cur[i] = lists[i];
        }
        
        int min;
        int next = 0;
        boolean hasNext = true;
        while(hasNext){
            min = Integer.MAX_VALUE;
            
            for(int i = 0; i < lists.length; i++){
                if(cur[i] != null && cur[i].val < min){
                    min = cur[i].val;
                    next = i;
                }  
            }
            
            if(min == Integer.MAX_VALUE){
                break;
            }
            else{
                cur[next] = cur[next].next;
                cur_ret.next = new ListNode(min);
                cur_ret = cur_ret.next;
            }
        }
        
        return ret.next;
        
    }
}
*/
