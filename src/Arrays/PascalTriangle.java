package Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sp = n - 1;

        int[][] a = new int[n][];
        isPascal(a);

        for (int i = 0; i < a.length; i++) {
            // print spaces
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }

            // print numbers in the row
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
            sp--;
        }
    }

    public static void isPascal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || i == j)
                    a[i][j] = 1;
                else
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
    }
}
