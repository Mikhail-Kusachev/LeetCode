package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {-100, -50, 0, 50, 0, 0, 0, 0};
        int m = 4;
        int[] nums2 = {-75, -25, 25, 100};
        int n = 4;

        s.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

//        int[] nums1 = {-3, -3, -1, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {-3, 0, 2};
//        int n = 3;

//        int[] nums1 = {-4, -2, 0, 0, 0};
//        int m = 2;
//        int[] nums2 = {-3, -1, 1};
//        int n = 3;

//        int[] nums1 = {-7, -5, -3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {-6, -4, -2};
//        int n = 3;

//        int[] nums1 = {10, 20, 30, 0, 0};
//        int m = 3;
//        int[] nums2 = {15, 25};
//        int n = 2;

//        int[] nums1 = {1, 2, 3, 4, 0, 0};
//        int m = 4;
//        int[] nums2 = {5, 6};
//        int n = 2;

//        int[] nums1 = {1, 3, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {2, 3, 4};
//        int n = 3;

//        int[] nums1 = {2, 0};
//        int m = 1;
//        int[] nums2 = {1};
//        int n = 1;

//        int[] nums1 = {0, 0, 0};
//        int m = 0;
//        int[] nums2 = {1, 2, 3};
//        int n = 3;

//        int[] nums1 = {1, 2, 3};
//        int m = 3;
//        int[] nums2 = {};
//        int n = 0;

//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {4, 5, 6};
//        int n = 3;

//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = new int[]{2,5,6};
//        int n = 3;

//        int[] nums1 = new int[]{1};
//        int m = 1;
//        int[] nums2 = new int[]{};
//        int n = 0;

//        int[] nums1 = new int[]{0};
//        int m = 0;
//        int[] nums2 = new int[]{1};
//        int n = 1;

//        int[] nums1 = {1, 3, 5, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {2, 4, 6};
//        int n = 3;

//        int[] nums1 = {4, 5, 6, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {1, 2, 3};
//        int n = 3;
    }
}