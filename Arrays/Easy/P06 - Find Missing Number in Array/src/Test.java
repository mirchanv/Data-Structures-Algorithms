import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        System.out.println("Array : " + Arrays.toString(arr1));
        System.out.println("Missing number (approach 1) : " + Approach1.findMissingNumber(arr1, arr1.length+1));
        System.out.println("Missing number (approach 2) : " + Approach2.findMissingNumber(arr1, arr1.length+1));

        int[] arr2 = {1, 3};
        System.out.println("Array : " + Arrays.toString(arr2));
        System.out.println("Missing number (approach 1) : " + Approach1.findMissingNumber(arr2, arr2.length+1));
        System.out.println("Missing number (approach 2) : " + Approach2.findMissingNumber(arr2, arr2.length+1));
    }
}
