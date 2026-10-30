package PracProgram.String;

public class CountCharact {
    public static void main(String[] args) {
        String str = "Shahbaz786929@gmail.com";
        int lc = 0, uc = 0, num = 0, sp = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') uc++;
            else if (ch >= 'a' && ch <= 'z') lc++;
            else if (ch >= '0' && ch <= '9') num++;
            else sp++;
        }
        System.out.println("Lower Case :" + lc);
        System.out.println("Upper case : " + uc);
        System.out.println( "Number : " + num);
        System.out.println("Special Case : " + sp);

    }
}
