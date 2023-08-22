import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 3, 3, 4, 5};
        System.out.println("Array = " + Arrays.toString(arr1));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Recursion.canPartition(arr1, arr1.length));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Memoization.canPartition(arr1));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Tabulation.canPartition(arr1));

        int[] arr2 = {1, 5, 11, 5};
        System.out.println("Array = " + Arrays.toString(arr2));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Recursion.canPartition(arr2, arr2.length));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Memoization.canPartition(arr2));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Tabulation.canPartition(arr2));

        int[] arr3 = {5, 6, 5, 11, 6};
        System.out.println("Array = " + Arrays.toString(arr3));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Recursion.canPartition(arr3, arr3.length));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Memoization.canPartition(arr3));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Tabulation.canPartition(arr3));

        int[] arr4 = {1, 2, 3, 5};
        System.out.println("Array = " + Arrays.toString(arr4));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Recursion.canPartition(arr4, arr4.length));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Memoization.canPartition(arr4));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Tabulation.canPartition(arr4));

        int[] arr5 = {8, 7, 6, 12, 4, 5};
        System.out.println("Array = " + Arrays.toString(arr5));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Recursion.canPartition(arr5, arr5.length));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Memoization.canPartition(arr5));
        System.out.println("Can have exactly two subsets with equal sum? " + Subset_Tabulation.canPartition(arr5));
    }
}
