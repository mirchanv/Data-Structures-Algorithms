import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println("Actual array : " + Arrays.toString(nums));
        System.out.println("All Subsets without duplicates are : " + SubsetSum.subsetsWithoutDups(nums));
    }
}
