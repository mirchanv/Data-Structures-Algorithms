public class Solution {

    // Time Complexity O(N)
    public static int findLargestElement_BruteForce(int[] arr) {
        if (arr.length == 0)
            return -1;
        else if (arr.length == 1)
            return arr[0];

        int max = Integer.MIN_VALUE;

        for (int num : arr)
            if (num > max)
                max = num;

        return max;
    }

    // Time Complexity O(N*log(N))
    public static int findLargestElement_Optimised(int[] arr) {
        quickSort(arr, 0, arr.length-1);
        return arr[arr.length-1];
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int pivotIndex = quickSelect(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    private static int quickSelect(int[] arr, int start, int end) {
        int left = start;
        int right = end;

        while (left < right) {
            if (arr[left+1] <= arr[left] && left < end) {
                swap(arr, left, left+1);
                left++;
            } else if (arr[right] > arr[left] && right > start)
                right--;
            else
                swap(arr, left+1, right);
        }
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
