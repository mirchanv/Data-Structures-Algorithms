public class Approach2 {

    // Time Complexity  : O(N)
    // Space Complexity : O(1) no extra space used
    public static int findNumberAppearingOnce(int[] arr) {
        int xor = 0;

        for (int num : arr)
            xor = xor ^ num;

        return xor;
    }
}
