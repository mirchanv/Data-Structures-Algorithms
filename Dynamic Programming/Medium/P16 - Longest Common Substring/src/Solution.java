public class Solution {

    public static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        return helper(str1, str2, n, m);
    }

    private static int helper(String s1, String s2, int n, int m) {
        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i <= m; i++) dp[0][i] = 0;
        for (int i = 0; i <= n; i++) dp[i][0] = 0;

        int maxi = 0;
        for (int i = 1; i<= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = 0;
                }
                maxi = Math.max(maxi, dp[i][j]);
            }
        }
        return maxi;
    }
}
