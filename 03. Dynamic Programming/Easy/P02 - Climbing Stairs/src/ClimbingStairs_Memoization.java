public class ClimbingStairs_Memoization {

    // Time Complexity : O(n)
    // Space Complexity : O(n) for recursion stack space + O(n) for extra dp array
    public static int climbingStairs(int n, int[] dp) {
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;

        // if previously calculated just return the value
        if (dp[n] != -1)
            return dp[n];

        // calculate and store the answer
        dp[n] = climbingStairs(n-1, dp) + climbingStairs(n-2, dp);

        // return the answer
        return dp[n];
    }
}
