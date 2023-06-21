import java.util.Arrays;
import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1, 6, 4};
        System.out.println("Enter target to search for: ");
        int target = scanner.nextInt();

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println(target + " found in array ? " + containsTarget(arr, 0, target));
    }

    public static boolean containsTarget(int[] arr, int index, int target) {
        if (index == arr.length)
            return false;

        if (arr[index] == target)
            return true;
        else
            return containsTarget(arr, index+1, target);
    }
}
