import java.util.Arrays;
import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 7, 7, 5};

        System.out.println("Please enter kth value: ");
        int kth = scanner.nextInt();

        System.out.println("Array = " + Arrays.toString(arr1));
        System.out.println(kth + "th smallest element: " + Solution.kthSmallestElement(arr1, kth));
        System.out.println(kth + "th largest element: " + Solution.kthLargestElement(arr1, kth));
    }
}
