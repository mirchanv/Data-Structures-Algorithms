public class Solution {

    public static void leftRotate(int[] arr, int k) {
        if (arr.length == 0 || k == 0)
            return;

        int n = arr.length;
        k = k % n;

        // reverse first k elements
        reverse(arr, 0, k-1);

        // reverse rest of elements in array from k to n-1
        reverse(arr, k, n-1);

        // reverse full array
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        if (i == j)
            return;

        int left = i;
        int right = j;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
