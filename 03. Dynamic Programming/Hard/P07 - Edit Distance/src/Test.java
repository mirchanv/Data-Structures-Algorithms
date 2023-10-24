public class Test {

    public static void main(String[] args) {
        // TEST CASE: 1
        String word1 = "horse";
        String word2 = "ros";

        System.out.println("word1 = "  +word1 + ", word2 = " + word2);

        // solution using recursion
        System.out.println("Edit Distance = " + Solution_Recursion.minDistance(word1, word2));
        // solution using memoization
        System.out.println("Edit Distance = " + Solution_Memoization.minDistance(word1, word2));
        // solution using tabulation
        System.out.println("Edit Distance = " + Solution_Tabulation.minDistance(word1, word2) + "\n");

        // TEST CASE: 2
        word1 = "intention";
        word2 = "execution";

        System.out.println("word1 = "  +word1 + ", word2 = " + word2);

        // solution using recursion
        System.out.println("Edit Distance = " + Solution_Recursion.minDistance(word1, word2));
        // solution using memoization
        System.out.println("Edit Distance = " + Solution_Memoization.minDistance(word1, word2));
        // solution using tabulation
        System.out.println("Edit Distance = " + Solution_Tabulation.minDistance(word1, word2));
    }
}
