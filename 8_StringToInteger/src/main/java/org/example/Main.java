package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.myAtoi("42") + " Expected 42");
        System.out.println(s.myAtoi("   -42") + " Expected -42");
        System.out.println(s.myAtoi("4193 with words") + " Expected 4193");
        System.out.println(s.myAtoi("0-1") + " Expected 0");
        System.out.println(s.myAtoi("-42") + " Expected -42");
        System.out.println(s.myAtoi("+42") + " Expected 42");
        System.out.println(s.myAtoi("+-42") + " Expected 0");
        System.out.println(s.myAtoi("-+42") + " Expected 0");
        System.out.println(s.myAtoi("   -042") + " Expected -42");
        System.out.println(s.myAtoi("   +0042") + " Expected 42");
        System.out.println(s.myAtoi("1337c0d3") + " Expected 1337");
        System.out.println(s.myAtoi("words and 987") + " Expected 0");
        System.out.println(s.myAtoi("   123") + " Expected 123");
        System.out.println(s.myAtoi("   ") + " Expected 0");
        System.out.println(s.myAtoi("") + " Expected 0");
        System.out.println(s.myAtoi("2147483647") + " Expected 2147483647");
        System.out.println(s.myAtoi("2147483648") + " Expected 2147483647");
        System.out.println(s.myAtoi("-2147483648") + " Expected -2147483648");
        System.out.println(s.myAtoi("-2147483649") + " Expected -2147483648");
        System.out.println(s.myAtoi("9999999999") + " Expected 2147483647");
        System.out.println(s.myAtoi("-9999999999") + " Expected -2147483648");
        System.out.println(s.myAtoi("0") + " Expected 0");
        System.out.println(s.myAtoi("1") + " Expected 1");
        System.out.println(s.myAtoi("-1") + " Expected -1");
        System.out.println(s.myAtoi("+1") + " Expected 1");
        System.out.println(s.myAtoi("a") + " Expected 0");
        System.out.println(s.myAtoi("-") + " Expected 0");
        System.out.println(s.myAtoi("+") + " Expected 0");
        System.out.println(s.myAtoi("00000-42a1234") + " Expected 0");
        System.out.println(s.myAtoi("   +0 123") + " Expected 0");
        System.out.println(s.myAtoi("20000000000000000000") + " Expected 2147483647");
        System.out.println(s.myAtoi("-91283472332") + " Expected -2147483648");
        System.out.println(s.myAtoi("3.14159") + " Expected 3");
        System.out.println(s.myAtoi("  -0012a42") + " Expected -12");
        System.out.println(s.myAtoi("123-") + " Expected 123");
        System.out.println(s.myAtoi("-5-") + " Expected -5");




    }
}