package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.twoSum(new int[]{3,2,4}, 6)) + " = [1, 2]");
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 7, 11, 15}, 9)) + " = [0, 1]");
        System.out.println(Arrays.toString(s.twoSum(new int[]{3, 3}, 6)) + " = [0, 1]");
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 5, 5, 11}, 10)) + " = [1, 2]");
    }
}