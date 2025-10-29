package org.example;

class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;

        boolean isChanges;
        do {
            isChanges = false;
            for (int i = 0; i < intervals.length - 1; i++) {
                if (intervals[i][0] == -1) continue;
                for (int j = i + 1; j < intervals.length; j++) {
                    if (intervals[j][0] == -1) continue;
                    if (intervals[i][0] <= intervals[j][1] && intervals[j][0] <= intervals[i][1]) {
                        intervals[i][0] = Math.min(intervals[i][0], intervals[j][0]);
                        intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
                        intervals[j][0] = -1;
                        len--;
                        isChanges = true;
                    }
                }
            }
        } while (isChanges);

        int[][] result = new int[len][2];
        int index = 0;
        for (int i = 0; i < intervals.length; i++){
            if (intervals[i][0] != -1) {
                result[index][0] = intervals[i][0];
                result[index++][1] = intervals[i][1];
            }
        }

        return result;
    }
}