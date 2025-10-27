package org.example;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (var str : strs) {
            var chars = str.toCharArray();
            Arrays.sort(chars);
            var key = new String(chars);
            groups.computeIfAbsent(key, s -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}