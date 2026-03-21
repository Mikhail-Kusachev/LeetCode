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
    private static final String REGEX_IP6 = "^([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4}$";
    private static final String REGEX_IP4 = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}" +
                                              "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$";

    public String validIPAddress(String queryIP) {
        return queryIP.matches(REGEX_IP4) ? "IPv4" :
               queryIP.matches(REGEX_IP6) ? "IPv6" : "Neither";
    }
}