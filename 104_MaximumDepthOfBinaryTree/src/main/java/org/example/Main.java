package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

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

        TreeNode node34 = new TreeNode(7);
        TreeNode node33 = new TreeNode(15);
        TreeNode node22 = new TreeNode(20, node33, node34);
        TreeNode node21 = new TreeNode(9);
        TreeNode root = new TreeNode(3, node21, node22);

        System.out.println(s.maxDepth(root));
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}