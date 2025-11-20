package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 7, 11, 15}, 9)) + " = [1, 2]");
        System.out.println(Arrays.toString(s.twoSum(new int[]{2,3,4}, 6)) + " = [1, 3]");
        System.out.println(Arrays.toString(s.twoSum(new int[]{-1,0}, -1)) + " = [1, 2]");
    }
}