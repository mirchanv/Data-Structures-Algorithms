public class UniquePaths_Recursion {

    public static int uniquePaths(int m, int n) {
        return helper(m-1, n-1);
    }

    private static int helper(int rowIdx, int colIdx) {
        if (rowIdx == 0 && colIdx == 0)
            return 1;
        else if (rowIdx < 0 || colIdx < 0)
            return 0;

        int up = helper(rowIdx-1, colIdx);
        int right = helper(rowIdx, colIdx-1);

        return up + right;
    }
}
