import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of bunnies: ");
        int bunnies = scanner.nextInt();


    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0)
            return 0;

        if (bunnies % 2 == 0)
            return 3 + bunnyEars2(bunnies-1);
        else
            return 2 + bunnyEars2(bunnies-1);
    }

}
