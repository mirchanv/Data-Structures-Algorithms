import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word here: ");
        String str = scanner.nextLine();

        System.out.println("Actual word : " + str);
        System.out.println("Modified word : " + allStar(str));
    }

    public static String allStar(String str) {
        if (str.length() > 0)
            return helper(str, 0);

        return str;
    }

    private static String helper(String str, int index) {
        if (index == str.length()-1)
            return "" + str.charAt(index);

        return str.charAt(index) + "*" + helper(str, index+1);
    }
}
