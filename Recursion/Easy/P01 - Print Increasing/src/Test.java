public class Test {
    public static void main(String[] args) {
        int n = 5;
        printIncreasing(n);
    }

    // EXPECTATION : To have output as: 1,2,3,4,5 [1 to n]
    // FAITH : recursion prints 1 to n in increasing order
    // TASK : Print number from 1 to n in increasing order
    public static void printIncreasing(int n) {
        if (n == 0)
            return;

        printIncreasing(n-1);
        System.out.println(n);
    }
}
