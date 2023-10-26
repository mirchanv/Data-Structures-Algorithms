import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] prices1 = {2, 4, 1};
        int[] prices2 = {3, 2, 6, 5, 0, 3};
        int limit = 2;

        System.out.println("stock prices = " + Arrays.toString(prices1) + ", max transactions allowed = " + limit);

        // solution using recursion
        System.out.println("\t maxProfit obtainable = " + Solution_Recursion.maxProfit(prices1, limit));
        // solution using memoization
        System.out.println("\t maxProfit obtainable = " + Solution_Memoization.maxProfit(prices1, limit));
        // solution using tabulation
        System.out.println("\t maxProfit obtainable = " + Solution_Tabulation.maxProfit(prices1, limit) + "\n");


        System.out.println("stock prices = " + Arrays.toString(prices2) + ", max transactions allowed = " + limit);

        // solution using recursion
        System.out.println("\t maxProfit obtainable = " + Solution_Recursion.maxProfit(prices2, limit));
        // solution using memoization
        System.out.println("\t maxProfit obtainable = " + Solution_Memoization.maxProfit(prices2, limit));
        // solution using tabulation
        System.out.println("\t maxProfit obtainable = " + Solution_Tabulation.maxProfit(prices2, limit));
    }
}
