package org.example;

public class Main {
    public static void main(String[] args) {
        var head = new ListNode(1,
                       new ListNode(2,
                           new ListNode(3))
        );
        System.out.println(new Solution().reverseList(head));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    @Override
    public String toString() {
        var sb = new StringBuilder();
        var iterator = this;
        while (iterator != null) {
            sb.append(iterator.val);
            if (iterator.next != null)
                sb.append(" -> ");
            iterator = iterator.next;
        }
        return sb.toString();
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head, null);
    }

    private ListNode helper(ListNode current, ListNode reversed) {
        if (current == null)
            return reversed;
        var newNode = new ListNode(current.val, reversed);
        return helper(current.next, newNode);
    }
}