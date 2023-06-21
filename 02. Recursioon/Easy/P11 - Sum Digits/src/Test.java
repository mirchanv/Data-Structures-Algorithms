import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number here:");
        int num = scanner.nextInt();

        System.out.println("Sum of all digits in " + num + " = " + sumDigits(num));
    }

    public static int sumDigits(int num) {
        if (num == 0)
            return 0;

        return (num % 10) + sumDigits(num / 10);
    }
}
