package strings;

public class testing {
    public static void main(String[] args) {
        String s = " the sky is blue ";
        reverseWords("skjfhs skdfs  skhsdfld");

    }
    static void reverseWords(String s) {
        s = s.trim();

        String[] str = s.split(" +");


        StringBuilder sb = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        // return sb.toString();

    }
}