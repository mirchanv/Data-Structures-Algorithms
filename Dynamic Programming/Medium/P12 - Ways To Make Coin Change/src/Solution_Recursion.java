public class Solution_Recursion {

    public static long countWaysToMakeChange(int denominations[], int value){
        int n = denominations.length;
        return helper(denominations, n-1, value);
    }

    private static long helper(int[] arr, int index, int target) {
        if (target == 0) return 1;
        else if (index == 0) {
            if (target % arr[0] == 0) return 1;
            else return 0;
        }

        long pick = 0;
        if (arr[index] <= target)
            pick = helper(arr, index, target-arr[index]);

        long notPick = helper(arr, index-1, target);

        return pick + notPick;
    }
}
