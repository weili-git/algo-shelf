import java.util.List;

public class _24_swapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode ans = head.next;   // the second elem
        ListNode p = head;
        ListNode q = head.next;
        ListNode prev = null;
        while(q!=null && q.next!=null){
            if(prev!=null) prev.next = q;
            p.next = q.next;
            q.next = p;
            prev = p;
            p = p.next;
            q = p.next; // careful
        }
        if(q!=null){
            if(prev!=null) prev.next = q;
            q.next = p;
            p.next = null;
        }
        return ans;
    }
}
