import java.util.Arrays;

public class NinjaTraining_Memoization {

    public static int getMaxMeritPts(int n, int[][] points) {
        int[][] dp = new int[n][4];

        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        return helper(points, n - 1, 3, dp);
    }

    private static int helper(int[][] points, int day, int lastTask, int[][] dp) {
        if (day == 0) {
            int maxMeritPts = 0;
            for (int task = 0; task < 3; task++) {
                if (task != lastTask) {
                    maxMeritPts = Math.max(maxMeritPts, points[0][task]);
                }
            }
            return maxMeritPts;
        }

        if (dp[day][lastTask] != -1) return dp[day][lastTask];

        int maxMeritPts = Integer.MIN_VALUE;

        for (int task = 0; task < 3; task++) {
            if (task == lastTask) continue;

            int pickedTask = points[day][task] + helper(points, day - 1, task, dp);
            maxMeritPts = Math.max(maxMeritPts, pickedTask);
        }

        return dp[day][lastTask] = maxMeritPts;
    }
}
