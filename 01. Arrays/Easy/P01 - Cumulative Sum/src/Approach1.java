public class Approach1 {

    // Time Complexity : O(n^2)
    public static int[] cumulativeSum(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
                ans[i] = sum;
            }
        }
        return ans;
    }
}
