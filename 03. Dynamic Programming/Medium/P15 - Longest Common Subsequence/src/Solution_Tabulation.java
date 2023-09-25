import java.util.Arrays;

public class Solution_Tabulation {

    public static int lcs(String s, String t) {
        int ind1 = s.length();
        int ind2 = t.length();

        int[][] dp = new int[ind1+1][ind2+1];

        for (int i = 0; i <= ind2; i++) dp[0][i] = 0;
        for (int i = 0; i <= ind1; i++) dp[i][0] = 0;

        for (int i = 1; i <= ind1 ; i++) {
            for (int j = 1; j <= ind2; j++) {
                if (s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = 0 + Math.max(dp[i-1][j], dp[i][j - 1] );
            }
        }
        return dp[ind1][ind2];
    }
}
