import java.util.Arrays;

public class Approach1 {

    // Time Complexity  : O(n^2) where n is the size of the array
    // Space Complexity : O(1) no extra space used
    public static boolean pairExists(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }

    // Time Complexity  : O(n^2) where n is the size of the array
    // Space Complexity :
    public static int[] getPair(int[] arr, int target) {
        int[] pair = new int[2];
        int n = arr.length;

        Arrays.fill(pair, -1);

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    pair[0] = i;
                    pair[1] = j;
                }
            }
        }

        return pair;
    }
}
