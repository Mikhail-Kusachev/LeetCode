package org.example;

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

//        TreeNode node24 = new TreeNode(3);
//        TreeNode node22 = new TreeNode(3);
//        TreeNode node12 = new TreeNode(2, null, node24);
//        TreeNode node11 = new TreeNode(2, null, node22);
//        TreeNode node1 = new TreeNode(1, node11, node12);

        System.out.println(s.isSymmetric(node1));
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)return true;

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}