import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1};
        System.out.println("Array : " + Arrays.toString(arr1));
        System.out.println("Element appearing once (approach1) : " + Approach1.findNumberAppearingOnce(arr1));
        System.out.println("Element appearing once (approach2) : " + Approach2.findNumberAppearingOnce(arr1));

        int[] arr2 = {4, 1, 2, 1, 2};
        System.out.println("Array : " + Arrays.toString(arr2));
        System.out.println("Element appearing once (approach1) : " + Approach1.findNumberAppearingOnce(arr2));
        System.out.println("Element appearing once (approach2) : " + Approach2.findNumberAppearingOnce(arr2));
    }
}
