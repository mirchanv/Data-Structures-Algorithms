public class Test {
    public static void main(String[] args) {
        String str1 = "RADAR";
        System.out.println("Actual string : " + str1);
        System.out.println("Is it palindrome : " + Palindrome.isPalindrome(str1) + "\n");

        String str2 = "BULB";
        System.out.println("Actual string : " + str2);
        System.out.println("Is it palindrome : " + Palindrome.isPalindrome(str2) + "\n");

        String str3 = "MADAM";
        System.out.println("Actual string : " + str3);
        System.out.println("Is it palindrome : " + Palindrome.isPalindrome(str3));
    }
}
