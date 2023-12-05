public class Solution_Recursion {

    // Time Complexity  : Exponential
    // Space Complexity : O(m+n) for recursion stack space
    public static boolean isMatch(String s, String p) {
        int m = p.length();
        int n = s.length();

        return helper(p, s, m-1, n-1);
    }

    private static boolean helper(String s1, String s2, int ind1, int ind2) {
        if (ind1 < 0 && ind2 < 0) return true;
        else if (ind1 < 0 && ind2 >= 0) return false;
        else if(ind2 < 0 && ind1 >= 0) {
            for (int i = 0; i<=ind1; i++) {
                if (s1.charAt(i) != '*') return false;
            }
            return true;
        }

        if (s1.charAt(ind1) == s2.charAt(ind2) || s1.charAt(ind1) == '?')
            return helper(s1, s2, ind1-1, ind2-1);
        else if (s1.charAt(ind1) == '*')
            return helper(s1, s2, ind1-1, ind2) || helper(s1, s2, ind1, ind2-1);
        else
            return false;
    }
}
