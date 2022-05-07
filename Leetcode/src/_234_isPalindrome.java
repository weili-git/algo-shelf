import java.util.Stack;

public class _234_isPalindrome {
    public boolean isPalindrome(ListNode head) {
        // use fast-slow pointer to find the middle point.
        if(head==null || head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while(slow!=null){
            if(head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){    // return new head node of the reversed List.
        if(head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
