package strings;

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        String result = "";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            char s1 = str.charAt(i);
            if (s1 == 'a' || s1 == 'e' || s1 == 'i' || s1 == 'o' || s1 == 'u'){
                result += s1;
            }
        }
        System.out.println("Old String: " + str);
        System.out.println("New String: " + result);
    }
}
