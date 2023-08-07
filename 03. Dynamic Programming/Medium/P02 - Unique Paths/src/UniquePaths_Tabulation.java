import java.util.Arrays;

public class UniquePaths_Tabulation {

    // Time Complexity  : O(nxm)
    // Space Complexity : O(mxn) for dp array
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return helper(m-1, n-1, dp);
    }

    private static int helper(int m, int n, int[][] dp) {
        for (int row = 0; row <= m; row++) {
            for (int col = 0; col <= n; col++) {
                if (row == 0 && col == 0)
                    dp[row][col] = 1;
                else {
                    int up = 0, left = 0;

                    if (row > 0) up = dp[row-1][col];
                    if (col > 0) left = dp[row][col-1];

                    dp[row][col] = up + left;
                }
            }
        }
        return dp[m][n];
    }
}
