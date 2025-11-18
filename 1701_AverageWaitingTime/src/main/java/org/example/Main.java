package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.averageWaitingTime(new int[][]{{1,2},{2,5},{4,3}}) + " = 5.0");
        System.out.println(s.averageWaitingTime(new int[][]{{5,2},{5,4},{10,3},{20,1}}) + " = 3.25");
        System.out.println(s.averageWaitingTime(new int[][]{{1,1}}) + " = 1.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,1},{1,1}}) + " = 1.5");
        System.out.println(s.averageWaitingTime(new int[][]{{1,10},{2,1},{3,1}}) + " = 10.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,2},{3,4},{5,6}}) + " = 4.666666666666667");
        System.out.println(s.averageWaitingTime(new int[][]{{2,3},{6,3},{7,5},{11,3},{15,2}}) + " = 4.6");
        System.out.println(s.averageWaitingTime(new int[][]{{1,1}}) + " = 1.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,10000}}) + " = 10000.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,1},{1,1},{1,1},{1,1},{1,1}}) + " = 3.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,10000},{10000,1}}) + " = 5001.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,1},{2,1},{3,1},{4,1},{5,1}}) + " = 1.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,5},{1,5},{1,5},{1,5},{1,5}}) + " = 15.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,1},{10000,10000}}) + " = 5000.5");
        System.out.println(s.averageWaitingTime(new int[][]{{1,2},{1,3},{1,4},{1,5},{1,6}}) + " = 10.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,10},{2,10},{3,10},{4,10},{5,10}}) + " = 28.0");
        System.out.println(s.averageWaitingTime(new int[][]{{10000,1},{10000,1},{10000,1}}) + " = 2.0");
        System.out.println(s.averageWaitingTime(new int[][]{{1,1},{10000,10000}}) + " = 5000.5");
        System.out.println(s.averageWaitingTime(new int[][]{{1,10000},{10000,10000}}) + " = 10000.5");
    }
}