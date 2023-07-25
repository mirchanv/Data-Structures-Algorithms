public class FrogJump_Recursion {

    public static int frogJump(int[] arr) {
        return minJumps(arr, 0);
    }

    private static int minJumps(int[] arr, int idx) {
        if (idx == arr.length-1)
            return 0;

        int oneStep = Math.abs(arr[idx+1] - arr[idx]) + minJumps(arr, idx + 1);

        if ((idx+2) <= arr.length-1) {
            int twoStep = Math.abs(arr[idx + 2] - arr[idx]) + minJumps(arr, idx + 2);
            return Math.min(oneStep, twoStep);
        }

        return oneStep;
    }
}
