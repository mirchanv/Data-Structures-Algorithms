import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // TEST CASE : 3
        int[] prices1 = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println("stock prices : " + Arrays.toString(prices1));

        // solution using recursion
        System.out.println("\tmaxProfit obtainable : " + Solution_Recursion.maxProfit(prices1));
        // solution using memoization
        System.out.println("\tmaxProfit obtainable : " + Solution_Memoization.maxProfit(prices1));
        // solution using tabulation
        System.out.println("\tmaxProfit obtainable : " + Solution_Tabulation.maxProfit(prices1));

        // TEST CASE : 2
        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("stock prices : " + Arrays.toString(prices2));

        // solution using recursion
        System.out.println("\tmaxProfit obtainable : " + Solution_Recursion.maxProfit(prices2));
        // solution using memoization
        System.out.println("\tmaxProfit obtainable : " + Solution_Memoization.maxProfit(prices2));
        // solution using tabulation
        System.out.println("\tmaxProfit obtainable : " + Solution_Tabulation.maxProfit(prices2));

        // TEST CASE : 3
        int[] prices3 = {7,6,4,3,1};
        System.out.println("stock prices : " + Arrays.toString(prices3));

        // solution using recursion
        System.out.println("\tmaxProfit obtainable : " + Solution_Recursion.maxProfit(prices3));
        // solution using memoization
        System.out.println("\tmaxProfit obtainable : " + Solution_Memoization.maxProfit(prices3));
        // solution using tabulation
        System.out.println("\tmaxProfit obtainable : " + Solution_Tabulation.maxProfit(prices3));
    }
}
