import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word here: ");
        String str = scanner.nextLine();

        System.out.println("Actual string : " + str);
        System.out.println("String cleanup : " +  stringClean(str));
    }

    public static String stringClean(String str) {
        if (str.length() > 0)
            return helper(str, 0);

        return str;
    }

    public static String helper(String str, int index) {
        if (index == str.length()-1)
            return "" + str.charAt(index);

        if (str.charAt(index) != str.charAt(index+1))
            return str.charAt(index) + helper(str, index+1);
        else
            return helper(str, index+1);
    }
}
