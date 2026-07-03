package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.lengthOfLastWord("a "));

    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        int result = 0;
        boolean insideWord = false;

        for  (int i = s.length() - 1; i >= 0 ; i--) {
            if (!insideWord && s.charAt(i) != ' ') {
                insideWord = true;
                end = i;
            }
            else if(insideWord && s.charAt(i) == ' ') {
                insideWord = false;
                result = end - i;
                break;
            }
        }

        return insideWord ? end + 1: result;
    }
}