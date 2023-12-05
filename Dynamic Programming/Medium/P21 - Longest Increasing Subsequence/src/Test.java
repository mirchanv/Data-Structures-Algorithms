import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};

        System.out.println("arr = " + Arrays.toString(nums1));

        // solution using recursion
        System.out.println("\tLongest Increasing Subsequence = " + Solution_Recursion.lengthOfLIS(nums1));
        // solution using memoization
        System.out.println("\tLongest Increasing Subsequence = " + Solution_Memoization.lengthOfLIS(nums1) + "\n");


        System.out.println("arr = " + Arrays.toString(nums2));

        // solution using recursion
        System.out.println("\tLongest Increasing Subsequence = " + Solution_Recursion.lengthOfLIS(nums2));
        // solution using memoization
        System.out.println("\tLongest Increasing Subsequence = " + Solution_Memoization.lengthOfLIS(nums2) + "\n");


        System.out.println("arr = " + Arrays.toString(nums3));

        // solution using recursion
        System.out.println("\tLongest Increasing Subsequence = " + Solution_Recursion.lengthOfLIS(nums3));
        // solution using memoization
        System.out.println("\tLongest Increasing Subsequence = " + Solution_Memoization.lengthOfLIS(nums3));
    }
}
