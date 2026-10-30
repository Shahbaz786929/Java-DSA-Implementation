package Number;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int s1 = scan.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        int s2 = scan.nextInt();
        System.out.println("Enter marks of Subject 3: ");
        int s3 = scan.nextInt();
        System.out.print("Enter marks of Subject 4: ");
        int s4 = scan.nextInt();
        System.out.print("Enter marks of Subject 5: ");
        int s5 = scan.nextInt();
        System.out.print("Enter marks of Subject 6: ");
        int s6 = scan.nextInt();

        int total = s1 + s2 + s3 + s4 + s5 + s6;

        System.out.println("\nTotal Marks: " + total + " out of 600");

        if (total >= 480 && total <= 600) {
            System.out.println("Result: First Division");
        } else {
            if (total >= 360 && total < 480) {
                System.out.println("Result: Second Division");
            } else {
                if (total >= 211 && total < 360) {
                    System.out.println("Result: Third Division");
                } else {
                    System.out.println("Result: Fail");
                }
            }
        }
    }
}
