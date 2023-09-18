import java.util.Arrays;

public class Solution_Memoization {

    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        int[][] dp = new int[n][w+1];
        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(weight, profit, n-1, w, dp);
    }

    private static int helper(int[] weight, int[] profit, int index, int W, int[][] dp) {
        if (index == 0) return (W / weight[0]) * profit[0];

        if (dp[index][W] != -1) return dp[index][W];

        int pick = Integer.MIN_VALUE;
        if (weight[index] <= W)
            pick = profit[index] + helper(weight, profit, index, W-weight[index], dp);

        int notPick = 0 + helper(weight, profit, index-1, W, dp);

        return dp[index][W] = Math.max(pick, notPick);
    }
}
