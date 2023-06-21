import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word here: ");
        String str = scanner.nextLine();

        System.out.println("The word 'hi' appears : " + countHi(str) + " times!");
    }

    public static int countHi(String str) {
        if (str.length() > 0)
            return helper(str, str.length()-1);

        return 0;
    }

    private static int helper(String str, int index) {
        if (index == 0)
            return 0;

        if (str.substring(index-1, index+1).equals("hi"))
            return 1 + helper(str, index-1);
        else
            return helper(str, index-1);
    }
}
