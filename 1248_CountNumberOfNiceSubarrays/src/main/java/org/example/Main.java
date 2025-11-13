package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.numberOfSubarrays(new int[]{1,1,2,1,1}, 3));
        System.out.println(s.numberOfSubarrays(new int[]{2,4,6}, 1));
        System.out.println(s.numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2}, 2));


    }
}