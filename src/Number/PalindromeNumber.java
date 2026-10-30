package Number;

import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (isPalindrome(n))
            System.out.println(n + " is Palindrome");
        else
            System.out.println(n + " is Not Palindrome");
    }
}
