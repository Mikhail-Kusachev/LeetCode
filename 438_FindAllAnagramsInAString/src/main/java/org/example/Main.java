package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findAnagrams("cbaebabacd", "abc") );
        System.out.println(solution.findAnagrams("abab", "ab"));
        System.out.println(solution.findAnagrams("abc", "abcd"));
    }
}