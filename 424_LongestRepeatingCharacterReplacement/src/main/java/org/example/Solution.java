package org.example;

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            while (maxFreq(freq) + k < right - left + 1) {
                freq[s.charAt(left++) - 'A']--;
            }
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    private int maxFreq(int[] array) {
        int max = 0;
        for (int count : array) {
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}