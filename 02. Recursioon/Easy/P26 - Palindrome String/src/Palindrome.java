public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str.length() > 0)
            return helper(str, 0);

        return false;
    }

    private static boolean helper(String str, int index) {
        if (index >= str.length() / 2)
            return true;

        if (str.charAt(index) == str.charAt(str.length() - index - 1))
            return helper(str, index + 1);
        else
            return false;
    }
}
