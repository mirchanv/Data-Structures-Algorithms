public class Test {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},
                            {'S','F','C','S'},
                            {'A','D','E','E'}};

        String word = "SEE";
        System.out.println("Is the word: '" + word + "' found in the grid?");
        System.out.println(WordSearch.exist(board, word));
    }
}
