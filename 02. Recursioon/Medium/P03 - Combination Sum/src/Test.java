import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;

        System.out.println("Input Array: " + Arrays.toString(candidates));
        System.out.println("\nAll combination whose sum equal to target are:\n"
                + "combos = " + CombinationSum.combinationSum(candidates, target));
    }
}
