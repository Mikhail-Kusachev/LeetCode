package org.example;

import java.util.Map;

class Solution {
    private static final Map<Character, Integer> ROMAN_MAP_SINGLE = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );
    private static final Map<String, Integer> ROMAN_MAP_DOUBLE = Map.of(
            "IV", 4,
            "IX", 9,
            "XL", 40,
            "XC", 90,
            "CD", 400,
            "CM", 900
    );

    public int romanToInt(String s) {
        int result = 0;
        s += ".";

        for (int i = 0; i < s.length() - 1; ) {
            var doubleKey = s.substring(i, i + 2);
            var doubleValue = ROMAN_MAP_DOUBLE.get(doubleKey);

            if (doubleValue != null) {
                result += doubleValue;
                i += 2;
            }
            else {
                result += ROMAN_MAP_SINGLE.get(s.charAt(i));
                i += 1;
            }
        }

        return result;
    }
}