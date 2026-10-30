package Pattern;

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();

        // Upper Pyramid
        for (int i = 1; i <= row; i++) {

            for (int k = 1; k <= row - i; k++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Pyramid
        for (int i = row - 1; i >= 1; i--) {

            for (int k = 1; k <= row - i; k++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
