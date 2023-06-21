import java.util.Arrays;
import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1, 11, 2, 11};

        System.out.println("Enter target value here: ");
        int target = scanner.nextInt();

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println(target + " appears " + getFrequency(arr, 0, target) + " times!");
    }

    public static int getFrequency(int[] arr, int index, int target) {
        if (index == arr.length)
            return 0;

        if (arr[index] == target)
            return 1 + getFrequency(arr, index+1, target);
        else
            return getFrequency(arr, index+1, target);
    }
}
