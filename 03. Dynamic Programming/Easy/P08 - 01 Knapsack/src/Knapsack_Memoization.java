import java.util.Arrays;

public class Knapsack_Memoization {

    // Time Complexity  : O(n x maxWeight)
    // Space Complexity : O(n) for recursion stack space + O(n x maxWeight) for dp array
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight+1];
        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(weight, value, n-1, maxWeight, dp);
    }

    private static int helper(int[]weight, int[] value, int index, int maxWeight, int[][]dp) {
        if (index == 0) {
            if (weight[0] <= maxWeight) return value[0];
            return 0;
        }

        if (dp[index][maxWeight] != -1) return dp[index][maxWeight];

        int pick = 0;
        if (weight[index] <= maxWeight)
            pick = value[index] + helper(weight, value, index-1, maxWeight-weight[index], dp);

        int notPick = 0 + helper(weight, value, index-1, maxWeight, dp);

        return dp[index][maxWeight] = Math.max(pick, notPick);
    }
}
