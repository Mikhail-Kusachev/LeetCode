package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Solution().validMountainArray(new int[]{2, 1}));
//        System.out.println(new Solution().validMountainArray(new int[]{4, 3, 2, 1}));
//        System.out.println(new Solution().validMountainArray(new int[]{1, 2, 3, 4}));
//        System.out.println(new Solution().validMountainArray(new int[]{}));
        System.out.println(new Solution().validMountainArray(new int[]{2, 0, 2}));
        System.out.println(new Solution().validMountainArray(new int[]{3, 5, 4}));
        System.out.println(new Solution().validMountainArray(new int[]{5, 5, 4}));
        System.out.println(new Solution().validMountainArray(new int[]{1, 2, 3, 4, 3, 2, 3}));
    }
}

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        if (maxIndex == arr.length - 1 || maxIndex == 0)
            return false;

        for (int i = maxIndex; i < arr.length - 1; i++)
            if (arr[i] <=  arr[i + 1])
                return false;

        for (int i = maxIndex; i > 0; i--)
            if (arr[i - 1] >= arr[i])
                return false;

        return true;
    }
}