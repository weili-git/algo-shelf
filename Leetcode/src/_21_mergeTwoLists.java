public class _21_mergeTwoLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode pointer = dummy;
        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
                pointer.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
                pointer.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        while(list1 != null){
            pointer.next = new ListNode(list1.val);
            pointer = pointer.next;
            list1 = list1.next;
        }
        while(list2 != null){
            pointer.next = new ListNode(list2.val);
            pointer = pointer.next;
            list2 = list2.next;
        }
        return dummy.next;
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

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {1, 3, 5};
        ListNode list1 = buildList(arr1);
        ListNode list2 = buildList(arr2);
        printList(list1);
        printList(list2);
        ListNode list3 = mergeTwoLists(list1, list2);
        printList(list3);
    }

}
