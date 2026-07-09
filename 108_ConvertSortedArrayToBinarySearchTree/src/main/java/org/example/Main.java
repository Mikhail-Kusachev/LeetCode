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
        int[] nums = new int[] { -10, -3, 0, 5, 9};

        TreeNode tree = s.sortedArrayToBST(nums);
        System.out.println("debug");
    }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        return new TreeNode(
                nums[mid],
                build(nums, left, mid - 1),
                build(nums, mid + 1, right)
        );
    }
}