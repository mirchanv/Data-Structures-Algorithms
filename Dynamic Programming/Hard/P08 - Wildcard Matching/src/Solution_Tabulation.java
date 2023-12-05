public class Solution_Tabulation   {

    // Time Complexity  : O(mxn)
    // Space Complexity : O(mxn) fo dp array
    public static boolean isMatch(String s, String p) {
        int m = p.length();
        int n = s.length();
        boolean[][] dp = new boolean[m+1][n+1];

        dp[0][0] = true;

        for (int ind2 = 1; ind2 <= n; ind2++)
            dp[0][ind2] = false;

        for (int ind1 = 1; ind1 <= m; ind1++)
            dp[ind1][0] = isAllStars(p, ind1);

        for (int ind1 = 1; ind1 <= m; ind1++) {
            for (int ind2 = 1; ind2 <= n; ind2++) {
                if (p.charAt(ind1-1) == s.charAt(ind2-1) || p.charAt(ind1-1) == '?')
                    dp[ind1][ind2] = dp[ind1-1][ind2-1];
                else if (p.charAt(ind1-1) == '*')
                    dp[ind1][ind2] = dp[ind1-1][ind2] || dp[ind1][ind2-1];
                else
                    dp[ind1][ind2] = false;
            }
        }

        return dp[m][n];
    }

    private static boolean isAllStars(String str, int i) {
        for (int j = 1; j<=i; j++) {
            if (str.charAt(i-1) != '*') return false;
        }
        return true;
    }
}
