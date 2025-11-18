package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3) + " = true");
        System.out.println(s.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13) + " = false");
        System.out.println(s.searchMatrix(new int[][]{{1}}, 1) + " = true");
        System.out.println(s.searchMatrix(new int[][]{{1}}, 2) + " = false");
        System.out.println(s.searchMatrix(new int[][]{{1,2},{3,4}}, 3) + " = true");
        System.out.println(s.searchMatrix(new int[][]{{1,2},{3,4}}, 5) + " = false");
        System.out.println(s.searchMatrix(new int[][]{{1,3,5},{7,9,11},{13,15,17}}, 9) + " = true");
        System.out.println(s.searchMatrix(new int[][]{{1,3,5},{7,9,11},{13,15,17}}, 8) + " = false");
        System.out.println(s.searchMatrix(new int[][]{{-10,-8,-6},{-5,-3,-1},{0,2,4}}, -3) + " = true");
        System.out.println(s.searchMatrix(new int[][]{{-10,-8,-6},{-5,-3,-1},{0,2,4}}, 1) + " = false");
    }
}