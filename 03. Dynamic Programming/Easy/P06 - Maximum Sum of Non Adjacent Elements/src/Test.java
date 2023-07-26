public class Test {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 4, 9};

        // solution using recursion approach
        System.out.println("List of non-adjacent subsequences are: " + Solution_Recursion.MaximumNonAdjacentSum(nums1));

        // solution using memoization approach
        System.out.println("List of non-adjacent subsequences are: " + Solution_Memoization.MaximumNonAdjacentSum(nums1));

        // solution using tabulation approach
        System.out.println("List of non-adjacent subsequences are: " + Solution_Tabulation.MaximumNonAdjacentSum(nums1) + "\n");


        int[] nums2 = {1, 2, 4};

        // solution using recursion approach
        System.out.println("List of non-adjacent subsequences are: " + Solution_Recursion.MaximumNonAdjacentSum(nums2));

        // solution using memoization approach
        System.out.println("List of non-adjacent subsequences are: " + Solution_Memoization.MaximumNonAdjacentSum(nums2));

        // solution using tabulation approach
        System.out.println("List of non-adjacent subsequences are: " + Solution_Tabulation.MaximumNonAdjacentSum(nums2));
    }
}
