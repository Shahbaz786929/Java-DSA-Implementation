package Pattern;

import java.util.Scanner;

public class SandglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= row; i++) {

            // Spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int k = 1; k <= 2 * (row - i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = 2; i <= row; i++) {

            // Spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
