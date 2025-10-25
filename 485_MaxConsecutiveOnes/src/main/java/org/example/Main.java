package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        //int[] nums = new int[]{1,1,0,1,1,1};
        //int[] nums = new int[]{1,0,1,1,0,1};
//        int[] nums = new int[]{1,1,0,1,1,1};
//        int[] nums = new int[]{1,0,1,1,0,1};
//        int[] nums = new int[]{1,1,1,1,1};
//        int[] nums = new int[]{0,0,0,0,0};
//        int[] nums = new int[]{1,0,1,0,1,0,1};
//        int[] nums = new int[]{1,1,0,1,1,1,0,1,1,1,1};
//        int[] nums = new int[]{1};
//        int[] nums = new int[]{0};
//        int[] nums = new int[]{1,1,1,0,0,1,1,0,1,1,1,1,0};
//        int[] nums = new int[]{0,1,1,1,0,1,1,0,1,1,1,1,1};
//        int[] nums = new int[]{1,0,0,1,0,1,0,0,1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,0,1,1,1,1,0};
        int[] nums = new int[]{1,1,1,1,1,0,1,1,1,1,1,1,1};

        System.out.println(s.findMaxConsecutiveOnes(nums));
    }
}