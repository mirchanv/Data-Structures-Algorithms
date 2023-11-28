public class Approach2 {

    // Time Complexity : O(n)
    public static int[] cumulativeSum(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = arr[0];

        for (int i = 1; i < arr.length; i++)
            ans[i] = ans[i-1] + arr[i];

        return ans;
    }
}
