public class Test {

    public static void main(String[] args) {
        int n = 5;
        printDecreasing(n);
    }

    // EXPECTATION : To have output as: 5,4,3,2,1 [n to 1]
    // FAITH : Recursion prints n to 1 in decreasing order
    // TASK : Prints number from n to 1 in decreasing order
    public static void printDecreasing(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printDecreasing(n-1);
    }
}
