public class _237_deleteNode {
    public void deleteNode(ListNode node) {
        if(node.next==null)
            node = null;
        while(node.next.next!=null){
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}
