import java.util.Arrays;

public class Matrix_Tabulation {

    public static int getMaxPathSum(int[][] matrix) {
        int maxi = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];
        for (int[] arr : dp) Arrays.fill(arr, -1);

        for (int col=0; col<matrix[0].length; col++) {
            int ans = helper(matrix, matrix.length-1, col, dp);
            maxi = Math.max(maxi,ans);
        }
        return maxi;
    }

    private static int helper(int[][] matrix, int m, int n, int[][] dp) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[m].length; col++) {
                if (row == 0) {
                    dp[0][col] = matrix[0][col];
                    continue;
                }

                int up = Integer.MIN_VALUE;
                int upLeft = Integer.MIN_VALUE;
                int upRight = Integer.MIN_VALUE;

                if (row > 0) {
                    up = dp[row-1][col];
                    if (col > 0) upLeft = dp[row-1][col-1];
                    if (col < matrix[row].length-2) upRight = dp[row-1][col+1];
                }

                dp[row][col] = matrix[row][col] + Math.max(up, Math.max(upLeft, upRight));
            }
        }
        return dp[m][n];
    }
}
