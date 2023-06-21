import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word here: ");
        String str = scanner.nextLine();

        System.out.println("Actual word : " + str);
        System.out.println("Occurrences of 'abc' and 'aba' : " + countAbc(str));
    }

    public static int countAbc(String str) {
        if (str.length() > 0)
            return helper(str, str.length()-1);

        return 0;
    }

    private static int helper(String str, int index) {
        if (index < 2)
            return 0;

        String temp = str.substring(index-2, index+1);
        if (temp.equals("abc") || temp.equals("aba"))
            return 1 + helper(str, index-2);
        else
            return helper(str, index-1);
    }
}
