public class Solution_Recursion {

    public static int lcs(String s, String t) {
        int ind1 = s.length()-1;
        int ind2 = t.length()-1;

        return helper(s, t, ind1, ind2);
    }

    private static int helper(String s1, String s2, int ind1, int ind2) {
        if (ind1 < 0 || ind2 < 0) return 0;

        if (s1.charAt(ind1) == s2.charAt(ind2))
            return 1 + helper(s1, s2, ind1-1, ind2-1);
        else
            return 0 + Math.max(helper(s1, s2, ind1-1, ind2), helper(s1, s2, ind1, ind2-1));
    }
}
