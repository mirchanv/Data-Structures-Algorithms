import java.util.Scanner;

public class Test {

    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word here: ");
        String str = scanner.nextLine();

        System.out.println("Actual word : " + str);
        System.out.println("Modified word : " + pairStar(str));
    }

    public static String pairStar(String str) {
        if (str.length() > 0)
            return helper(str, str.length()-1);

        return str;
    }

    private static String helper(String str, int index) {
        if (index == 0)
            return "" + str.charAt(index);

        if (str.charAt(index) == str.charAt(index-1))
            return helper(str, index-1) + "*" + str.charAt(index);
        else
            return helper(str, index-1) + str.charAt(index);
    }
}
