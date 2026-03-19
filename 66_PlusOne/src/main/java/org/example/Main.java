package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{3, 9, 9})));
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        var result = digits.clone();
        for (int i = digits.length - 1; i >= 0; i--) {
            if (result[i] < 9) {
                result[i]++;
                return result;
            }
            result[i] = 0;
        }

        result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}