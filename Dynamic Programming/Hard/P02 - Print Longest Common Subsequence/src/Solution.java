public class Solution {

    public static String printLCS(int n, int m, String s1, String s2){
        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i <= m; i++) dp[0][i] = 0;
        for (int i = 0; i <= n; i++) dp[i][0] = 0;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = 0 + Math.max(dp[i-1][j], dp[i][j - 1] );
            }
        }

        int lcs =  dp[n][m];

        String str = "";
        for (int i = 0; i < lcs; i++) {
            str += '$';
        }

        int i = n;
        int j = m;
        int strIndex = str.length()-1;
        StringBuilder sb1 = new StringBuilder(str);

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb1.setCharAt(strIndex, s1.charAt(i-1));
                strIndex--;
                i--;
                j--;
            } else if (dp[i-1][j] > dp[i][j - 1])
                i--;
            else
                j--;
        }

        return sb1.toString();
    }
}
