package org.example;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int colSize = matrix[0].length;
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / colSize;
            int col = mid % colSize;
            int current = matrix[row][col];
            if (current ==  target)
                return true;
            else if (current > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return false;
    }
}