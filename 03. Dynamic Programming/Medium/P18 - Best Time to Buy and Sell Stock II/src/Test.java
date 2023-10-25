import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};

        System.out.println("stock prices for each day are: "  + Arrays.toString(prices1));

        // solution using recursion
        System.out.println("maxProfit obtainable = " + Solution_Recursion.maxProfit(prices1));
        // solution using memoization
        System.out.println("maxProfit obtainable = " + Solution_Memoization.maxProfit(prices1));
        // solution using tabulation
        System.out.println("maxProfit obtainable = " + Solution_Tabulation.maxProfit(prices1) + "\n");

        int[] prices2 = {1, 2, 3, 4, 5};

        System.out.println("stock prices for each day are: "  + Arrays.toString(prices2));

        // solution using recursion
        System.out.println("maxProfit obtainable = " + Solution_Recursion.maxProfit(prices2));
        // solution using memoization
        System.out.println("maxProfit obtainable = " + Solution_Memoization.maxProfit(prices2));
        // solution using tabulation
        System.out.println("maxProfit obtainable = " + Solution_Tabulation.maxProfit(prices2) + "\n");

        int[] prices3 = {7, 6, 4, 3, 1};

        System.out.println("stock prices for each day are: "  + Arrays.toString(prices3));

        // solution using recursion
        System.out.println("maxProfit obtainable = " + Solution_Recursion.maxProfit(prices3));
        // solution using memoization
        System.out.println("maxProfit obtainable = " + Solution_Memoization.maxProfit(prices3));
        // solution using tabulation
        System.out.println("maxProfit obtainable = " + Solution_Tabulation.maxProfit(prices3));
    }
}
