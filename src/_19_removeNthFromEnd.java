public class _19_removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;    // only 1 node
        ListNode node = head;
        ListNode prev = head;
        ListNode dummy = head;
        for(int i=0;i<n;i++) node = node.next;
        while(node!=null){
            prev = head;
            node = node.next;
            head = head.next;
        }
        if(head==prev) return head.next;    // 1-st node was removed
        prev.next = head.next;
        head.next = null;
        return dummy;
    }
}
