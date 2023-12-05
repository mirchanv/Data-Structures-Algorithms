import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word here: ");
        String str = scanner.nextLine();

        System.out.println("Original word : " + str);
        System.out.println("Modified word : " + replaceXY(str));
    }

    public static String replaceXY(String str) {
        return helper(str, str.length()-1);
    }

    private static String helper(String str, int index) {
        if (index < 0)
            return str;

        if (str.charAt(index) == 'x')
            str = str.replace(str.charAt(index), 'y');

        return helper(str, index-1);
    }
}
