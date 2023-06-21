import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        System.out.println("Actual Array = " + Arrays.toString(candidates));
        System.out.println("Target sum = " + target);
        System.out.println("All combinations whose sum = 8, are : " + "\n" +
                CombinationSum.combinationSum2(candidates, target) + "\n");

    }
}
