public class Test {
    public static void main(String[] args) {
        String str1 = "bbabcbcab";
        String str2 = "bbbab";

        // solution using recursion
        System.out.println("Longest Palindromic Subsequence in '" + str1 + "' is: " + Solution_Recursion.longestPalindromeSubsequence(str1));
        System.out.println("Longest Palindromic Subsequence in '" + str2 + "' is: " + Solution_Recursion.longestPalindromeSubsequence(str2) + "\n");

        // solution using memoization
        System.out.println("Longest Palindromic Subsequence in '" + str1 + "' is: " + Solution_Memoization.longestPalindromeSubsequence(str1));
        System.out.println("Longest Palindromic Subsequence in '" + str2 + "' is: " + Solution_Memoization.longestPalindromeSubsequence(str2) + "\n");

        // solution using tabulation
        System.out.println("Longest Palindromic Subsequence in '" + str1 + "' is: " + Solution_Tabulation.longestPalindromeSubsequence(str1));
        System.out.println("Longest Palindromic Subsequence in '" + str2 + "' is: " + Solution_Tabulation.longestPalindromeSubsequence(str2));
    }
}
