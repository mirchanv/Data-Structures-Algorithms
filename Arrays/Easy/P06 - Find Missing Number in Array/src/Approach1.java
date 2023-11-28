public class Approach1 {

    // Time Complexity  : O(n)
    // Space Complexity : O(1) no extra space used
    public static int findMissingNumber(int[] arr, int n) {
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i-1] != i)
                return i;
        }
        return -1;
    }
}
