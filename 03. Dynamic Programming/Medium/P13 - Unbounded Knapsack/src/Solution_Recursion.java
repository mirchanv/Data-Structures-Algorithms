public class Solution_Recursion {

    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        return helper(weight, profit, n-1, w);
    }

    private static int helper(int[] weight, int[] profit, int index, int W) {
        if (index == 0) return (W / weight[0]) * profit[0];

        int pick = Integer.MIN_VALUE;
        if (weight[index] <= W)
            pick = profit[index] + helper(weight, profit, index, W-weight[index]);

        int notPick = 0 + helper(weight, profit, index-1, W);

        return Math.max(pick, notPick);
    }
}
