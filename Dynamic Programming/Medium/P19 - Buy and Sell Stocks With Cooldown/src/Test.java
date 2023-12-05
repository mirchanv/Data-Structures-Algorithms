import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // Test Cases
        int[] prices1 = {1, 2, 3, 0, 2};
        int[] prices2 = {1};

        System.out.println("stock prices = " + Arrays.toString(prices1));

        // solution using recursion
        System.out.println("\tmaxProfit with cooldown = " + Solution_Recursion.maxProfit(prices1));
        // solution using memoization
        System.out.println("\tmaxProfit with cooldown = " + Solution_Memoization.maxProfit(prices1));
        // solution using tabulation
        System.out.println("\tmaxProfit with cooldown = " + Solution_Tabulation.maxProfit(prices1));


        System.out.println("stock prices = " + Arrays.toString(prices2));

        // solution using recursion
        System.out.println("\tmaxProfit with cooldown = " + Solution_Recursion.maxProfit(prices2));
        // solution using memoization
        System.out.println("\tmaxProfit with cooldown = " + Solution_Memoization.maxProfit(prices2));
        // solution using tabulation
        System.out.println("\tmaxProfit with cooldown = " + Solution_Tabulation.maxProfit(prices2));
    }
}
