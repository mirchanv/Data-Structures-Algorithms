import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Initial Array : " + Arrays.toString(arr));
        System.out.println("Cumulative Sum (approach 1) : " + Arrays.toString(Approach1.cumulativeSum(arr)));
        System.out.println("Cumulative Sum (approach 2) : " + Arrays.toString(Approach2.cumulativeSum(arr)));
    }
}
