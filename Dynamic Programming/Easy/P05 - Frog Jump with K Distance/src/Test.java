import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] height = {10, 20, 30, 15};
        int k = 3;

        // recursion solution
        System.out.println("height = " + Arrays.toString(height) + "\n" + "k = " + k);
        System.out.println("Minimum energy required to reach nth staircase = " + FrogJump_Recursion.frogJump(height, k));

        // memoization solution
        System.out.println("height = " + Arrays.toString(height) + "\n" + "k = " + k);
        System.out.println("Minimum energy required to reach nth staircase = " + FrogJump_Memoization.frogJump(height, k));
    }
}
