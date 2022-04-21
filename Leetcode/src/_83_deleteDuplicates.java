
public class _83_deleteDuplicates {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void printList(ListNode list1){
        if(list1==null) return;
        while(list1.next != null){
            System.out.printf("%d->" , list1.val);
            list1 = list1.next;
        }
        System.out.printf("%d\n" , list1.val);
    }

    public static ListNode buildList(int [] arr){
        if(arr.length==0)
            return null;
        ListNode res = new ListNode(arr[0]);
        ListNode p = res;
        for(int i=1;i<arr.length;i++){
            p.next = new ListNode(arr[i]);
            p = p.next;
        }
        return res;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        if(head==null) return head;
        while(head.next!=null){
            int val = head.val;
            ListNode temp = head.next;
            while(temp.val==val && temp.next!=null){
                temp = temp.next;
            }
            if(temp.next!=null){
                head.next = temp;
                head = head.next;
            }
            else if(temp.val==val){
                head.next = null;
                return res;
            }
            else{   //  temp.val != val
                head.next = temp;
                return res;
            }
        }
        return res; // null head

//        if(head == null || head.next == null){
//            return head;
//        }
//        head.next = deleteDuplicates(head.next);
//        if(head.val == head.next.val) head = head.next;
//        return head;
    }
    public static void main(String[] args) {
        // int[] nums = {1, 1, 2, 3, 4, 4, 5, 5, 5, 6, 6};
        int[] nums = {1, 1, 2};
        // int[] nums = {};
        ListNode list1 = buildList(nums);
        ListNode list2 = deleteDuplicates(list1);
        printList(list2);
    }
}
