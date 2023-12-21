import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("All subsequences whose sum is k are : ");
        Subsequence.printSubsequence(arr, 0, k, new ArrayList<>());

        System.out.println("Printing any one subsequence : ");
        Subsequence.printAnyOneSubsequence(arr, 0, k, new ArrayList<>());

        System.out.println("Count of all subsequence is : " + Subsequence.countAllSubsequences(arr, 0, k));
    }
}
