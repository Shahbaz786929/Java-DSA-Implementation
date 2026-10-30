package Number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        if (isPrime(input)){
            System.out.println(input + " is prime Number");
        }
        else {
            System.out.println(input + " is Not prime Number");
        }
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
