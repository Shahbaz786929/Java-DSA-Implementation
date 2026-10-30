package Number;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a+" ");
        for (int i = 0; i < number; i++){
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
 */
        // given range
        System.out.println("Enter the Range of Fibonacci Series: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a+" ");
        for (int i = 0; i<n; i++){
            int c = a + b;
            if (c > n){
                break;
            }
            System.out.println(c+" ");
            a = b;
            b = c;
        }
    }
}
