package Number;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int nums = sc.nextInt();

        if (nums % 2 == 0) {
            System.out.println(nums + " is even Number");
        } else {
            System.out.println(nums + " is odd Number");
        }
    }
}
