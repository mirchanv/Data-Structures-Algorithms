import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word here:");
        String str = scanner.nextLine();

        System.out.println("The word " + str + " contains: " + countX(str) + " x's");
    }

    public static int countX(String str) {
        return helper(str, str.length()-1);
    }

    private static int helper(String str, int index) {
        if (index < 0)
            return 0;

        if (str.charAt(index) == 'x')
            return 1 + helper(str, index-1);
        else
            return helper(str, index-1);
    }
}
