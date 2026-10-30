package Number;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int nums = sc.nextInt();
        int sum = 0;

        while (nums > 0) {
            int lastDigit = nums % 10 ;
            sum += lastDigit;
            nums = nums / 10;
        }

        System.out.println("Sum is = " + sum);
    }
}
