package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.lengthOfLastWord("luffy is still joyboy"));

    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int start = 0;
        int lastLength = 0;
        boolean insideWord = false;
        for  (int i = 0; i <= s.length() - 1; i++) {
            if (!insideWord && s.charAt(i) != ' ') {
                insideWord = true;
                start = i;
            }
            if (insideWord && s.charAt(i) == ' ') {
                insideWord = false;
                lastLength = i - start;
            }
        }

        return insideWord ? s.length() - start : lastLength;
    }
}