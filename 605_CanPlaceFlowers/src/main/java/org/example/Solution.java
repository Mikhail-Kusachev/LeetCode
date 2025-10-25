package org.example;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        int length = flowerbed.length;
        int[] array = new int[length + 2];
        System.arraycopy(flowerbed, 0, array, 1, length);
        array[0] = 0;
        array[length + 1] = 0;

        for (int i = 1; i < length + 1; i++) {
            if (array[i] == 0 && array[i-1] == 0 && array[i+1] == 0) {
                array[i] = 1;
                counter++;
            }
        }

        return counter >= n;
    }
}