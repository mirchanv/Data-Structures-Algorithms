import java.util.ArrayList;
import java.util.List;

public class Approach1 {

    // Time Complexity  : O(N + M) in worst case where N and M are sizes of arr1 & arr2
    // Space Complexity : O(1) no extra space used
    public static List<Integer> getIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int i= 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection.add(arr1[i]);
                j++;
            }
            i++;
        }
        return intersection;
    }
}
