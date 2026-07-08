package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode node24 = new TreeNode(3);
        TreeNode node23 = new TreeNode(4);
        TreeNode node22 = new TreeNode(4);
        TreeNode node21 = new TreeNode(3);
        TreeNode node12 = new TreeNode(2, node23, node24);
        TreeNode node11 = new TreeNode(2, node21, node22);
        TreeNode node1 = new TreeNode(1, node11, node12);

        /*TreeNode node24 = new TreeNode(3);
        TreeNode node22 = new TreeNode(3);
        TreeNode node12 = new TreeNode(2, null, node24);
        TreeNode node11 = new TreeNode(2, null, node22);
        TreeNode node1 = new TreeNode(1, node11, node12);*/

        System.out.println(s.isSymmetric(node1));
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();

            if (left == null && right == null) continue;
            if (left == null || right == null || left.val != right.val) return false;

            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }

        return true;
    }
}