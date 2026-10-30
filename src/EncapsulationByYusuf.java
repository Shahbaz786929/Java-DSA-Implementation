import java.util.Scanner;

public class EncapsulationByYusuf {
    public static void main(String[] args) {
        String s1 = "aaabbbbcndj";
        String s2 = " ";
        char min1Char = ' ';
        char min2Char = ' ';
        char min3Char = ' ';
        int min3 = 0;
        int min1 = 0;
        int min2 = 0;
        while (s1.length() > 0){
            char ch = s1.charAt(0);
            s2 = s1.replace(ch + "","");
            int count = s1.length() - s2.length();
            if (count < min1) {
                min2 = min1;
                min3 = min2;
                min2Char = min1Char;
                min3Char = min2Char;
                min1 = count;
                min1Char = ch;
            } else if (count < min2) {
                min2 = count;
                min2Char = ch;
            }
            s1 = s2;

        }
        System.out.println(min2Char + "=" + min2);
    }
}
