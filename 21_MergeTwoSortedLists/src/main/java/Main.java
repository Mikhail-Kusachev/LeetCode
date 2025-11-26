public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        printList(s.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4)))
        ));

        printList(s.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                null
        ));

        printList(s.mergeTwoLists(
                null,
                null
        ));

    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null)
                System.out.print(" -> ");
        }
        System.out.println();
    }
}