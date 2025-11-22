package org.example;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for (var str : strs)
            if (str.length() < minLength) minLength = str.length();

        for (int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++)
                if (strs[j].charAt(i) != c) return strs[0].substring(0, i);
        }

        return strs[0].substring(0, minLength);
    }
}