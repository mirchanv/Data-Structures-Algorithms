import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 3, 4, 5, 6};
        int[] b1 = {3, 3, 5};
        System.out.println("Array a1 : " + Arrays.toString(a1));
        System.out.println("Array b1 : " + Arrays.toString(b1));
        System.out.println("Intersection : " + Approach1.getIntersection(a1, b1));

        int[] a2 = {1, 2, 3, 3, 4, 5, 6};
        int[] b2 = {3, 5};
        System.out.println("Array a1 : " + Arrays.toString(a2));
        System.out.println("Array b1 : " + Arrays.toString(b2));
        System.out.println("Intersection : " + Approach1.getIntersection(a2, b2));
    }
}
