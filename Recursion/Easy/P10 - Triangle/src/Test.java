import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("A triable with " + rows + " rows will have " + triangle(rows) + " blocks!");
    }

    public static int triangle(int rows) {
        if (rows == 0)
            return 0;
        else if (rows == 1)
            return 1;

        return rows + triangle(rows-1);
    }
}
