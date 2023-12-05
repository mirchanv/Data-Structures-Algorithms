import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int target = 7;

        System.out.println("coins = " + Arrays.toString(coins));
        System.out.println("target = " + target);

        // solution using recursion
        System.out.println("Minimum no of coins needed to reach target = " + Coins_Recursion.minimumElements(coins, target));

        // solution using memoization
        System.out.println("Minimum no of coins needed to reach target = " + Coins_Memoization.minimumElements(coins, target));

        // solution using tabulation
        System.out.println("Minimum no of coins needed to reach target = " + Coins_Tabulation.minimumElements(coins, target));
    }
}
