package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

//        System.out.println(s.shiftingLetters("zab", new int[]{100,2,3}) + " Expected: afe");
//        System.out.println(s.shiftingLetters("abc", new int[]{3,5,9}) + " Expected: rpl");
//        System.out.println(s.shiftingLetters("aaa", new int[]{1,2,3}) + " Expected: gfd");
//        System.out.println(s.shiftingLetters("a", new int[]{100}) + " Expected: w");
        System.out.println(s.shiftingLetters("mkgfzkkuxownxvfvxasy", new int[]{505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513}) + " Expected: wqqwlcjnkphhsyvrkdod");
//        System.out.println(s.shiftingLetters("abc", new int[]{10,10,10}) + " Expected: klm");
//        System.out.println(s.shiftingLetters("a", new int[]{26}) + " Expected: a");
    }
}