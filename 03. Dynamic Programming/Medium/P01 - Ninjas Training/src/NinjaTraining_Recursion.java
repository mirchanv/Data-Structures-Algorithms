public class NinjaTraining_Recursion {

    public static int getMaxMeritPts(int n, int[][] points) {
        return helper(points, n-1, -1);
    }

    private static int helper(int[][] points, int day, int lastTaskPerformed) {
        if (day < 0)
            return 0;

        int maxMeritPts = Integer.MIN_VALUE;

        for (int task = 0; task < 3; task++) {
            if (task == lastTaskPerformed) continue;

            int pickedTask = points[day][task] + helper(points, day-1, task);
            maxMeritPts = Math.max(maxMeritPts, pickedTask);
        }

        return maxMeritPts;
    }
}
