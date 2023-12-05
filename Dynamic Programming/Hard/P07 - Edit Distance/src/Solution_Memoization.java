import java.util.Arrays;

public class Solution_Memoization {

    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];

        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(word1, word2, n-1, m-1, dp);
    }

    private static int helper(String s1, String s2, int ind1, int ind2, int[][] dp) {
        if (ind1 < 0) return ind2 + 1;
        else if (ind2 < 0) return ind1 + 1;

        if (dp[ind1][ind2] != -1) return dp[ind1][ind2];

        if (s1.charAt(ind1) == s2.charAt(ind2))
            dp[ind1][ind2] = 0 + helper(s1, s2, ind1-1, ind2-1, dp);
        else
            dp[ind1][ind2] = 1 + Math.min(helper(s1, s2, ind1, ind2-1, dp), Math.min(helper(s1, s2, ind1-1, ind2, dp), helper(s1, s2, ind1-1, ind2-1, dp)));

        return dp[ind1][ind2];
    }
}
