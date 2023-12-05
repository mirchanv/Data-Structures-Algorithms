import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 5};
        int target = 5;

        System.out.println("Nums = " + Arrays.toString(nums) + "\nTarget = " + target + "\n");

        // solution using recursion
        System.out.println("Total no. of subsets equal to target : " + Subsets_Recursion.countSubsets(nums, target));

        // solution using memoization
        System.out.println("Total no. of subsets equal to target : " + Subsets_Memoization.countSubsets(nums, target));

        // solution using memoization
        System.out.println("Total no. of subsets equal to target : " + Subsets_Tabulation.countSubsets(nums, target));
    }
}
