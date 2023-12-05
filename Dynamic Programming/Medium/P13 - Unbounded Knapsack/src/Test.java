public class Test {
    public static void main(String[] args) {
        int[] weight = {2, 4, 6};
        int[] profit = {5, 11, 13};
        int capacity = 10;

        // solution using recursion
        System.out.println("Max profit that can be achieved is : " + Solution_Recursion.unboundedKnapsack(weight.length, capacity, profit, weight));

        // solution using memoization
        System.out.println("Max profit that can be achieved is : " + Solution_Memoization.unboundedKnapsack(weight.length, capacity, profit, weight));

        // solution using tabulation
        System.out.println("Max profit that can be achieved is : " + Solution_Tabulation.unboundedKnapsack(weight.length, capacity, profit, weight));
    }
}
