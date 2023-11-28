public class Approach2 {

    // Time Complexity  : O(n)
    // Space Complexity : O(1) no extra space used
    public static int findMissingNumber(int[] arr, int n) {
        int sumArray = 0;

        for (int num : arr)
            sumArray += num;

        return (n * (n + 1) / 2) - sumArray;
    }
}
