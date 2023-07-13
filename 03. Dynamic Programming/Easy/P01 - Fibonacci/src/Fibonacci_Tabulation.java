public class Fibonacci_Tabulation {

    // Time Complexity  : O(n)
    // Space Complexity : extra array space used so O(n)
    public static int fib(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    // Time Complexity  : O(n)
    // Space Complexity : O(1), no extra space used
    public static int fib_tabu_optimised(int n) {
        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n ; i++) {
            int currFib = prev1 + prev2;
            prev2 = prev1;
            prev1 = currFib;
        }

        return prev1;
    }
}
