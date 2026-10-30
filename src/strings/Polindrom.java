package strings;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 3; j < s.length(); j++){
                String str = s.substring(i, j);
                if (isPolindrom(str)){
                    System.out.println(str);
                }
            }
        }
    }
    public static boolean isPolindrom(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            if (s.charAt(i) < s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

