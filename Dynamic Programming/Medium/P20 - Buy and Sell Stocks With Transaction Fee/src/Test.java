import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] prices1 = {1,3,2,8,4,9};      // stock prices test case 1
        int[] prices2 = {1,3,7,5,10,3};     // stock prices test case 2

        System.out.println("stock prices are: " + Arrays.toString(prices1));

        // solution using recursion
        System.out.println("\tmaxProfit = " + Solution_Recursion.maxProfit(prices1, 2));
        // solution using memoization
        System.out.println("\tmaxProfit = " + Solution_Memoization.maxProfit(prices1, 2));
        // solution using tabulation
        System.out.println("\tmaxProfit = " + Solution_Tabulation.maxProfit(prices1, 2));


        System.out.println("stock prices are: " + Arrays.toString(prices2));

        // solution using recursion
        System.out.println("\tmaxProfit = " + Solution_Recursion.maxProfit(prices2, 3));
        // solution using memoization
        System.out.println("\tmaxProfit = " + Solution_Memoization.maxProfit(prices2, 3));
        // solution using tabulation
        System.out.println("\tmaxProfit = " + Solution_Tabulation.maxProfit(prices2, 3));
    }
}
