import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("All subsequences whose sum is k are : ");
        Subsequence.printAnyOneSubsequence(arr, 0, k, new ArrayList<>(), 0);

        System.out.println("Count of all subsequence is : " + Subsequence.countAllSubsequences(arr, 0, k, 0));
    }
}
