package strings;

import java.util.Scanner;

public class RemoveFirstCharReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine().substring(1);

        for (int i = str.length() - 1; i>= 0; i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
