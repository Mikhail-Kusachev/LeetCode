package org.example;

import java.util.*;

class Solution {
    private record Substr(int tail, int head, int length) {}

    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;

        List<Substr> substrs = new ArrayList<>();
        for (int center = 1; center < s.length() - 1; center++) {
            for (int i = 1; ; i++) {
                if (s.charAt(center - i) != s.charAt(center + i)) {
                    if (i > 1)
                        substrs.add(new Substr(center - i + 1, center + i - 1, 2 * i - 1));
                    break;
                } else if (i == center || i == s.length() - center - 1) {
                    substrs.add(new Substr(center - i, center + i, 2 * i + 1));
                    break;
                }
            }
        }
        for (int center = 0; center < s.length() - 1; center++) {
            for (int i = 0; ; i++) {
                if (s.charAt(center - i) != s.charAt(center + i + 1)) {
                    if (i > 0)
                        substrs.add(new Substr(center - i + 1, center + i, 2 * i));
                    break;
                } else if (i == center || i == s.length() - center - 2) {
                    substrs.add(new Substr(center - i, center + i + 1, 2 * (i + 1)));
                    break;
                }

            }
        }

        Substr result = substrs.stream().max(Comparator.comparingInt(e -> e.length)).orElse(null);
        return result == null ?
                String.valueOf(s.charAt(0)) :
                s.substring(result.tail, result.head + 1);
    }
}