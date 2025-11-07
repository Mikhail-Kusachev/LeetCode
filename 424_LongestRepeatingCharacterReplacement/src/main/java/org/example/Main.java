package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().characterReplacement("ABAB", 2) + " expected: 4");
        System.out.println(new Solution().characterReplacement("AABABBA", 1) + " expected: 4");
        System.out.println(new Solution().characterReplacement("AAAA", 2) + " expected: 4");
        System.out.println(new Solution().characterReplacement("ABCDE", 0) + " expected: 1");
        System.out.println(new Solution().characterReplacement("AAAB", 0) + " expected: 3");
        System.out.println(new Solution().characterReplacement("AABA", 0) + " expected: 2");
        System.out.println(new Solution().characterReplacement("ABBB", 2) + " expected: 4");
        System.out.println(new Solution().characterReplacement("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 26) + " expected: 26");
        System.out.println(new Solution().characterReplacement("", 1) + " expected: 0");
        System.out.println(new Solution().characterReplacement("B", 1) + " expected: 1");
    }
}