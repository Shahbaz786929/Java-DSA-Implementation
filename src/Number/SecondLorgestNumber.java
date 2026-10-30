package Number;

import java.util.Scanner;

public class SecondLorgestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        System.out.println("Enter third Number");
        int c = sc.nextInt();

        if ((a >= b && a <= c ) || (a <= b && a >= c)){
            System.out.println(a + " is second largest");
        }else if ((b >= a && b <= c) || (b <= a && b >= c)){
            System.out.println(b + " is second largest");
        } else {
            System.out.println(c + " is second largest");
        }
    }
}
