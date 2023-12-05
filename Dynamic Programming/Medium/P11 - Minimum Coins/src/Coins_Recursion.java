public class Coins_Recursion {

    public static int minimumElements(int num[], int x) {
        int ans =  helper(num, num.length-1, x);
        if (ans >= (int)Math.pow(10,9)) return -1;
        return ans;
    }

    private static int helper(int[] arr, int index, int target) {
        if (index == 0) {
            if (target % arr[0] == 0)
                return (target / arr[0]);
            else
                return (int)Math.pow(10,9);
        }

        int pick = Integer.MAX_VALUE;
        if (arr[index] <= target)
            pick = 1 + helper(arr, index, target - arr[index]);

        int notPick = 0 + helper(arr, index-1, target);

        return Math.min(pick, notPick);
    }
}
