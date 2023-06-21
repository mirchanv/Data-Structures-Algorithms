public class Test {

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total paths possible : " + getTotalPaths(n));
        printPaths(n, new String());
    }

    public static int getTotalPaths(int n) {
        if (n == 0)
            return 1;   // valid path found, so count it
        else if (n < 0)
            return 0;   // invalid path, so ignore it

        int jump1 = getTotalPaths(n-1);
        int jump2 = getTotalPaths(n-2);
        int jump3 = getTotalPaths(n-3);

        return jump1 + jump2 + jump3;
    }

    public static void printPaths(int n, String path) {
        if (n == 0)
            System.out.println(path);
        else if (n < 0)
            return;

        printPaths(n-1, path+"j1 ");
        printPaths(n-2, path+"j2 ");
        printPaths(n-3, path+"j3 ");
    }
}
