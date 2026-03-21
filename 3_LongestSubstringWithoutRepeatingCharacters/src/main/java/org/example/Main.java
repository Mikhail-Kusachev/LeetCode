package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input: \"\" → Expected: 0 → Output: " + new Solution().lengthOfLongestSubstring(""));
        System.out.println("Input: \" \" → Expected: 1 → Output: " + new Solution().lengthOfLongestSubstring(" "));
        System.out.println("Input: \"au\" → Expected: 2 → Output: " + new Solution().lengthOfLongestSubstring("au"));
        System.out.println("Input: \"dvdf\" → Expected: 3 → Output: " + new Solution().lengthOfLongestSubstring("dvdf"));
        System.out.println("Input: \"anviaj\" → Expected: 5 → Output: " + new Solution().lengthOfLongestSubstring("anviaj"));
        System.out.println("Input: \"tmmzuxt\" → Expected: 5 → Output: " + new Solution().lengthOfLongestSubstring("tmmzuxt"));
        System.out.println("Input: \"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\" → Expected: 52 → Output: " + new Solution().lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println("Input: \"aab\" → Expected: 2 → Output: " + new Solution().lengthOfLongestSubstring("aab"));
        System.out.println("Input: \"abba\" → Expected: 2 → Output: " + new Solution().lengthOfLongestSubstring("abba"));
        System.out.println("Input: \"abcabcbbdefghijklmnopqrstuvwxyz\" → Expected: 24 → Output: " + new Solution().lengthOfLongestSubstring("abcabcbbdefghijklmnopqrstuvwxyz"));
        System.out.println("Input: \"pwwkew\" → Expected: 3 → Output: " + new Solution().lengthOfLongestSubstring("pwwkew"));
        System.out.println("Input: \"bbbbb\" → Expected: 1 → Output: " + new Solution().lengthOfLongestSubstring("bbbbb"));
        System.out.println("Input: \"abcabcbb\" → Expected: 3 → Output: " + new Solution().lengthOfLongestSubstring("abcabcbb"));
    }
}