import java.util.Arrays;
import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Enter target value to search for: ");
        int target = scanner.nextInt();

        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Target value: " + target + " is found at index " + Solution.isPresent(arr, target));
    }
}
