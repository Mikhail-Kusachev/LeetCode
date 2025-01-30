package org.example;

import java.util.*;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1

Follow up: Could you solve it without converting the integer to a string?
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindromeV2(121));
        System.out.println(isPalindromeV2(-121));
        System.out.println(isPalindromeV2(10));
    }

    public static boolean isPalindromeV1(int x) {
        if (x < 0) { return false; }
        if (x == 0) { return true; }
        List<Integer> digitList = new ArrayList<Integer>();
        int digit = 0;
        while (x != 0) {
            digit = x % 10;
            digitList.add(digit);
            x = x / 10;
        }
        for (int i = 0; i < digitList.size()/2; i++) {
            if (!digitList.get(i).equals(digitList.get(digitList.size()-1-i))) { return false; }
        }
        return true;
    }

    public static boolean isPalindromeV2(int x) {
        if (x < 0) { return false; }
        if (x == 0) { return true; }
        int xCopy = x;
        int reverse = 0;
        while (xCopy != 0) {
            int lastDigit = xCopy % 10;
            reverse = reverse * 10 + lastDigit;
            xCopy = xCopy / 10;
        }
        if (reverse == x) { return true; }
        return false;
    }
}