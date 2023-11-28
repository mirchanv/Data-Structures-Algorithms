public class Solution {

    // Time Complexity  : O(n)
    // Space Complexity : O(1) no extra space used
    public static int getMaxConsecutiveOnes(int[] arr) {
        if (arr.length == 0)
            return 0;

        int max = 0;
        int count = 0;

        for (int currVal : arr) {
            if (currVal == 1)
                count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
