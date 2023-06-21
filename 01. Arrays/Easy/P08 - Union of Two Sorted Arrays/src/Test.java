import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};
        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));
        System.out.println("Union (approach 1) : " + Approach1.getUnion(arr1, arr2));
        System.out.println("Union (approach 2) : " + Approach2.getUnion(arr1, arr2));

        int[] arr3 = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr4 = {1, 2, 3, 4, 4, 5, 11, 12};
        System.out.println("Array 3 : " + Arrays.toString(arr3));
        System.out.println("Array 4 : " + Arrays.toString(arr4));
        System.out.println("Union (approach 1) : " + Approach1.getUnion(arr3, arr4));
        System.out.println("Union (approach 2) : " + Approach2.getUnion(arr3, arr4));
    }
}
