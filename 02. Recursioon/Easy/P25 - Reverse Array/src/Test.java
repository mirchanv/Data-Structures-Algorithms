import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        System.out.println("Actual Array : " + Arrays.toString(arr1));
        System.out.println("Reversed Array : " + Arrays.toString(Reverse.reverseArray(arr1)) + "\n");

        int[] arr2 = {5, 1, 0, 2};
        System.out.println("Actual Array : " + Arrays.toString(arr2));
        System.out.println("Reversed Array : " + Arrays.toString(Reverse.reverseArray(arr2)));
    }
}
