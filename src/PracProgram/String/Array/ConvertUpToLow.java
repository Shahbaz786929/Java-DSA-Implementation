package PracProgram.String.Array;

public class ConvertUpToLow {
    public static void main(String[] args) {
        String str = "Java";
        char [] ch = str.toCharArray();
        for ( int i = 0; i < str.length(); i++){
            if (ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i] -= 32;
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            }
        }
        System.out.println(str);
        System.out.println(ch);
    }
}
