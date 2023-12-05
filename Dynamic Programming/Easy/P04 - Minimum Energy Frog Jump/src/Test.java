import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        // Test case: 1
        int[] arr1 = {10, 20, 30, 10};

        // solution using recursion
        System.out.println("Height array = " + Arrays.toString(arr1));
        System.out.println("Minimum energy needed to reach top nth floor : " + FrogJump_Recursion.frogJump(arr1) + "\n");

        // solution using memoization
        System.out.println("Height array = " + Arrays.toString(arr1));
        System.out.println("Minimum energy needed to reach top nth floor : " + FrogJump_Memoization.frogJump(arr1) + "\n");

        // solution using tabulation
        System.out.println("Height array = " + Arrays.toString(arr1));
        System.out.println("Minimum energy needed to reach top nth floor : " + FrogJump_Tabulation.frogJump(arr1) + "\n");


        // Test case: 2
        int[] arr2 = {30, 10, 60, 10, 60, 50};

        // solution using recursion
        System.out.println("Height array = " + Arrays.toString(arr2));
        System.out.println("Minimum energy needed to reach top nth floor : " + FrogJump_Recursion.frogJump(arr2) + "\n");

        // solution using memoization
        System.out.println("Height array = " + Arrays.toString(arr2));
        System.out.println("Minimum energy needed to reach top nth floor : " + FrogJump_Memoization.frogJump(arr2) + "\n");

        // solution using tabulation
        System.out.println("Height array = " + Arrays.toString(arr2));
        System.out.println("Minimum energy needed to reach top nth floor : " + FrogJump_Tabulation.frogJump(arr2));
    }
}
