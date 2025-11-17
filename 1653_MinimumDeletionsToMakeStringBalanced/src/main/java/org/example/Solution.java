package org.example;

class Solution {
    public int minimumDeletions(String s) {
        int countA = 0;
        int countB = 0;
        int result = Integer.MAX_VALUE;

        for (char c : s.toCharArray())
            if (c == 'a') countA++;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                result = Math.min(result, --countA + countB);
            else
                result = Math.min(result, countA + countB++);
        }

        return result;
    }
}