import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] weight1 = {1, 2, 4, 5};
        int[] value1 = {5, 4, 8, 6};
        int maxWeight1 = 5;

        System.out.println("Item weight = " + Arrays.toString(weight1) +
                "\nItem Value = " + Arrays.toString(value1) +
                "\nMax Weight = " + maxWeight1);

        // solution using recursion
        System.out.println("\tMax value that can be robbed = " + Knapsack_Recursion.knapsack(weight1, value1, weight1.length, maxWeight1));

        // solution using memoization
        System.out.println("\tMax value that can be robbed = " + Knapsack_Memoization.knapsack(weight1, value1, weight1.length, maxWeight1));

        // solution using tabulation
        System.out.println("\tMax value that can be robbed = " + Knapsack_Tabulation.knapsack(weight1, value1, weight1.length, maxWeight1));

        int[] weight2 = {3, 4, 5};
        int[] value2 = {30, 50, 60};
        int maxWeight2 = 8;

        System.out.println("Item weight = " + Arrays.toString(weight1) +
                "\nItem Value = " + Arrays.toString(value1) +
                "\nMax Weight = " + maxWeight1);

        // solution using recursion
        System.out.println("\tMax value that can be robbed = " + Knapsack_Recursion.knapsack(weight2, value2, weight2.length, maxWeight2));

        // solution using memoization
        System.out.println("\tMax value that can be robbed = " + Knapsack_Memoization.knapsack(weight2, value2, weight2.length, maxWeight2));

        // solution using tabulation
        System.out.println("\tMax value that can be robbed = " + Knapsack_Tabulation.knapsack(weight2, value2, weight2.length, maxWeight2));
    }
}
