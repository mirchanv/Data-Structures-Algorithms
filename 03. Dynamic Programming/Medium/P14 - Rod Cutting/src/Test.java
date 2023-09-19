public class Test {
    public static void main(String[] args) {
        int[] price = {2, 5, 7, 8, 10};
        int n = 5;

        // solution using recursion
        System.out.println("Max cost obtained by cutting the rod = " + Solution_Recursion.cutRod(price, n));

        // solution using memoization
        System.out.println("Max cost obtained by cutting the rod = " + Solution_Memoization.cutRod(price, n));

        // solution using tabulation
        System.out.println("Max cost obtained by cutting the rod = " + Solution_Tabulation.cutRod(price, n));
    }
}
