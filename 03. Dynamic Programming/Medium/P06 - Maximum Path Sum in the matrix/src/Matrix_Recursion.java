public class Matrix_Recursion {

    public static int getMaxPathSum(int[][] grid) {
        return helper(grid, 0, 0);
    }

    private static int helper(int[][] grid, int rowIdx, int colIdx) {
        if (rowIdx < 0 || colIdx < 0 || colIdx == grid[rowIdx].length) return Integer.MIN_VALUE;
        else if (rowIdx == grid.length - 1) return grid[rowIdx][colIdx];

        int down, downLeft, downRight;
        int maxPathSum = Integer.MIN_VALUE;

        if (rowIdx == 0) {
            for (int i = 0; i < grid[0].length; i++) {
                down = helper(grid, rowIdx + 1, i);
                downLeft = helper(grid, rowIdx + 1, i - 1);
                downRight = helper(grid, rowIdx + 1, i + 1);
                maxPathSum = Math.max(maxPathSum, grid[rowIdx][i] + Math.max(down, Math.max(downLeft, downRight)));
            }
            return maxPathSum;
        }

        down = helper(grid, rowIdx + 1, colIdx);
        downLeft = helper(grid, rowIdx + 1, colIdx - 1);
        downRight = helper(grid, rowIdx + 1, colIdx + 1);

        return grid[rowIdx][colIdx] + Math.max(down, Math.max(downLeft, downRight));
    }
}
