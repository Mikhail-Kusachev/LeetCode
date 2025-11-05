package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Test 1: " + solution.minSubArrayLen(7, new int[]{2,3,1,2,4,3}) + " (Expected: 2)");
        System.out.println("Test 2: " + solution.minSubArrayLen(4, new int[]{1,4,4}) + " (Expected: 1)");
        System.out.println("Test 3: " + solution.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}) + " (Expected: 0)");
        System.out.println("Test 4: " + solution.minSubArrayLen(1, new int[]{1,1,1,1,1,1}) + " (Expected: 1)");
        System.out.println("Test 5: " + solution.minSubArrayLen(1, new int[]{1}) + " (Expected: 1)");
        System.out.println("Test 6: " + solution.minSubArrayLen(2, new int[]{1}) + " (Expected: 0)");
        System.out.println("Test 7: " + solution.minSubArrayLen(1, new int[]{2}) + " (Expected: 1)");
        System.out.println("Test 8: " + solution.minSubArrayLen(6, new int[]{1,2,3}) + " (Expected: 3)");
        System.out.println("Test 9: " + solution.minSubArrayLen(10, new int[]{1,2,3,4}) + " (Expected: 4)");
        System.out.println("Test 10: " + solution.minSubArrayLen(6, new int[]{1,2,3,4,5}) + " (Expected: 2)");
        System.out.println("Test 11: " + solution.minSubArrayLen(9, new int[]{3,1,2,4,3,1,2}) + " (Expected: 3)");
        System.out.println("Test 12: " + solution.minSubArrayLen(100, new int[]{10,20,30,40,50}) + " (Expected: 3)");
        System.out.println("Test 13: " + solution.minSubArrayLen(5, new int[]{1,2,5,3,4}) + " (Expected: 1)");
        System.out.println("Test 14: " + solution.minSubArrayLen(3, new int[]{1,2,3,4,5}) + " (Expected: 1)");
        System.out.println("Test 15: " + solution.minSubArrayLen(9, new int[]{1,1,1,1,1,10}) + " (Expected: 1)");
    }
}