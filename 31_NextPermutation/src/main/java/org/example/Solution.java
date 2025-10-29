package org.example;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int decreaseIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                decreaseIndex = i;
                break;
            }
        }

        if (decreaseIndex == -1) Arrays.sort(nums);
        else {
            int nextLargerIndex = decreaseIndex + 1;
            for (int i = decreaseIndex + 1; i < nums.length; i++) {
                if (nums[i] > nums[decreaseIndex] && nums[i] < nums[nextLargerIndex])
                    nextLargerIndex = i;
            }
            int temp = nums[decreaseIndex];
            nums[decreaseIndex] = nums[nextLargerIndex];
            nums[nextLargerIndex] = temp;

            Arrays.sort(nums, decreaseIndex + 1, nums.length);
        }
    }
}