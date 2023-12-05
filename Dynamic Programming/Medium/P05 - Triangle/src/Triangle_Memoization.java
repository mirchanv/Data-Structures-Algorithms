import java.util.Arrays;
import java.util.List;

public class Triangle_Memoization {

    // Time Complexity  : O(nxn)
    // Space Complexity : O(n) for recursion stack space where n represents the number of rows + O(nxn) for dp array
    public static int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(triangle, 0, 0, dp);
    }

    private static int helper(List<List<Integer>> triangle, int rowIdx, int colIdx, int[][] dp) {
        if(rowIdx == triangle.size()-1) return triangle.get(rowIdx).get(colIdx);

        if(dp[rowIdx][colIdx] != -1) return dp[rowIdx][colIdx];

        int down = helper(triangle, rowIdx+1, colIdx, dp);
        int diagonal = helper(triangle, rowIdx+1, colIdx+1, dp);

        return dp[rowIdx][colIdx] = triangle.get(rowIdx).get(colIdx) + Math.min(down, diagonal);
    }
}
