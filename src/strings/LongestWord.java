package strings;

public class LongestWord   {
    public static void main(String[] args) {
        String str = "java is very powerful language";

        String word = "";
        String sentence = "";

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if (ch != ' ') {
                        word += ch;
                    } else if (sentence.length() <= word.length()){
                        sentence = word;
                        word = "";
                    }
                }
        System.out.println(sentence.trim());
    }
}
