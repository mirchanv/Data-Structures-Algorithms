import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word here: ");
        String str = scanner.nextLine();

        System.out.println("Original word : " + str);
        System.out.println("After removing all x's : " + removeX(str));
    }

    public static String removeX(String str) {
        if (str.length() > 0)
            return helper(str, str.length()-1, new String());

        return str;
    }

    private static String helper(String str, int index, String ans) {
        if (index < 0)
            return ans;

        if (str.charAt(index) != 'x')
            return helper(str, index-1, ans) + str.charAt(index);
        else
            return helper(str, index-1, ans);
    }
}
