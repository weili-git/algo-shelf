public class _142_detectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        boolean circle = false;
        ListNode p = head;
        ListNode q = head;
        while(q!=null && q.next!=null){
            p = p.next;
            q = q.next.next;
            if(p==q) {
                circle = true;
                break;
            }
        }
        //             a    b
        //          0----0----0
        //                \--/
        //                 a
        // 入环点到head距离为a，快慢指针相遇点到head距离a+b。
        // 慢指针走了a+b，快指针在慢指针基础上再走a+b回到原点，所以下面的弧长为a。
        // 由此，我们让相遇点p和头节点r同时走，此时相遇点就是入环点
        if(circle){ //  key point
            ListNode r = head;
            while(p!=r){
                p = p.next;
                r = r.next;
            }
            return r;
        }else{
            return null;
        }
    }
}
