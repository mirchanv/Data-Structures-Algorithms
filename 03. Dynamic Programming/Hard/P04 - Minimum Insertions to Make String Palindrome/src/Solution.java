class Solution {
    public static int minInsertions(String s) {
        int maxInsertions = s.length();
        String s2 = new StringBuilder(s).reverse().toString();

        int n = s.length();
        int[][] dp = new int[n+1][n+1];

        for (int i=0; i<=n; i++) dp[0][i] = 0;
        for (int i=0; i<=n; i++) dp[i][0] = 0;

        for (int ind1 = 1; ind1 <=n; ind1++) {
            for (int ind2 = 1; ind2 <=n; ind2++) {
                if (s.charAt(ind1-1) == s2.charAt(ind2-1))
                    dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                else
                    dp[ind1][ind2] = Math.max(dp[ind1-1][ind2], dp[ind1][ind2-1]);
            }
        }

        int lcs = dp[n][n];
        return maxInsertions - lcs;
    }
}