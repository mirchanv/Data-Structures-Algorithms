import java.util.Arrays;

public class Solution_Memoization {

    public static int lcs(String s, String t) {
        int ind1 = s.length();
        int ind2 = t.length();

        int[][] dp = new int[ind1][ind2];
        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(s, t, ind1-1, ind2-1, dp);
    }

    private static int helper(String s1, String s2, int ind1, int ind2, int[][] dp) {
        if (ind1 < 0 || ind2 < 0) return 0;

        if (dp[ind1][ind2] != -1) return dp[ind1][ind2];

        if (s1.charAt(ind1) == s2.charAt(ind2))
            dp[ind1][ind2] = 1 + helper(s1, s2, ind1 - 1, ind2 - 1, dp);
        else
            dp[ind1][ind2] = 0 + Math.max(helper(s1, s2, ind1 - 1, ind2, dp), helper(s1, s2, ind1, ind2 - 1, dp));

        return dp[ind1][ind2];
    }
}
