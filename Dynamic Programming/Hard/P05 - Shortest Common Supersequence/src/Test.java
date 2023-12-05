public class Test {
    public static void main(String[] args) {
        String str1A = "brute";
        String str1B = "groot";

        System.out.println("str1 = " + str1A + "\nstr2 = " + str1B);
        System.out.println("Shortest Common Supersequence is : " + Solution.shortestCommonSupersequence(str1A, str1B) + "\n");

        String str2A = "bleed";
        String str2B = "blue";

        System.out.println("str1 = " + str2A + "\nstr2 = " + str2B);
        System.out.println("Shortest Common Supersequence is : " + Solution.shortestCommonSupersequence(str2A, str2B));
    }
}
