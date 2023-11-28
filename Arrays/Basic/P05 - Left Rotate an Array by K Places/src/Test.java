import java.util.Arrays;
import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Please enter the number of rotations: ");
        int rotations = scanner.nextInt();

        System.out.println("Original array : " + Arrays.toString(arr));
        Solution.leftRotate(arr, rotations);
        System.out.println("After" + rotations + " rotations : " + Arrays.toString(arr));
    }
}
