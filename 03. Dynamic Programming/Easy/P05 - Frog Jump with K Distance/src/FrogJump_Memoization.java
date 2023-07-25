public class FrogJump_Memoization {

    public static int frogJump(int[] height, int k) {
        int[] dp = new int[height.length];
        return getMinEnergy(height, 0, k, dp);
    }

    private static int getMinEnergy(int[] arr, int index, int k, int[] dp) {
        if (index == arr.length-1)
            return 0;

        if (dp[index] != 0) return dp[index];

        int energyLost = Integer.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            if ((index+i) <= arr.length-1) {
                int jump = Math.abs(arr[index+i] - arr[index]) + getMinEnergy(arr, index + i, k, dp);
                energyLost = Math.min(energyLost, jump);
                dp[index] = energyLost;
            }
        }

        return dp[index];
    }
}
