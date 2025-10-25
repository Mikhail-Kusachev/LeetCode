package org.example;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for (int num:nums) {
            if (num == 1)
                current++;
            else {
                if (current > max)
                    max = current;
                current = 0;
            }
        }

        if (current > max)
            max = current;


        return max;
    }
}