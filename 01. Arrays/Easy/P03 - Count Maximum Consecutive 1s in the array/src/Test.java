import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Array : " + Arrays.toString(arr1));
        System.out.println("Max consecutive 1s : " + Solution.getMaxConsecutiveOnes(arr1));

        int[] arr2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Array : " + Arrays.toString(arr2));
        System.out.println("Max consecutive 1s : " + Solution.getMaxConsecutiveOnes(arr2));
    }
}
