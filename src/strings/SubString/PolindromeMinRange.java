package strings.SubString;

public class PolindromeMinRange {
    public static void main(String[] args) {
        String str = "malayalam";
        String res = str;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 3; j <= str.length(); j++) {
                String s = str.substring(i, j);

                if (isPolindrome(s)) {
                    if (s.length() < res.length()) {
                        res = s;
                    }
                }
            }
        }

        System.out.println("Smallest Palindrome Substring: " + res);
    }

    public static boolean isPolindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
