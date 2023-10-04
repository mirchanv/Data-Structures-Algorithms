public class Test {
    public static void main(String[] args) {
        String str1A = "sea";
        String str1B = "eat";

        System.out.println("Word set = " + str1A + " and " + str1B);
        System.out.println("Minimum deletions and/or deletion required : " + Solution.minOperations(str1A, str1B) + "\n");

        String str2A = "leetcode";
        String str2B = "etco";

        System.out.println("Word set = " + str2A + " and " + str2B);
        System.out.println("Minimum deletions and/or deletion required : " + Solution.minOperations(str2A, str2B) + "\n");

        String str3A = "aaa";
        String str3B = "aa";

        System.out.println("Word set = " + str3A + " and " + str3B);
        System.out.println("Minimum deletions and/or deletion required : " + Solution.minOperations(str3A, str3B));
    }
}
