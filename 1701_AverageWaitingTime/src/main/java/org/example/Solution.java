package org.example;

class Solution {
    public double averageWaitingTime(int[][] customers) {
        long busy = 0;
        long prevTime = 0;
        long waitingTime = 0;

        for (int[] customer : customers) {
            long currentTime = customer[0] - prevTime;
            prevTime = customer[0];

            if (currentTime >= busy)
                busy = 0;
            else
                busy -= currentTime;

            waitingTime += busy + customer[1];
            busy += customer[1];
        }

        return (double) waitingTime / customers.length;
    }
}