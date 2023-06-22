import java.util.ArrayList;

public class Subsequence {

    public static void printSubsequence(int[] arr, int index, int k, ArrayList<Integer> ans, int sum) {
        if (index <= arr.length && sum == k) {
            System.out.println("-> " + ans);
            return;
        } else if (index >= arr.length)
            return;

        boolean wasPicked = false;
        if (sum + arr[index] <= k) {
            wasPicked = true;
            ans.add(arr[index]);
            printSubsequence(arr, index+1, k, ans, sum+arr[index]);     // pick
        }

        if (wasPicked)
            ans.remove(ans.size()-1);

        printSubsequence(arr, index+1, k, ans, sum);       // not pick
    }

    public static boolean printAnyOneSubsequence(int[] arr, int index, int k, ArrayList<Integer> ans, int sum) {
        // System.out.println("ps(arr," + index + ", " + k + ", " + ans + ", " + sum);
        if (index <= arr.length && sum == k) {
            System.out.println("-> " + ans);
            return true;
        } else if (index >= arr.length)
            return false;

        boolean wasPicked = false;
        if (sum + arr[index] <= k) {
            ans.add(arr[index]);
            wasPicked = true;
            if (printAnyOneSubsequence(arr, index+1, k, ans, sum+arr[index]))
                    return true;
        }

        if (wasPicked)
            ans.remove(ans.size()-1);

        return printAnyOneSubsequence(arr, index+1, k, ans, sum);
    }

    public static int countAllSubsequences(int[] arr, int index, int k, int sum) {
        if (index == arr.length) {
            if (sum == k)
                return 1;
            else
                return 0;
        }

        int pick = countAllSubsequences(arr, index+1, k, sum+arr[index]);
        int npick = countAllSubsequences(arr, index+1, k, sum);

        return pick + npick;
    }
}
