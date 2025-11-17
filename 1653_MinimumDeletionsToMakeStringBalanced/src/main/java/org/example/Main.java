package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.minimumDeletions("aababbab") + " = 2");
        System.out.println(s.minimumDeletions("bbaaaaabb") + " = 2");
        System.out.println(s.minimumDeletions("ababaaaabbbbbaaababbbbbbaaabbaababbabbbbaabbbbaabbabbabaabbbababaa") + " = 25");
        System.out.println(s.minimumDeletions("a") + " = 0");
        System.out.println(s.minimumDeletions("aaa") + " = 0");
        System.out.println(s.minimumDeletions("b") + " = 0");
        System.out.println(s.minimumDeletions("bbb") + " = 0");
    }
}