package Number;

import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmstrong(int n) {
        int digits = String.valueOf(n).length();
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (isArmstrong(n))
            System.out.println(n + " is Armstrong");
        else
            System.out.println(n + " is Not Armstrong");
    }
}
