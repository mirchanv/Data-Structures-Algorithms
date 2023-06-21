import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -6};
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Positive Cumulative Sum : " + Solution.getPositiveCumulativeSum(arr));
    }
}
