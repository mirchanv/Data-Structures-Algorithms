import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array : "  + Arrays.toString(arr1));
        System.out.println("isSorted : " + Solution.isSorted(arr1));

        int[] arr2 = {5, 4, 6, 7, 8};
        System.out.println("Array : "  + Arrays.toString(arr2));
        System.out.println("isSorted : " + Solution.isSorted(arr2));
    }
}
