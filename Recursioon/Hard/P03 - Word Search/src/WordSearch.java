public class WordSearch {

    public static boolean exist(char[][] board, String word) {
        if (board.length == 0 || word.length() == 0)
            return false;

        int idx = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == word.charAt(idx) && search(board, word, row, col, idx))
                    return true;
            }
        }
        return false;
    }

    private static boolean search(char[][] board, String word, int row, int col, int idx) {
        if (idx == word.length())
            return true;

        if (row < 0 || col < 0 || row >= board.length || col >= board[row].length || board[row][col] != word.charAt(idx))
            return false;

        char temp = board[row][col];
        board[row][col] = ' ';
        boolean ans = search(board, word, row - 1, col, idx + 1) ||
                        search(board, word, row, col + 1, idx + 1) ||
                        search(board, word, row + 1, col, idx + 1) ||
                        search(board, word, row, col - 1, idx + 1);

        board[row][col] = temp;
        return ans;
    }
}
