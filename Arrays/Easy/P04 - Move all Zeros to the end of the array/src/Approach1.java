public class Approach1 {

    // Time Complexity  : O(n)
    // Space Complexity : O(n) extra ans array used for n elements
    public static void moveZerosToEnd(int[] arr) {
        int[] ans = new int[arr.length];
        int index = 0;

        // adding values to ans array which are not 0 first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                ans[index++] = arr[i];
        }

        // copying values from ans array to original arraay
        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }
}
