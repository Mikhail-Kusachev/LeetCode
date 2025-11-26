class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            current.next = (list1.val < list2.val) ? list1 : list2;
            if (list1.val < list2.val)
                list1 = list1.next;
            else
                list2 = list2.next;
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}