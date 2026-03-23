package org.example;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(e -> e[0]));
        int write = 0;

        for (int read = 1; read < intervals.length; read++) {
            if (intervals[write][1] >= intervals[read][0]) {
                intervals[write][1] = Math.max(intervals[write][1], intervals[read][1]);
            } else {
                write++;
                intervals[write] = intervals[read];
            }
        }

        return Arrays.copyOfRange(intervals, 0, write + 1);
    }
}