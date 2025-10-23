package org.example;

import java.util.*;
import java.util.stream.Collectors;

interface SolutionInterface {
    int[] intersection(int[] nums1, int[] nums2);
}

class SolutionArray implements SolutionInterface {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        if  (nums1.length > 1) {
            for(int i = 0; i < nums1.length; i++){
                for (int j = i + 1; j < nums1.length; j++){
                    if (nums1[i] == -1) break;
                    if (nums1[i] == nums1[j]) nums1[j] = -1;
                }
            }
        }

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if (nums1[i] == -1) break;
                if (nums1[i] == nums2[j]) break;
                if (j == nums2.length - 1) nums1[i] = -1;
            }
        }

        int length = 0;
        for (int i = 0; i < nums1.length; i++) {
            if  (nums1[i] != -1)
                length++;
        }

        int[] result = new int[length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if  (nums1[i] != -1)
                result[index++] = nums1[i];
        }

        return result;
    }
}

class SolutionCollection1 implements SolutionInterface {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        set1.retainAll(set2);

        return set1.stream().mapToInt(i -> i).toArray();
    }
}

class SolutionCollection2 implements SolutionInterface {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        return Arrays.stream(nums1)
                .filter(i -> Arrays.binarySearch(nums2, i) >= 0)
                .distinct()
                .toArray();
    }
}