public class Knapsack_Tabulation {

    // Time Complexity  : O(n x maxWeight)
    // Space Complexity : O(n x maxWeight) for dp array
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight+1];
        return helper(weight, value, maxWeight, n, dp);
    }

    private static int helper(int[]weight, int[] value, int maxWeight, int n, int[][]dp) {
        for(int i=weight[0]; i<=maxWeight; i++) dp[0][i] = value[0];

        for (int ind = 1; ind < n; ind++) {
            for (int cap = 1; cap <= maxWeight; cap++) {
                int pick = 0;
                if (weight[ind] <= cap)
                    pick = value[ind] + dp[ind-1][cap-weight[ind]];

                int notPick = 0 + dp[ind-1][cap];

                dp[ind][cap] = Math.max(pick, notPick);
            }
        }

        return dp[n-1][maxWeight];
    }
}
