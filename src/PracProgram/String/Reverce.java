package PracProgram.String;

public class Reverce {

    public static void main(String[] args) {
        String s = "jspider";
        String result = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}
