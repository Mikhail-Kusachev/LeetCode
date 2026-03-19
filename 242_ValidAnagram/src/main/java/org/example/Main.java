package org.example;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) {
        String s = "\u0048\u0065\u006C\u006C\u006F";
        String t = "\u006C\u0065\u0048\u006F\u006C";
        //String t = "\u0057\u006F\u0072\u006C\u0064";
        System.out.println(new Solution().isAnagram(s, t));
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        return stream(s.split("")).sorted().collect(joining())
                .equals(stream(t.split("")).sorted().collect(joining()));
    }
}