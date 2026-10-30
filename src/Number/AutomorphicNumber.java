package Number;

import java.util.Scanner;

public class AutomorphicNumber {
    static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (isAutomorphic(n))
            System.out.println(n + " is Automorphic");
        else
            System.out.println(n + " is Not Automorphic");
    }
}
