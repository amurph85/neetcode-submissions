class Solution {
    public double averageWaitingTime(int[][] customers) {
        long totalWait = 0;
        long nextTime = 0;

        for (int i = 0; i < customers.length; i++) {
            int arrival = customers[i][0];
            int cookTime = customers[i][1];

            nextTime = Math.max(nextTime, arrival) + cookTime;
            totalWait += nextTime - arrival;
        }

        return (double) totalWait / customers.length;
    }
}