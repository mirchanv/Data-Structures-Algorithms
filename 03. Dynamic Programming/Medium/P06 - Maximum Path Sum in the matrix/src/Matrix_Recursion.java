public class Matrix_Recursion {

    public static int getMaxPathSum(int[][] matrix) {
        int maxi = Integer.MIN_VALUE;
        for (int col=0; col<matrix[0].length; col++) {
            int ans = helper(matrix, matrix.length-1, col);
            maxi = Math.max(maxi,ans);
        }
        return maxi;
    }

    private static int helper(int[][] matrix, int rowId, int colId) {
        if (colId < 0 || colId == matrix[rowId].length) return Integer.MIN_VALUE;
        else if (rowId == 0) return matrix[0][colId];

        int up = helper(matrix, rowId-1, colId);
        int upLeft = helper(matrix, rowId-1, colId-1);
        int upRight = helper(matrix, rowId-1, colId+1);

        return matrix[rowId][colId] + Math.max(up, Math.max(upLeft, upRight));
    }
}
