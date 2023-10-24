public class Test {
    public static void main(String[] args) {
        String s1 = "babgbag";
        String s2 = "bag";

        // solution using recursion
        System.out.println("Total no. of distinct subsequences = " + Solution_Recursion.distinctSubsequences(s1, s2));

        // solution using memoization
        System.out.println("Total no. of distinct subsequences = " + Solution_Memoization.distinctSubsequences(s1, s2));

        // solution using tabulation
        System.out.println("Total no. of distinct subsequences = " + Solution_Tabulation.distinctSubsequences(s1, s2));
    }
}
