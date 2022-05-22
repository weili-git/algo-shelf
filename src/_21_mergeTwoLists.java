public class _21_mergeTwoLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list2.next,list1);
            return list2;
        }
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
