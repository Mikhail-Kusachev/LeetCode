package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().compress("aabbccc".toCharArray()));
    }
}

class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) return 0;

        var read = 0;
        var write = 0;
        var sb = new StringBuilder();

        while (read < chars.length) {
            var target = chars[read];
            var count = 0;
            while (read < chars.length && chars[read] == target) {
                read++;
                count++;
            }

            chars[write++] = target;
            if (count > 1) {
                sb.setLength(0);
                sb.append(count);
                sb.getChars(0, sb.length(), chars, write);
                write += sb.length();
            }
        }

        return write;
    }
}