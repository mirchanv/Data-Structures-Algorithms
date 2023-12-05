public class Test {
    public static void main(String[] args) {
        String s1 = "adebc";
        String s2 = "dcadb";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // solution using recursion
        System.out.println("Longest common subsequence between s1 and s2 = " + Solution_Recursion.lcs(s1, s2));

        // solution using memoization
        System.out.println("Longest common subsequence between s1 and s2 = " + Solution_Memoization.lcs(s1, s2));

        // solution using tabulation
        System.out.println("Longest common subsequence between s1 and s2 = " + Solution_Tabulation.lcs(s1, s2));
    }
}
