public class ClimbStairs_Recursion {

    public static int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost, 0) , helper(cost, 1));
    }

    private static int helper(int[] cost, int index) {
        if (index == cost.length)
            return 0;

        int oneStep = cost[index] + helper(cost, index + 1);

        if ((index + 2) <= cost.length)
            return Math.min(oneStep, cost[index] + helper(cost, index + 2));

        return oneStep;
    }
}
