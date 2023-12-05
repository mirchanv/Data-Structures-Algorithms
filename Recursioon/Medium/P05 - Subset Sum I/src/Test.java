import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        System.out.println("Actual Array : " + Arrays.toString(nums));
        System.out.println("All subset sums in increasing order are : " + SubsetSum.subsetSum(nums));
    }
}
