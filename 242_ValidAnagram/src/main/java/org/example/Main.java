package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "\u0048\u0065\u006C\u006C\u006F";
        String t = "\u006C\u0065\u0048\u006F\u006C";
        //String t = "\u0057\u006F\u0072\u006C\u0064";
        System.out.println(new Solution().isAnagram(s, t));
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        var a1 = s.toCharArray();
        var a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2) ? true : false;
    }
}