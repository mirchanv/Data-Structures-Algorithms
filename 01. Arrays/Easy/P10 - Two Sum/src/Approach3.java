import java.util.Arrays;

public class Approach3 {

    public static boolean pairExists(int[] arr, int target) {
        sort(arr, 0 , arr.length-1);
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if (arr[left] + arr[right] == target)
                return true;
            else if (arr[left] + arr[right] < target)
                left++;
            else
                right--;
        }
        return false;
    }

    public static int[] getPair(int[] arr, int target) {
        sort(arr, 0 , arr.length-1);
        int left = 0;
        int right = arr.length-1;

        int[] pair = new int[2];
        Arrays.fill(pair, -1);

        while (left < right) {
            if (arr[left] + arr[right] == target) {
                pair[0] = left;
                pair[1] = right;
                return pair;
            } else if (arr[left] + arr[right] < target)
                left++;
            else
                right--;
        }
        return pair;
    }

    private static void sort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int pivotIndex = quickSort(arr, start, end);
        sort(arr, start, pivotIndex - 1);
        sort(arr, pivotIndex + 1, end);
    }

    private static int quickSort(int[] arr, int start, int end) {
        int left = start;
        int right = end;

        while (left < right) {
            if (left < end && arr[left+1] <= arr[left]) {
                swap(arr, left, left+1);
                left++;
            } else if (right > start && arr[right] > arr[left])
                right--;
            else
                swap(arr, left+1, right);
        }
        return left;
    }

    private static void swap(int[ ]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
