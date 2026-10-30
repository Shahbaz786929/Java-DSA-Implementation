package Pattern;

import java.util.Scanner;

public class InvertedCenteredPyramid {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = se.nextInt();

        for (int i = 1; i <= row; i++) {

            //space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //star
            for (int k = 1; k <= 2 * (row - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
