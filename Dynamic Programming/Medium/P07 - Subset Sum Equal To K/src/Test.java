import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 4;
        System.out.println("Array = " + Arrays.toString(arr));

        // solution using recursion
        System.out.println("Has subset equal to target = " + k + "? " + Subset_Recursion.subsetSumToK(arr, k));

        // solution using memoization
        System.out.println("Has subset equal to target = " + k + "? " + Subset_Memoization.subsetSumToK(arr, k));

        // solution using tabulation
        System.out.println("Has subset equal to target = " + k + "? " + Subset_Tabulation.subsetSumToK(arr, k));
    }
}
