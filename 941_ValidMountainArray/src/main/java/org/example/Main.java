package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().validMountainArray(new int[]{1,2,3,4}));
        System.out.println("Test 2: " + new Solution().validMountainArray(new int[]{1,2,3,4,5}) + " (expected: false)");
        System.out.println("Test 3: " + new Solution().validMountainArray(new int[]{5,4,3,2,1}) + " (expected: false)");
        System.out.println("Test 4: " + new Solution().validMountainArray(new int[]{1,2,2,3,4,3}) + " (expected: false)");
        System.out.println("Test 5: " + new Solution().validMountainArray(new int[]{1,2,3,2,1}) + " (expected: true)");
        System.out.println("Test 6: " + new Solution().validMountainArray(new int[]{1,1,2,3,2,1}) + " (expected: false)");
        System.out.println("Test 7: " + new Solution().validMountainArray(new int[]{0,1,2,3,4,5,4,3,2,1,0}) + " (expected: true)");
        System.out.println("Test 8: " + new Solution().validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}) + " (expected: false)");
        System.out.println("Test 9: " + new Solution().validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0}) + " (expected: false)");
        System.out.println("Test 10: " + new Solution().validMountainArray(new int[]{1,3,2}) + " (expected: true)");
        System.out.println("Test 11: " + new Solution().validMountainArray(new int[]{1,2,1}) + " (expected: true)");
        System.out.println("Test 12: " + new Solution().validMountainArray(new int[]{1,2}) + " (expected: false)");
        System.out.println("Test 13: " + new Solution().validMountainArray(new int[]{2,1}) + " (expected: false)");
        System.out.println("Test 14: " + new Solution().validMountainArray(new int[]{1}) + " (expected: false)");
        System.out.println("Test 15: " + new Solution().validMountainArray(new int[]{}) + " (expected: false)");
        System.out.println("Test 16: " + new Solution().validMountainArray(new int[]{0,3,2}) + " (expected: true)");
        System.out.println("Test 17: " + new Solution().validMountainArray(new int[]{0,1,2,3,4,3,2,1,0}) + " (expected: true)");
        System.out.println("Test 18: " + new Solution().validMountainArray(new int[]{0,1,2,3,2,2,1}) + " (expected: false)");
        System.out.println("Test 19: " + new Solution().validMountainArray(new int[]{0,0,1,2,3,2,1}) + " (expected: false)");
        System.out.println("Test 20: " + new Solution().validMountainArray(new int[]{1,2,3,4,3,2,1,0,-1}) + " (expected: true)");
    }
}

class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length - 1;
        int i = 0;

        if (n < 2) return false;
        while (i < n && arr[i] < arr[i + 1]) i++;
        if (i == 0 || i == n) return false;
        while (i < n && arr[i] > arr[i + 1]) i++;

        return i == n;
    }
}