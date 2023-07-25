public class FrogJump_Recursion {

    public static int frogJump(int[] height, int k) {
        return getMinEnergy(height, 0, k);
    }

    private static int getMinEnergy(int[] arr, int index, int k) {
        if (index == arr.length-1)
            return 0;

        int energyLost = Integer.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            if ((index+i) <= arr.length-1) {
                int jump = Math.abs(arr[index+i] - arr[index]) + getMinEnergy(arr, index + i, k);
                energyLost = Math.min(energyLost, jump);
            }
        }
        return energyLost;
    }
}
