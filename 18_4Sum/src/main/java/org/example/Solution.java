package org.example;

import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            // optimization
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if ((long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;
            if ((long)nums[i] + nums[nums.length-3] + nums[nums.length-2] + nums[nums.length-1] < target) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                // optimization
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if ((long)nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;
                if ((long)nums[i] + nums[j] + nums[nums.length-2] + nums[nums.length-1] < target) continue;

                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target)
                        left++;
                    else if (sum > target)
                        right--;
                    else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // skip duplicates and move pointers
                        while (left < right && nums[left] == nums[++left]);
                        while (left < right && nums[right] == nums[--right]);
                    }
                }
            }
        }
        return result;
    }
}