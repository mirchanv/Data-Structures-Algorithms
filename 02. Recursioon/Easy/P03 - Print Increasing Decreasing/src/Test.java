public class Test {

    public static void main(String[] args) {
        int n = 5;
        printIncDec(n);
    }

    public static void printIncDec(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);
    }
}
