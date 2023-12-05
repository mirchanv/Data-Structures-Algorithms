public class Solution_Recursion {

    // Time Complexity  : Exponential
    // Space Complexity : O(n + m) for recursion stack space
    public static int distinctSubsequences(String str, String sub) {
        int n = str.length();
        int m = sub.length();
        return helper(str, sub, n-1, m-1);
    }

    private static int helper(String s1, String s2, int ind1, int ind2) {
        if (ind2 < 0) return 1;
        else if (ind1 < 0 ) return 0;

        if (s1.charAt(ind1) == s2.charAt(ind2))
            return helper(s1, s2, ind1-1, ind2-1) + helper(s1, s2, ind1-1, ind2);
        else
            return helper(s1, s2, ind1 - 1, ind2);
    }
}
