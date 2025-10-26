package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) { return 1; }
        if (s.length() == 0) { return 0; }

        Set<Character> set = new HashSet<>();
        int max = 1;
        int tail = 0;
        int head = 1;
        int current = 1;
        boolean isGrow = true;
        Character headCh = s.charAt(0);
        set.add(headCh);

        while (head < s.length()) {
            if (isGrow) {
                Character ch = s.charAt(head++);
                if (!set.contains(ch)) {
                    set.add(ch);
                    current++;
                } else {
                    max = Math.max(current, max);
                    isGrow = false;
                    headCh = ch;
                }
            } else {
                Character ch = s.charAt(tail++);
                if (ch != headCh) {
                    set.remove(ch);
                    current--;
                } else
                    isGrow =  true;
            }
        }

        return Math.max(current, max);
    }
}