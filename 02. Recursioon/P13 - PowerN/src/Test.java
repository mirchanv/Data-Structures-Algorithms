import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter base: ");
        int base = scanner.nextInt();;

        System.out.println("Enter exponent: ");
        int exponent = scanner.nextInt();

        System.out.println(base + "^" + exponent + " = " + powerN(base, exponent));
    }

    public static int powerN(int base, int exponent) {
        if (exponent == 1)
            return base;

        return base * powerN(base, exponent-1);
    }
}
