package org.example;

class Solution {
    public int maxVowels(String s, int k) {
        if (k > s.length()) return 0;

        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                a[i] = 1;
            else
                a[i] = 0;
        }

        int head = k - 1;
        int current = 0;
        for (int i = 0; i <= head; i++) {
            current += a[i];
        }

        int result = current;
        while (head < s.length() - 1) {
            head++;
            current += a[head];
            current -= a[head - k];
            result = Math.max(result, current);
        }

        return result;
    }
}