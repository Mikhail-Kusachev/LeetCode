package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long startTime, endTime;
        SolutionInterface s;

        s = new SolutionCollection2();
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(
                s.intersection(new int[]{1, 2, 2, 1},
                        new int[]{2, 2})
        ));
        System.out.println(Arrays.toString(
                s.intersection(new int[]{4,9,5},
                        new int[]{9,4,9,8,4})
        ));
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        s = new SolutionArray();
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(
                s.intersection(new int[]{1, 2, 2, 1},
                        new int[]{2, 2})
        ));
        System.out.println(Arrays.toString(
                s.intersection(new int[]{4,9,5},
                        new int[]{9,4,9,8,4})
        ));
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}