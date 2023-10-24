import java.util.Arrays;

public class Solution_Memoization {

    // Time Complexity  : O(mxn)
    // Space Complexity : O(m+n) for recursion stack space + O(mxn) fo dp array
    public static boolean isMatch(String s, String p) {
        int m = p.length();
        int n = s.length();
        int[][] dp = new int[m][n];

        for (int[] arr : dp) Arrays.fill(arr, -1);

        return helper(p, s, m - 1, n - 1, dp) == 1;
    }

    private static int helper(String s1, String s2, int ind1, int ind2, int[][] dp) {
        if (ind1 < 0 && ind2 < 0) return 1;
        else if (ind1 < 0 && ind2 >= 0) return 0;
        else if(ind2 < 0 && ind1 >= 0) {
            for (int i = 0; i<=ind1; i++) {
                if (s1.charAt(i) != '*') return 0;
            }
            return 1;
        }

        if (s1.charAt(ind1) == s2.charAt(ind2) || s1.charAt(ind1) == '?')
            return dp[ind1][ind2] = helper(s1, s2, ind1-1, ind2-1, dp);
        else if (s1.charAt(ind1) == '*')
            return dp[ind1][ind2] = helper(s1, s2, ind1-1, ind2, dp) == 1 || helper(s1, s2, ind1, ind2-1, dp) == 1 ? 1 : 0;
        else
            return 0;
    }
}
