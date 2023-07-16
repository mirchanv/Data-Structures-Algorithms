import java.util.Arrays;

public class ClimbStairs_Memoization {

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(helper(cost, 0, dp) , helper(cost, 1, dp));
    }

    private static int helper(int[] cost, int index, int[] dp) {
        if (index >= cost.length)
            return 0;

        if (dp[index] != -1)
            return dp[index];

        int oneStep = cost[index] + helper(cost, index + 1, dp);
        int twoStep = cost[index] + helper(cost, index + 2, dp);

        return dp[index] = Math.min(oneStep, twoStep);
    }
}
