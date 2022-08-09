import java.util.List;

public class _2_addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(); //dummy
        ListNode res = head;
        int carry = 0;
        while(l1!=null && l2!=null){
            head.next = new ListNode((l1.val + l2.val + carry)%10);
            head = head.next;
            carry = (l1.val + l2.val + carry)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            head.next = new ListNode((l1.val + carry)%10);
            head = head.next;
            carry = (l1.val + carry)/10;
            l1 = l1.next;
        }
        while(l2!=null){
            head.next = new ListNode((l2.val + carry)%10);
            head = head.next;
            carry = (l2.val + carry)/10;
            l2 = l2.next;
        }
        if(carry==1) head.next = new ListNode(1);
        return res.next;
    }
}
