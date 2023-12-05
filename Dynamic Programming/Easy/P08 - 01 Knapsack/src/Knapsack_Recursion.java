public class Knapsack_Recursion {

    // Time Complexity  : O(2^n)
    // Space Complexity : O(n) for recursion stack space
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        return helper(weight, value, maxWeight, n-1);
    }

    private static int helper(int[]weight, int[] value, int maxWeight, int index) {
        if (index == 0) {
            if (weight[0] <= maxWeight) return value[0];
            return 0;
        }

        int pick = 0;
        if (weight[index] <= maxWeight)
            pick = value[index] + helper(weight, value, maxWeight-weight[index], index-1);

        int notPick = 0 + helper(weight, value, maxWeight, index-1);

        return Math.max(pick, notPick);
    }
}
