package PracProgram.String;

public class ReverseChar {
    public static void main(String[] args) {
        String s = "java is easy";
        String [] str = s.split(" ");
       // for (int i = 0; i<str.length; i++) {
            System.out.println(rev(s) + " ");
       // }
    }
    public static String rev(String s) {
        String res = " ";
        for (int i = s.length() - 1; i>=0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
