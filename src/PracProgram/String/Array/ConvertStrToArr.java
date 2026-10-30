package PracProgram.String.Array;

public class ConvertStrToArr {
    public static void main(String[] args) {
        String s = "java";
        char [] ch = s.toCharArray();
        System.out.println(ch[0]);
        ch[0] = 'p';
        System.out.println(s);
        System.out.println(ch);
    }
}
