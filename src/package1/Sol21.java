package package1;

public class Sol21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        else if (l2 == null) return l1;
        
        else { //l1 != null and l2 != null
            ListNode a = new ListNode(0); // add one more node
            ListNode pa = a;
            ListNode p1 = l1;
            ListNode p2 = l2;
            
            while(p1 != null && p2 != null){
                if(p1.val < p2.val){
                    pa.next = p1;
                    pa = p1;
                    p1 = p1.next;
                   
                }
                else {
                    pa.next = p2;
                    pa = p2;
                    p2 = p2.next;
                    
                }
            }
            if (p1 == null){
                pa.next = p2;
                return a.next;
            }
            else { //p2 == null
                pa.next = p1;
                return a.next;
            }
        }
    }
}