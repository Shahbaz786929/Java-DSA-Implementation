package Number;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inter The Number: ");
        int n = sc.nextInt();

        int sum = 0;
        int prod = 1;

        while (n > 0) {
            int r = n % 10;
            sum += r;
            prod *= r;
            n /= 10;
        }
            if (sum == prod){
                System.out.println("Number is Spy: ");
            }
            else {
                System.out.println("Number is not Spy ");

        }
    }
}
// 1 + 2 + 3 = 6
//1 * 2 * 3 = 6 bith are same then number is spy