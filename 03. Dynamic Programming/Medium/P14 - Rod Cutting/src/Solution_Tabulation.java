public class Solution_Tabulation {

    public static int cutRod(int price[], int n) {
        int[][] dp = new int[n][n+1];

        for (int i=0; i<=n; i++) dp[0][i] = i * price[0];

        for (int ind=1; ind < price.length; ind++) {
            for (int rodLength=0; rodLength <= n; rodLength++) {
                int cut = Integer.MIN_VALUE;
                if (ind+1 <= rodLength)
                    cut = price[ind] + dp[ind][rodLength-(ind+1)];

                int notCut = 0 + dp[ind-1][rodLength];

                dp[ind][rodLength] = Math.max(cut, notCut);
            }
        }
        return dp[price.length-1][n];
    }
}
