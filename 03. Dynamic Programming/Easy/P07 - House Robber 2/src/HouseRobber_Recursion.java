public class HouseRobber_Recursion {

    public static int rob(int[] money) {
        int ans1 = helper(money, 0, money.length-1);
        int ans2 = helper(money, 1, money.length);
        return Math.max(ans1, ans2);
    }

    private static int helper(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return 0;

        int pick = arr[startIndex] + helper(arr, startIndex + 2, endIndex);
        int notPick = helper(arr, startIndex + 1, endIndex);

        return Math.max(pick, notPick);
    }
}
