public class _206_reverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode prev = null;
        while(head.next!=null){
            ListNode tmp = head.next;

            head.next = prev;
            prev = head;

            head = tmp;     // the next node
        }
        head.next = prev;
        return head;
    }
}
