package PracProgram.String;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {

        System.out.println(isPolindrom("malayalam"));
        System.out.println(isPolindrom("akshay"));
    }
    public static boolean isPolindrom(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
                i++;
                j--;
        }
        return true;
    }
}
