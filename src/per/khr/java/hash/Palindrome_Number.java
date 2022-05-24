package per.khr.java.hash;

public class Palindrome_Number {
    public static void main(String[] args) {
        int x = 121;

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String target = Integer.toString(x);

        for (int i = 0; i < target.length() / 2; ++i) {
            if (target.charAt(i) != target.charAt(target.length() - 1 - i)) return false;
        }

        return true;
    }
}
