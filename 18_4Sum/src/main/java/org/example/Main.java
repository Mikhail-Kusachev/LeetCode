package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.fourSum(new int[]{1,0,-1,0,-2,2}, 0) + " = [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]");
        System.out.println(s.fourSum(new int[]{2,2,2,2,2}, 8) + " = [[2, 2, 2, 2]]");
    }
}