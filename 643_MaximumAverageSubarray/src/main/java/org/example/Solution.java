package org.example;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0.0;
        for (int i = 0; i < k; i++)
            max += nums[i];

        double next = max;
        for (int i = k; i < nums.length; i++) {
            next = next - nums[i-k] + nums[i];
            if (next > max)
                max = next;
        }

        return max / k;
    }
}