package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] TwoSum(int[] nums, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if (result[0] == i) { break; }
        }
        return result;
    }
}