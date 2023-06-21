public class Solution {

    public static int isPresent(int[ ]arr, int num) {
        if (arr.length == 0)
            return -1;

        int n = arr.length -1;
        for (int i = 0; i <= n; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }
}
