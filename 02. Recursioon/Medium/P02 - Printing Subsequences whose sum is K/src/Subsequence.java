import java.util.ArrayList;

public class Subsequence {

    public static void printSubsequence(int[] arr, int index, int target, ArrayList<Integer> ans) {
        if (index == arr.length) {
            if (target == 0) {
                System.out.println("-> " + ans);
            }
            return;
        }

        if (arr[index] <= target) {
            ans.add(arr[index]);
            printSubsequence(arr, index+1, target-arr[index], ans);     // pick
            ans.remove(ans.size()-1);
        }
        printSubsequence(arr, index+1, target, ans);       // not pick
    }

    public static boolean printAnyOneSubsequence(int[] arr, int index, int target, ArrayList<Integer> ans) {
        if (index == arr.length) {
            if (target == 0) {
                System.out.println("-> " + ans);
                return true;
            }
            return false;
        }

        if (arr[index] <= target) {
            ans.add(arr[index]);
            if (printAnyOneSubsequence(arr, index+1, target-arr[index], ans)) {
                return true;
            }
            ans.remove(ans.size()-1);
        }
        return printAnyOneSubsequence(arr, index+1, target, ans);
    }

    public static int countAllSubsequences(int[] arr, int index, int target) {
        if (index == arr.length) {
            if (target == 0)
                return 1;
            else
                return 0;
        }

        int pick = countAllSubsequences(arr, index+1, target-arr[index]);
        int npick = countAllSubsequences(arr, index+1, target);

        return pick + npick;
    }
}
