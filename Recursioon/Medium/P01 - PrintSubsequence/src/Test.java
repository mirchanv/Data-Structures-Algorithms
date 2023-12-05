import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("All subsequences are : " + Subsequence.printAllSubsequences(arr));
    }
}
