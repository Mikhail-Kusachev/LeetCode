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
    private static final String REGEX_IP4 = "^(\\d{1,3}\\.){3}\\d{1,3}$";
    private static final String REGEX_IP6 = "^([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4}$";
    private static final String DELIMITER_IP4 = "\\.";
    private static final String ANSWER_FALSE = "Neither";
    private static final String ANSWER_IP4 = "IPv4";
    private static final String ANSWER_IP6 = "IPv6";

    public String validIPAddress(String queryIP) {
        if (queryIP.matches(REGEX_IP4)) {
            var parts = queryIP.split(DELIMITER_IP4);
            for (var part : parts) {
                if (part.charAt(0) == '0' && part.length() > 1)
                    return ANSWER_FALSE;
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255)
                    return ANSWER_FALSE;
            }
            return ANSWER_IP4;
        }
        else if (queryIP.matches(REGEX_IP6)) return ANSWER_IP6;

        return ANSWER_FALSE;
    }
}