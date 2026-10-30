package strings;

public class StringPattern  {
    public static void main(String[] args) {
        String s = "Spiders";

        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j <= i; j++){
                char ch = s.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
