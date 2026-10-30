package Pattern;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yhe row");
        int row = sc.nextInt();
        int nums = 1;
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println();
        }
    }
}
