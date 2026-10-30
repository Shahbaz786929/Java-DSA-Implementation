package Number;

import java.util.Scanner;

public class DigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int nums = sc.nextInt();

        int count = 0;

        while (nums > 0) {
            count++;
            nums = nums / 10;
        }
        System.out.println(count);

    }
}
