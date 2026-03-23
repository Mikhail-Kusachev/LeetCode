package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] testCases = {
                "192.168.1.1",
                "192.168.1.1.1",
                "0.0.0.0",
                "255.255.255.255",
                "192.168.01.1",
                "192.168.1.00",
                "256.1.1.1",
                "192.168@1.1",
                "2001:0db8:85a3:0000:0000:8a2e:0370:7334",
                "2001:db8:85a3:0:0:8A2E:0370:7334",
                "2001:0db8:85a3::8A2E:037j:7334",
                "2001:0db8:85a3:0000:0000:8a2e:0370:7334",
                "::1",
                "2001:db8:85a3::8A2E:0370:7334",
                "2001:0db8:85a3:0000:0000:8a2e:0370:7334:"
        };
        for (String test : testCases)
            System.out.println(test + " -> " + s.validIPAddress(test));
    }
}

class Solution {
    public String validIPAddress(String queryIP) {
        if (queryIP == null || queryIP.length() == 0)
            return "Neither";
        if (queryIP.contains("."))
            return isIPv4(queryIP) ? "IPv4" : "Neither";
        else if (queryIP.contains(":"))
            return isIPv6(queryIP) ? "IPv6" : "Neither";
        else
            return "Neither";
    }

    private boolean isIPv4(String s) {
        var parts = s.split("\\.", -1);
        if (parts.length != 4) return false;

        for (var part : parts) {
            if (part.length() == 0 || (part.length() > 3)) return false;
            if (part.length() > 1 && part.startsWith("0")) return false;
            for (char c : part.toCharArray())
                if (!Character.isDigit(c)) return false;
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) return false;
        }

        return true;
    }

    private boolean isIPv6(String s) {
        var parts = s.split(":", -1);
        if (parts.length != 8)
            return false;
        for (var part : parts) {
            if (part.length() == 0 || part.length() > 4)
                return false;
            for (var c : part.toCharArray()) {
                if (!isHex(c)) return false;
            }
        }
        return true;
    }

    private boolean isHex(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }
}