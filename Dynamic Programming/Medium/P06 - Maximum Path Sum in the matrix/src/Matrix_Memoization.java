import java.util.Arrays;

public class Matrix_Memoization {

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

    private static int helper(int[][] matrix, int rowId, int colId, int[][] dp) {
        if (colId < 0 || colId == matrix[rowId].length) return Integer.MIN_VALUE;
        else if (rowId == 0) return matrix[0][colId];

        if (dp[rowId][colId] != -1) return dp[rowId][colId];

        int up = helper(matrix, rowId-1, colId, dp);
        int upLeft = helper(matrix, rowId-1, colId-1, dp);
        int upRight = helper(matrix, rowId-1, colId+1, dp);

        return dp[rowId][colId] = matrix[rowId][colId] + Math.max(up, Math.max(upLeft, upRight));
    }
}
