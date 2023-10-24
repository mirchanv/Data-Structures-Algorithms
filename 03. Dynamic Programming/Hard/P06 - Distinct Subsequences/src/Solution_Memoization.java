import java.util.Arrays;

public class Solution_Memoization {

    // Time Complexity  : O(n x m)
    // Space Complexity : O(n + m) for recursion stack space + O(n x m) for dp array
    public static int distinctSubsequences(String str, String sub) {
        int n = str.length();
        int m = sub.length();

        int[][] dp = new int[n][m];
        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(str, sub, n-1, m-1, dp);
    }

    private static int helper(String s1, String s2, int ind1, int ind2, int[][] dp) {
        if (ind2 < 0) return 1;
        else if (ind1 < 0 ) return 0;

        if (dp[ind1][ind2] != -1)  return dp[ind1][ind2];

        if (s1.charAt(ind1) == s2.charAt(ind2))
            dp[ind1][ind2] = helper(s1, s2, ind1-1, ind2-1, dp) + helper(s1, s2, ind1-1, ind2, dp);
        else
            dp[ind1][ind2] = helper(s1, s2, ind1 - 1, ind2, dp);

        return dp[ind1][ind2];
    }
}
