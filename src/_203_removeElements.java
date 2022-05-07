public class _203_removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode p = head;
        while(p.val==val){  // find the start point
            if(p.next==null) return null;
            else p = p.next;
        }
        ListNode q = p;
        while(q.next!=null){
            if(q.next.val==val){
                q.next = q.next.next;
            }else{
                q = q.next;
            }
        }
        return p;
    }

    public static void main(String[] args) {

    }
}
