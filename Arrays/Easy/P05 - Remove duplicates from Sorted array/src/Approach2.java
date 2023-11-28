public class Approach2 {

    // Time Complexity  : O(n)
    // Space Complexity : O(1)
    public static int removeDuplicates(int[] arr) {
        int i = 0;
        int j = i+1;

        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}
