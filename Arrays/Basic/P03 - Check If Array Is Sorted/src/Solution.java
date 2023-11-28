public class Solution {

    // Time Complexity: O(n)
    public static boolean isSorted(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return true;

        int n = arr.length-1;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}
