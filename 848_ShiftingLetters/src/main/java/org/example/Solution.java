package org.example;

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int[] prefix = new int[shifts.length];
        prefix[shifts.length - 1] = shifts[shifts.length - 1] % 26;
        for (int i = shifts.length - 2; i >= 0; i--)
            prefix[i] = (prefix[i + 1] + shifts[i]) % 26;

        StringBuilder sb = new StringBuilder();
        for  (int i = 0; i < s.length(); i++) {
            int c = (s.charAt(i) - 'a' + prefix[i]) % 26 + 'a';
            sb.append((char)c);
        }

        return sb.toString();
    }
}