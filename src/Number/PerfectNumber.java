package Number;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int input = sc.nextInt();
        if (isPerfect(input)){
            System.out.println(input + " Is Perfect Number: ");
        }
        else {
            System.out.println(input + " is Not Perfect Number: ");
        }
    }
    static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i <= n / 2; i++){
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }
}
