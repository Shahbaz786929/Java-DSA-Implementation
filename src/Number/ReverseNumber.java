package Number;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = sc.nextInt();
        int rev = 0;

        while (input > 0) {
            int lastDigit = input % 10;
            rev = rev * 10 + lastDigit;
            input = input / 10;
        }
        System.out.println(rev);
    }
}
