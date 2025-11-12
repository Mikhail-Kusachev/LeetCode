package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

// Basic test cases from examples
        System.out.println(s.checkSubarraySum(new int[]{23,2,4,6,7}, 6) + " (expected: true)");
        System.out.println(s.checkSubarraySum(new int[]{23,2,6,4,7}, 6) + " (expected: true)");
        System.out.println(s.checkSubarraySum(new int[]{23,2,6,4,7}, 13) + " (expected: false)");

// Edge cases with minimal length
        System.out.println(s.checkSubarraySum(new int[]{1,1}, 2) + " (expected: true)");
        System.out.println(s.checkSubarraySum(new int[]{1,2}, 3) + " (expected: true)");
        System.out.println(s.checkSubarraySum(new int[]{1}, 1) + " (expected: false)"); // length < 2

// Cases with zero sum
        System.out.println(s.checkSubarraySum(new int[]{0,0}, 1) + " (expected: true)");
        System.out.println(s.checkSubarraySum(new int[]{1,0,0}, 1) + " (expected: true)");
        System.out.println(s.checkSubarraySum(new int[]{0,1,0}, 1) + " (expected: true)");

// Cases with k = 1 (every sum is multiple of 1)
        System.out.println(s.checkSubarraySum(new int[]{1,2}, 1) + " (expected: true)");
        System.out.println(s.checkSubarraySum(new int[]{5,10}, 1) + " (expected: true)");
        System.out.println(s.checkSubarraySum(new int[]{1000000000,1000000000}, 1000000000) + " (expected: true)");

// Multiple of k but not exactly k
//        System.out.println(s.checkSubarraySum(new int[]{1,2,3,4}, 5) + " (expected: true)"); // 1+2+3+4=10, multiple of 5

// Additional test cases
//        System.out.println(s.checkSubarraySum(new int[]{5,0,0,0}, 3) + " (expected: true)"); // 0+0=0, multiple of 3
//        System.out.println(s.checkSubarraySum(new int[]{1,2,3}, 6) + " (expected: true)"); // 1+2+3=6, multiple of 6
//        System.out.println(s.checkSubarraySum(new int[]{1,2,3}, 7) + " (expected: false)");
//        System.out.println(s.checkSubarraySum(new int[]{0}, 1) + " (expected: false)"); // length < 2
//        System.out.println(s.checkSubarraySum(new int[]{23,2,4,6,6}, 7) + " (expected: true)"); // 6+6=12, 12%7=5 but 23+2+4+6=35%7=0

    }
}