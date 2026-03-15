package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Solution().isPalindrome("race a car"));
        System.out.println(new Solution().isPalindrome(" "));
        System.out.println(new Solution().isPalindrome(".,"));

    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < j && !isAlphanum(s.charAt(i)))
                i++;
            while (i < j && !isAlphanum(s.charAt(j)))
                j--;
            if (toLower(s.charAt(i++)) != toLower(s.charAt(j--)))
                return false;
        }
        return true;
    }

    private boolean isAlphanum(char ch) {
        return (ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z') ||
               (ch >= '0' && ch <= '9');
    }

    private char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            return (char)(ch - 'A' + 'a');
        return ch;
    }
}