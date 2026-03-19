package org.example;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().wordPattern("abba", "dog dog dog dog"));
    }
}

class Solution {
    public boolean wordPattern(String pattern, String s) {
        var words = s.split(" ");
        if (words.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            var key = pattern.charAt(i);
            var value = words[i];
            if (map.containsKey(key)) {
                if (!map.get(key).equals(value)) return false;
            } else {
                if (set.contains(value)) return false;
                map.put(key, value);
                set.add(value);
            }
        }
        return true;
    }
}