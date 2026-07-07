package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s  = new Solution();
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node1 = new TreeNode(1, node2, node3);

        TreeNode node13 = new TreeNode(3, null, null);
        TreeNode node12 = new TreeNode(2, null, null);
        TreeNode node11 = new TreeNode(1, node12, node13);

        System.out.println(s.isSameTree(node1, node11));
    }
}

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

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}