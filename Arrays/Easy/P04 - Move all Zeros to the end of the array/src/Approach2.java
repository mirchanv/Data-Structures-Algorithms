public class Approach2 {

    // Time Complexity  : O(n)
    // Space Complexity : O(1) no extra space used
    public static void moveZerosToEnd(int[] arr) {
        int idx = 0;
        while (idx < arr.length) {
            if (arr[idx] == 0)
                break;
            else
                idx++;
        }

        int i = idx;
        int j = i+1;
        while (i < arr.length && j < arr.length) {
            if (arr[j] != 0) {
                swap(arr, i, j);
                i++;
            }
            j++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
