package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] input;

//        input = new int[][]{{1,3},{2,6},{8,10},{15,18}};
//        System.out.println(Arrays.deepToString(new Solution().merge(input)));
//
//        input = new int[][]{{1,4},{4,5}};
//        System.out.println(Arrays.deepToString(new Solution().merge(input)));
//
//        input = new int[][]{{4,7},{1,4}};
//        System.out.println(Arrays.deepToString(new Solution().merge(input)));
//
//        input = new int[][]{{1,3}};
//        System.out.println(Arrays.deepToString(new Solution().merge(input)));
//
//        input = new int[][]{{2,3},{1,10},{5,8}};
//        System.out.println(Arrays.deepToString(new Solution().merge(input)));
//
//        input = new int[][]{{1,2},{5,6},{10,11}};
//        System.out.println(Arrays.deepToString(new Solution().merge(input)));
//
//        input = new int[][]{};
//        System.out.println(Arrays.deepToString(new Solution().merge(input)));
//
//        input = new int[][]{{1,10},{2,3},{4,5},{6,7},{8,9}};
//        System.out.println(Arrays.deepToString(new Solution().merge(input)));

        input = new int[][]{{1,3},{2,4},{3,5}};
        System.out.println(Arrays.deepToString(new Solution().merge(input)));

        input = new int[][]{{1,3},{4,6},{2,5}};
        System.out.println(Arrays.deepToString(new Solution().merge(input)));
    }
}