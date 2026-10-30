package Number;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the number: ");
        int n = scanner.nextInt();

        int sq = n * n;
        int sum = 0;

        while (sq > 0){
            sum += sq % 10;
            sq /= 10;
        }
        if (n == sum){
            System.out.println("Number is Neon: ");
        }
        else {
            System.out.println("Number is Not Neon: ");
        }
    }
}
// 9 => 9*9 => 81 => 8 + 1 = 9
//given number aur output are same then number is Nean number