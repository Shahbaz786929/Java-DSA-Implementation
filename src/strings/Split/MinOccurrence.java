package strings.Split;

public class MinOccurrence {
    public static void main(String[] args) {
        String str = "programming";
        int [] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        int min = Integer.MAX_VALUE;
        char minChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (count[ch] != 0 && count[ch] < min) {
                min = count[ch];
                minChar = ch;
            }
        }
        System.out.println(minChar);
        System.out.println(min);
    }
}
