package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.threeSum(new int[]{-1,0,1,2,-1,-4}) + " = [[-1, -1, 2],[-1, 0, 1]]");
        System.out.println(s.threeSum(new int[]{0,1,1}) + " = []");
        System.out.println(s.threeSum(new int[]{0,0,0}) + " = [[0, 0, 0]]");
    }
}