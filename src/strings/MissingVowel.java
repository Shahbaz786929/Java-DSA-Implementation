package strings;

import java.util.StringJoiner;

public class MissingVowel {
    public static void main(String[] args) {
        String str = "aeiouAEIOU";
        String s = "India";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!s.contains(ch+"")){
                res += ch;
            }

        }
        System.out.println(res);
    }
}
