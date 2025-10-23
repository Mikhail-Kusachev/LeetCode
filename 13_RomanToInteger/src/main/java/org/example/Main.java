package org.example;

public class Main {
    public static void main(String[] args) {
        Solution  s = new Solution();

        System.out.println(s.romanToInt("MMMCMXCIX"));
        System.out.println(s.romanToInt("MCMXCIV"));
        System.out.println(s.romanToInt("CMXCV"));
        System.out.println(s.romanToInt("IV"));
        System.out.println(s.romanToInt("IX"));
        System.out.println(s.romanToInt("XC"));
        System.out.println(s.romanToInt("MMMCMXCIX"));
        System.out.println(s.romanToInt("CDXCIX"));
    }
}