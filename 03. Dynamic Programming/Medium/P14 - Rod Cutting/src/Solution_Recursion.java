public class Solution_Recursion {

    public static int cutRod(int price[], int n) {
        return helper(price, n-1, n);
    }

    private static int helper(int[] arr, int index, int target) {
        if (index == 0)  return target * arr[0];

        int cut = Integer.MIN_VALUE;
        if (index+1 <= target)
            cut = arr[index] + helper(arr, index, target-(index+1));

        int notCut = 0 + helper(arr, index-1, target);

        return Math.max(cut, notCut);
    }
}