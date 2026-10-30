package strings;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings:");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (sb.indexOf(s.valueOf(ch)) < 0){
                sb.append(ch);
            }
        }
        System.out.println("String after removing duplicate: " + sb);
    }
}
