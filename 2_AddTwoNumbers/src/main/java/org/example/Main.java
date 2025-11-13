package org.example;

public class Main {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null)
                System.out.print("->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode l1, l2;

        l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        printList(s.addTwoNumbers(l1, l2));

        l1 = new ListNode(0);
        l2 = new ListNode(0);
        printList(s.addTwoNumbers(l1, l2));

        l1 = new ListNode(9, new ListNode(9, new ListNode(9,  new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        l2 = new ListNode(9, new ListNode(9, new ListNode(9,  new ListNode(9))));
        printList(s.addTwoNumbers(l1, l2));
    }
}