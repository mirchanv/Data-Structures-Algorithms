import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of bunnies: ");
        int bunnies = scanner.nextInt();

        System.out.println(bunnies + " bunnies have : " + bunnyEars(bunnies) + " ears!");
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0)
            return 0;
        else if (bunnies == 1)
            return 2;

        return 2 + bunnyEars(bunnies-1);
    }
}
