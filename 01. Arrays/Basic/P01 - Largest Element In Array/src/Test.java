import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("Array = " + Arrays.toString(arr1));
        System.out.println("Max element = " + Solution.findLargestElement_BruteForce(arr1));
        System.out.println("Max element = " + Solution.findLargestElement_Optimised(arr1));

        int arr2[] = {34, 8, 10, 5, 7, 9};
        System.out.println("Array = " + Arrays.toString(arr2));
        System.out.println("Max element = " + Solution.findLargestElement_BruteForce(arr2));
        System.out.println("Max element = " + Solution.findLargestElement_Optimised(arr2));
    }
}
