package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

/*        TreeNode node23 = new TreeNode(15);
        TreeNode node24 = new TreeNode(7);
        TreeNode node12 = new TreeNode(20, node23, node24);
        TreeNode node11 = new TreeNode(9);
        TreeNode root = new TreeNode(3, node11, node12);*/

        TreeNode node31 = new TreeNode(8);
        TreeNode node24 = new TreeNode(6);
        TreeNode node22 = new TreeNode(5);
        TreeNode node21 = new TreeNode(4, node31, null);
        TreeNode node12 = new TreeNode(3, node24, null);
        TreeNode node11 = new TreeNode(2, node21, node22);
        TreeNode root = new TreeNode(1, node11, node12);

        System.out.println(s.minDepth(root));
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
    }
}