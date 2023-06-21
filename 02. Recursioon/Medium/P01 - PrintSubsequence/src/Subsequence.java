import java.util.ArrayList;

public class Subsequence {

    public static void printAllSubsequences(int[]arr, int index, ArrayList<Integer> ans) {
        if (index >= arr.length) {
            System.out.println("-> " + ans);
            return;
        }

        // IF selecting the element
        ans.add(arr[index]); // add element
        printAllSubsequences(arr, index+1, ans);

        // IF not selecting the element
        ans.remove(ans.size()-1); // remove last added item
        printAllSubsequences(arr, index+1, ans);
    }
}
