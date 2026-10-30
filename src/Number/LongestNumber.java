package Number;

import java.util.Scanner;

public class LongestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        System.out.println("Enter third Number");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is Longest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is Longest");
        } else {
            System.out.println(c + " is Longest");
        }
    }
}
