package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().wordPattern("abba", "dog dog dog dog"));
    }
}

class Solution {
    public boolean wordPattern(String pattern, String s) {
        var arr1 = pattern.toCharArray();
        var arr2 = s.split(" ");
        if (arr1.length != arr2.length) return false;
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (map1.containsKey(arr1[i]) && !map1.get(arr1[i]).equals(arr2[i])) return false;
            if (map2.containsKey(arr2[i]) && !map2.get(arr2[i]).equals(arr1[i])) return false;
            map1.putIfAbsent(arr1[i], arr2[i]);
            map2.putIfAbsent(arr2[i], arr1[i]);
        }

        return true;
    }
}