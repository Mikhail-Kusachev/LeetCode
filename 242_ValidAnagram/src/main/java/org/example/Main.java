package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "hella";
        String t = "lleoh";
        System.out.println(new Solution().isAnagram(s, t));
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        var dict = new int[26];
        for (var i = 0; i < s.length(); i++) {
            dict[s.charAt(i) - 'a']++;
            dict[t.charAt(i) - 'a']--;
        }

        return Arrays.equals(dict, new int[26]);
    }
}