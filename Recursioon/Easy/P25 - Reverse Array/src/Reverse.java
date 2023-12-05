public class Reverse {

    public static int[] reverseArray(int[] arr) {
        if (arr.length > 1)
            helper(arr, 0, arr.length-1);

        return arr;
    }

    private static void helper(int[] arr, int start, int end) {
        if (start >= end)
            return;

        swap(arr, start, end);
        helper(arr, start+1, end-1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
