package org.example;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums[0] >= target || nums[nums.length - 1] >= target)
            return 1;
        if (nums.length == 1 && nums[0] < target)
            return 0;

        int result = nums.length + 1;
        int tail = 0;
        int head = 1;
        int sum = nums[tail] + nums[head];

        if (sum >= target)
            return 2;

        while (tail < nums.length) {
            if (sum >= target) {
                result = Math.min(result, head - tail + 1);
                sum -= nums[tail++];
            } else if (head < nums.length - 1)
                sum += nums[++head];
            else
                break;
        }

        return result <= nums.length ? result : 0;
    }
}