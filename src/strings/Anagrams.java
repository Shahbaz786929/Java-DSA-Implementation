package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String:");
        String s1 = sc.nextLine();
        System.out.println("Enter second String:");
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()){
            System.out.println("String is a not anagram !!!!");
            return;
        }
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2)){
            System.out.println("String is Anagram :");
        }
        else {
            System.out.println("String is not Anagram :!!");
        }
    }
}
