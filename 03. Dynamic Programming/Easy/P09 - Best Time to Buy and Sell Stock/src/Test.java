import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("stock prices: " + Arrays.toString(prices1));
        System.out.println("Maximum profit that can be made is : " + Solution.maxProfit(prices1) + "\n");

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("stock prices: " + Arrays.toString(prices2));
        System.out.println("Maximum profit that can be made is : " + Solution.maxProfit(prices2));
    }
}
