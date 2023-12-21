import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static List<List<String>> allPaths = new ArrayList<>();

    public static int uniquePaths(int m, int n) {
        return getUniquePaths(m-1, n-1);
    }

    private static int getUniquePaths(int rows, int cols) {
        if (rows < 0 || cols < 0)
            return 0;
        else if (rows == 0 && cols == 0)
            return 1;

        // moving up
        int up = getUniquePaths(rows-1, cols);

        // moving left
        int left = getUniquePaths(rows, cols-1);

        int totalPaths = up + left;
        return totalPaths;
    }

    public static void printPaths(int row, int col) {
        helper(row-1, col-1, "");
    }

    private static void helper(int row, int col, String path) {
        if (row < 0 || col < 0)
            return;
        else if (row == 0 && col == 0) {
            System.out.println("\t-> " + path);
            return;
        }

        helper(row-1, col, path + "up ");       // moving up
        helper(row, col-1, path + "left ");     // moving left
    }
}
