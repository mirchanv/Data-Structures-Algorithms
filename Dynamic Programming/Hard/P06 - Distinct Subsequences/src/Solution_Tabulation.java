import java.util.Arrays;

public class Solution_Tabulation {

    // Time Complexity  : O(n x m)
    // Space Complexity : O(n x m) for dp array
    public static int distinctSubsequences(String str, String sub) {
        int n = str.length();
        int m = sub.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) dp[i][0] = 1;
        for (int i = 1; i <= m; i++) dp[0][i] = 0;

        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (str.charAt(ind1 - 1) == sub.charAt(ind2 - 1))
                    dp[ind1][ind2] = dp[ind1 - 1][ind2 - 1] + dp[ind1 - 1][ind2];
                else
                    dp[ind1][ind2] = dp[ind1 - 1][ind2];
            }
        }
        return dp[n][m];
    }
}
