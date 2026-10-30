package PracProgram.String.Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "javadev";
        String res = "";

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\u0000') continue; // skip already processed chars

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    ch[j] = '\u0000'; // mark duplicate as null char
                }
            }

            res += ch[i]; // add unique char to result
        }

        System.out.println(res);
    }
}
