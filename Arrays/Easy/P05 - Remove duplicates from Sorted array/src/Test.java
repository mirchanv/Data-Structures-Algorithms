import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 3, 3};
        System.out.println("Original Array : " + Arrays.toString(arr1));
        System.out.println("No of unique elements : " + Approach2.removeDuplicates(arr1));
        System.out.println("Array after removing dups : " + Arrays.toString(arr1));

        int[] arr2 = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4};
        System.out.println("Original Array : " + Arrays.toString(arr2));
        System.out.println("No of unique elements : " + Approach2.removeDuplicates(arr2));
        System.out.println("Array after removing dups : " + Arrays.toString(arr2));
    }
}
