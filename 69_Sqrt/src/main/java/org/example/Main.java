package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(8));

    }
}

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;

        int left = 0;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long sqrt = (long) mid * mid;

            if (sqrt == x) return mid;
            else if (sqrt < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return result;
    }
}