package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.maxOperations(new int[]{6,6,6}, 5) + " = 2");
        System.out.println(s.maxOperations(new int[]{5,6,6}, 5) + " = 2");
        System.out.println(s.maxOperations(new int[]{3,1,3,4,3}, 6) + " = 1");
        System.out.println(s.maxOperations(new int[]{1,1,1,1}, 2) + " = 2");
        System.out.println(s.maxOperations(new int[]{1}, 2) + " = 0");
        System.out.println(s.maxOperations(new int[]{5,5,5,5}, 10) + " = 2");
        System.out.println(s.maxOperations(new int[]{1,3,5,7}, 8) + " = 2");
        System.out.println(s.maxOperations(new int[]{2,2,2,2,2}, 4) + " = 2");
        System.out.println(s.maxOperations(new int[]{1,2,3,4,5,6}, 7) + " = 3");
        System.out.println(s.maxOperations(new int[]{1000000000,1000000000,1000000000,1000000000}, 2000000000) + " = 2");
        System.out.println(s.maxOperations(new int[]{1,1,1,1,1,1,1,1,1,1}, 2) + " = 5");
        System.out.println(s.maxOperations(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3) + " = 4");
        System.out.println(s.maxOperations(new int[]{1,2,3,4,5,6,7,8,9,10}, 11) + " = 5");
        System.out.println(s.maxOperations(new int[]{1,1,1,1,2,2,2,2,3,3,3,3}, 4) + " = 6");
        System.out.println(s.maxOperations(new int[]{1,3,5,7,9,11,13,15,17,19}, 20) + " = 5");
        System.out.println(s.maxOperations(new int[]{1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2}, 3) + " = 10");
        System.out.println(s.maxOperations(new int[]{4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4}, 8) + " = 10");
    }
}