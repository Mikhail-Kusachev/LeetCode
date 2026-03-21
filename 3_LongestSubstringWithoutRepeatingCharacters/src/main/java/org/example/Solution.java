package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        var right = 0;
        var left = 0;
        var max = 0;
        var count = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                count++;
                set.add(s.charAt(right));
                right++;
            } else {
                if (count > max)
                    max = count;
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                    count--;
                }
                left++;
                right++;
            }
        }

        if (count > max)
            max = count;

        return max;
    }
}