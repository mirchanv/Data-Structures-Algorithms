import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Enter target: ");
        int target = scanner.nextInt();

        System.out.println(target + " appeared " + countTarget(num, target) + " times in " + num);
    }

    public static int countTarget(int num, int target) {
        if (num == 0)
            return 0;

        if ((num % 10) == target)
            return 1 + countTarget(num/10, target);
        else
            return countTarget(num/10, target);
    }
}
