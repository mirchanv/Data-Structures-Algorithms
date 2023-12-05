import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Actual Array : " + Arrays.toString(nums));
        System.out.println("All Permutations : " + Permutations.printAllPermutations(nums));
    }
}
