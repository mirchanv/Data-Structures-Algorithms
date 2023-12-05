import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] denominations1 = {1, 2, 3};
        int target1 = 4;

        System.out.println("denomination = " + Arrays.toString(denominations1) + "\ntarget = " + target1);

        // solution using recursion
        System.out.println("Total ways = " + Solution_Recursion.countWaysToMakeChange(denominations1, target1));

        // solution using memoization
        System.out.println("Total ways = " + Solution_Memoization.countWaysToMakeChange(denominations1, target1));

        // solution using tabulation
        System.out.println("Total ways = " + Solution_Tabulation.countWaysToMakeChange(denominations1, target1) + "\n");


        int[] denominations2 = {5, 3, 2};
        int target2 = 1;

        System.out.println("denomination = " + Arrays.toString(denominations2) + "\ntarget = " + target2);

        // solution using recursion
        System.out.println("Total ways = " + Solution_Recursion.countWaysToMakeChange(denominations2, target2));

        // solution using memoization
        System.out.println("Total ways = " + Solution_Memoization.countWaysToMakeChange(denominations2, target2));

        // solution using tabulation
        System.out.println("Total ways = " + Solution_Tabulation.countWaysToMakeChange(denominations2, target2));
    }
}
