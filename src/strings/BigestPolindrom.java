package strings;

import java.util.Scanner;

public class BigestPolindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String bigestPolindrom = "";

        for (int i = 0; i < str.length(); i++){
            for (int j = i + 3; j <= str.length(); j++){
                String ch = str.substring(i, j);
                if (isPolindrom(str)){
                    if (str.length() > bigestPolindrom.length()){
                        bigestPolindrom = ch;
                    }
                }
            }

        }
        System.out.println(bigestPolindrom);
    }
    public static boolean isPolindrom(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
