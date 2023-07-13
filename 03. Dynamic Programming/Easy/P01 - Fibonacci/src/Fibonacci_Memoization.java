public class Fibonacci_Memoization {

    // Time Complexity  : O(n)
    // Space Complexity : O(n) recursion stack space used + extra array space used so O(n)
    public static int fib(int n, int[] dp) {
        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }
}
