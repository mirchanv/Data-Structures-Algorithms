public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str.length() > 0)
            return helper(str, 0, str.length()-1);

        return false;
    }

    private static boolean helper(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) == str.charAt(end))
            return helper(str, start + 1, end - 1);
        else
            return false;
    }
}
