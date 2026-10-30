package Number;

import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int nums = sc.nextInt();

        int original = nums;
        int sum = 0;

        while (nums > 0) {
            sum += nums % 10;
            nums /= 10;
        }

        if (original % sum == 0) {
            System.out.println(original + " is Niven Number");
        } else {
            System.out.println(original + " is not a Niven Number");
        }

        sc.close();
    }
}
