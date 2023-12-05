public class Solution_Recursion {
    public static int longestPalindromeSubsequence(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();

        return helper(s, reversed, s.length()-1, s.length()-1);
    }

    private static int helper(String s1, String s2, int ind1, int ind2) {
        if (ind1 < 0 || ind2 < 0) return 0;

        if (s1.charAt(ind1) == s2.charAt(ind2))
            return 1 + helper(s1, s2, ind1-1, ind2-1);
        else
            return Math.max(helper(s1, s2, ind1-1, ind2), helper(s1, s2, ind1, ind2-1));
    }
}
