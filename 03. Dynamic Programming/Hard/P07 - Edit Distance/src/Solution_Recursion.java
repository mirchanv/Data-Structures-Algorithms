public class Solution_Recursion {

    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        return helper(word1, word2, n-1, m-1);
    }

    private static int helper(String s1, String s2, int ind1, int ind2) {
        if (ind1 < 0) return ind2 + 1;
        else if (ind2 < 0) return ind1 + 1;

        if (s1.charAt(ind1) == s2.charAt(ind2))
            return 0 + helper(s1, s2, ind1-1, ind2-1);
        else
            return 1 + Math.min(helper(s1, s2, ind1, ind2-1), Math.min(helper(s1, s2, ind1-1, ind2), helper(s1, s2, ind1-1, ind2-1)));
    }
}
