package org.example;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int odd = 0;
        int nice = 0;
        int count = 0;

        while (right < nums.length) {
            if (nums[right++] % 2 == 1) {
                odd++;
                count = 0;
            }
            while (odd == k) {
                count++;
                if (nums[left++] % 2 == 1) odd--;
            }
            nice += count;
        }

        return nice;
    }
}