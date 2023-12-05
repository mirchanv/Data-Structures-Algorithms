public class ClimbingStairs_Tabulation {

    // Time Complexity : O(n)
    // Space Complexity : O(n), extra space for dp array is used
    public static int climbingStairs(int n, int[] dp) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }


    // Time Complexity : O(n)
    // Space Complexity : O(1), no extra space used
    public static int climbingStairs_optimised(int n) {
        int prev1 = 1;
        int prev2 = 1;

        for (int i = 2; i <= n; i++) {
            int currFib = prev1 + prev2;
            prev2 = prev1;
            prev1 = currFib;
        }

        return prev1;
    }
}
