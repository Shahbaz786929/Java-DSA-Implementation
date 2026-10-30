package strings.Split;

public class MaxOccurence {
    public static void main(String[] args) {
        String str = "programming";
        int [] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }
        int max = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if (count[ch] > max) {
                max = count[ch];
                maxChar = ch;
            }
        }
        System.out.println(maxChar);
        System.out.println(max);
    }
}
