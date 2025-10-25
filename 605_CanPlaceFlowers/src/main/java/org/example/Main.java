package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

//        System.out.println(s.canPlaceFlowers(new int[]{1,0,0,0,1}, 1)); // true
//        System.out.println(s.canPlaceFlowers(new int[]{1,0,0,0,1}, 2)); // false

//        System.out.println(s.canPlaceFlowers(new int[]{0}, 1)); // true
//        System.out.println(s.canPlaceFlowers(new int[]{1}, 0)); // true
//        System.out.println(s.canPlaceFlowers(new int[]{1}, 1)); // false
//        System.out.println(s.canPlaceFlowers(new int[]{0}, 0)); // true

//        System.out.println(s.canPlaceFlowers(new int[]{}, 0));  // true
//        System.out.println(s.canPlaceFlowers(new int[]{}, 1));  // false
        System.out.println(s.canPlaceFlowers(new int[]{0,0,0,0,0}, 3));  // true
        System.out.println(s.canPlaceFlowers(new int[]{0,0,0,0,0}, 4));  // false

    }
}