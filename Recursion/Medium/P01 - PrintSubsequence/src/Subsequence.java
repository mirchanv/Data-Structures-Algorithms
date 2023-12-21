import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    private static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> printAllSubsequences(int[] arr) {
        if (arr.length > 0)
            helper(arr, 0, new ArrayList<>());

        return ans;
    }
    private static void helper(int[]arr, int index, ArrayList<Integer> list) {
        if (index >= arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // IF selecting the element
        list.add(arr[index]); // add element
        helper(arr, index+1, list);

        // IF not selecting the element
        list.remove(list.size()-1); // remove last added item
        helper(arr, index+1, list);
    }
}
