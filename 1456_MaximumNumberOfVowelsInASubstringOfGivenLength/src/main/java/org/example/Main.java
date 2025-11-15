package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.maxVowels("abciiidef", 3) + " = 3");
        System.out.println(s.maxVowels("leetcode", 3) + " = 2");
        System.out.println(s.maxVowels("aeiou", 2) + " = 2");
        System.out.println(s.maxVowels("bab", 3) + " = 1");
        System.out.println(s.maxVowels("abciiidef", 3) + " = 3");
        System.out.println(s.maxVowels("leetcode", 3) + " = 2");
        System.out.println(s.maxVowels("aeiou", 2) + " = 2");
        System.out.println(s.maxVowels("bab", 3) + " = 1");
        System.out.println(s.maxVowels("a", 1) + " = 1");
        System.out.println(s.maxVowels("b", 1) + " = 0");
        System.out.println(s.maxVowels("abcde", 5) + " = 2");
        System.out.println(s.maxVowels("uoiea", 1) + " = 1");
        System.out.println(s.maxVowels("rhythms", 4) + " = 0");
        System.out.println(s.maxVowels("aaabbbeee", 3) + " = 3");
        System.out.println(s.maxVowels("abciiidef", 3) + " = 3");
        System.out.println(s.maxVowels("leetcode", 3) + " = 2");
        System.out.println(s.maxVowels("aeiou", 2) + " = 2");
        System.out.println(s.maxVowels("bab", 3) + " = 1");
        System.out.println(s.maxVowels("a", 1) + " = 1");
        System.out.println(s.maxVowels("b", 1) + " = 0");
        System.out.println(s.maxVowels("abcde", 5) + " = 2");
        System.out.println(s.maxVowels("uoiea", 1) + " = 1");
        System.out.println(s.maxVowels("rhythms", 4) + " = 0");
        System.out.println(s.maxVowels("aaabbbeee", 3) + " = 3");
        System.out.println(s.maxVowels("xyz", 2) + " = 0");
        System.out.println(s.maxVowels("aei", 3) + " = 3");
        System.out.println(s.maxVowels("aei", 1) + " = 1");
        System.out.println(s.maxVowels("aeiouaeiou", 5) + " = 5");
        System.out.println(s.maxVowels("aeiouaeiou", 10) + " = 10");
        System.out.println(s.maxVowels("bcdfghjkl", 4) + " = 0");
        System.out.println(s.maxVowels("abababab", 2) + " = 1");
        System.out.println(s.maxVowels("abcabcabc", 3) + " = 1");
        System.out.println(s.maxVowels("eee", 3) + " = 3");
        System.out.println(s.maxVowels("eee", 2) + " = 2");
    }
}