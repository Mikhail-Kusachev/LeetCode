package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int i = 0; i < nums.length - 1; i++) {
            int key = target - nums[i];
            if (!map.containsKey(key))
                continue;
            if (map.get(key) == i)
                continue;
            return new int[]{map.get(key), i};
        }

        return new int[0];
    }
}