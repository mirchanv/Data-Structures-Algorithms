import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];

        solve(0, board, ans, leftRow, lowerDiagonal, upperDiagonal);
        return ans;
    }

    private static void solve(int col, char[][] board,  List<List<String>> ans, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal) {
        if (col == board.length) {
            ans.add(constructBoard(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row+col] == 0 && upperDiagonal[board.length-1 + (col-row)]  == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row+col] = 1;
                upperDiagonal[board.length-1 + (col - row)] = 1;

                // calling for next column
                solve(col + 1, board, ans, leftRow, lowerDiagonal, upperDiagonal);

                // back-tracking
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row+col] = 0;
                upperDiagonal[board.length-1 + (col - row)] = 0;
            }
        }
    }

    private static List<String> constructBoard(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            ans.add(new String(board[i]));
        }
        return ans;
    }
}
