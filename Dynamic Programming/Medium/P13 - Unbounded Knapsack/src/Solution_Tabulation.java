public class Solution_Tabulation {

    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        int[][] dp = new int[n][w+1];

        for (int i = 0; i <= w; i++) dp[0][i] = (i / weight[0]) * profit[0];

        for (int ind = 1; ind < n; ind++) {
            for (int cap = 0; cap <= w ; cap++) {
                int pick = Integer.MIN_VALUE;
                if (weight[ind] <= cap)
                    pick = profit[ind] + dp[ind][cap-weight[ind]];

                int notPick = dp[ind-1][cap];

                dp[ind][cap] = Math.max(pick, notPick);
            }
        }
        return dp[n-1][w];
    }
}
