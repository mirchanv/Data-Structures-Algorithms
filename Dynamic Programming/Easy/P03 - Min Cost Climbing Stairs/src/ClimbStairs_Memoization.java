import java.util.Arrays;

public class ClimbStairs_Memoization {

    public static int minCostClimbingStairs(int[] cost) {
            int[] dp = new int[cost.length];
            Arrays.fill(dp, -1);

            if (cost.length == 1)
                return cost[0];
            else
                return Math.min(helper(cost, 0, dp) , helper(cost, 1, dp));
        }

        private static int helper(int[] cost, int index, int[] dp) {
            if (index == cost.length)
                return 0;

            if (dp[index] != -1)
                return dp[index];

            int oneStep = cost[index] + helper(cost, index + 1, dp);

            if ((index + 2) <= cost.length)
                return dp[index] = Math.min(oneStep, cost[index] + helper(cost, index + 2, dp));

            return dp[index] = oneStep;
        }
}
