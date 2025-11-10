package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] target = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < p.length(); i++) {
            target[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(window, target)) result.add(0);

        for (int i = 1; i <= s.length()-p.length(); i++) {
            window[s.charAt(i-1) - 'a']--;
            window[s.charAt(i+p.length()-1) - 'a']++;
            if (Arrays.equals(window, target)) result.add(i);
        }

        return result;
    }
}