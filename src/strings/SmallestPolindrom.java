package strings;

import java.util.Scanner;

public class SmallestPolindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String smallPolindrom = s;
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 3; j < s.length(); j++){
               String str = s.substring(i, j);
               if (isPolindrom(str)){
                   if (str.length() < smallPolindrom.length()){
                       smallPolindrom = str;
                       System.out.println(smallPolindrom);
                   }
               }
            }
        }
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
