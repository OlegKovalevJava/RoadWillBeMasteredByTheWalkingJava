package finished.lesson51;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(121 % 10);
        System.out.println(121 / 10);
        System.out.println(12 / 10);
        System.out.println(1 / 10);

    }

    public static boolean isPalindrome(int x) {
        int palindrome = x;

        if (x < 0) {
            return false;
        }

        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return x == reverse;
    }
}