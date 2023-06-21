import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 0, 4, 0, 1};
        System.out.println("Original Array : " + Arrays.toString(arr1));
        Approach1.moveZerosToEnd(arr1);
        System.out.println("After Array (approach 1) : " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 0, 1, 0, 4, 0};
        System.out.println("Original Array : " + Arrays.toString(arr2));
        Approach2.moveZerosToEnd(arr2);
        System.out.println("After Array (approach 2) : " + Arrays.toString(arr2));
    }
}
