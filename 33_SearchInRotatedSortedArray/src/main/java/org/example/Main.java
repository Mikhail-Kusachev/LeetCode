package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.search(new int[]{0,1,2,3,4,5,6}, 6) + " = 6");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2}, 0) + " = 4");
        System.out.println(s.search(new int[]{6,7,0,1,2,4,5}, 0) + " = 2");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2}, 3) + " = -1");
        System.out.println(s.search(new int[]{1}, 0) + " = -1");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2}, 0) + " = 4");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2}, 3) + " = -1");
        System.out.println(s.search(new int[]{1}, 0) + " = -1");
        System.out.println(s.search(new int[]{1}, 1) + " = 0");
        System.out.println(s.search(new int[]{3,1}, 1) + " = 1");
        System.out.println(s.search(new int[]{6,7,0,1,2,4,5}, 0) + " = 2");
        System.out.println(s.search(new int[]{}, 5) + " = -1");
        System.out.println(s.search(new int[]{1,3}, 2) + " = -1");
        System.out.println(s.search(new int[]{5,1,3}, 5) + " = 0");
        System.out.println(s.search(new int[]{3,5,1}, 3) + " = 0");
        System.out.println(s.search(new int[]{4,5,6,7,8,1,2,3}, 8) + " = 4");
        System.out.println(s.search(new int[]{2,3,4,5,6,7,8,9,1}, 9) + " = 7");
    }
}