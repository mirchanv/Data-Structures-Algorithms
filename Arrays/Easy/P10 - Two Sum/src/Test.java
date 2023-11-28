import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        System.out.println("Array : " + Arrays.toString(arr) + "\nTarget : " + target);
        System.out.println("\tDoes a two sum pair exists? (approach 1) " + Approach1.pairExists(arr, target));
        System.out.println("\tPair Index (approach 1) : " + Arrays.toString(Approach1.getPair(arr, target)));
        System.out.println("\tDoes a two sum pair exists? (approach 2) " + Approach2.pairExists(arr, target));
        System.out.println("\tPair Index : (approach 2) " + Arrays.toString(Approach2.getPair(arr, target)));
        System.out.println("\tDoes a two sum pair exists? (approach 3) " + Approach3.pairExists(arr, target));
        System.out.println("\tPair Index : (approach 3) " + Arrays.toString(Approach3.getPair(arr, target)) + "\n");

        target = 15;
        System.out.println("Array : " + Arrays.toString(arr) + "\nTarget : " + target);
        System.out.println("\tDoes a two sum pair exists? (approach 1) " + Approach1.pairExists(arr, target));
        System.out.println("\tPair Index (approach 1) : " + Arrays.toString(Approach1.getPair(arr, target)));
        System.out.println("\tDoes a two sum pair exists? (approach 2) " + Approach2.pairExists(arr, target));
        System.out.println("\tPair Index : (approach 2) " + Arrays.toString(Approach2.getPair(arr, target)));
        System.out.println("\tDoes a two sum pair exists? (approach 3) " + Approach3.pairExists(arr, target));
        System.out.println("\tPair Index (approach 3) : " + Arrays.toString(Approach3.getPair(arr, target)) + "\n");
    }
}
