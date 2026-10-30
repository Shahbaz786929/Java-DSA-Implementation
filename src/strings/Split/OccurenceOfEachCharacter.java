package strings.Split;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "programming";
        int [] count = new int[256];

        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] != 0) {
                System.out.println(ch + " : " + count[ch]);
                count[ch] = 0;
            }
        }
    }
}
