package Pattern;

import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = se.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
