package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().findTheDistanceValue(new int[]{5}, new int[]{1,2,3,4,6},1));
    }
}

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        var count = 0;
        Arrays.sort(arr2);

        for (int num : arr1) {
            var p = Arrays.binarySearch(arr2, num);
            if (p >= 0)
                count++;
            else {
                p = - p - 1;
                if (p > 0 && Math.abs(num - arr2[p - 1]) <= d)
                    count++;
                else if (p < arr2.length && Math.abs(num - arr2[p]) <= d)
                    count++;
            }
        }

        return arr1.length-count;
    }
}