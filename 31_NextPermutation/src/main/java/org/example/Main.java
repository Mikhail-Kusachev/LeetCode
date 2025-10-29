package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums;

        //nums = new int[]{1,2,3};
        //nums = new int[]{3,2,1};
        //nums = new int[]{1,3,4,2};
        //nums = new int[]{1,1,5};
        nums = new int[]{1,3,2};

        //expected = [3,1,2]
        //nums = new int[]{2,3,1};

        // expected = [2,1]
        //nums = new int[]{1,2};

        // expected = [1]
        //nums = new int[]{1};

        // expected = [1,2,3,4,5]
        //nums = new int[]{5,4,3,2,1};

        // expected = [1,5,8,5,1,3,4,6,7]
        //nums = new int[]{1,5,8,4,7,6,5,3,1};

        // expected = [5,1,1]
        //nums = new int[]{1,5,1};

        // expected = [2,3,1]
        //nums = new int[]{2,1,3};

        // expected = [1,4,2,3,5]
        //nums = new int[]{1,3,5,4,2};

        new Solution().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}