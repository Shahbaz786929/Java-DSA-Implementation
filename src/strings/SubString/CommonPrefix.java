package strings.SubString;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        // Edge case
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Step 1: Take first word as reference
        String first = strs[0];

        // Step 2: Compare character by character
        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            // Step 3: Compare with same index of all other words
            for (int j = 1; j < strs.length; j++) {

                // Case 1: word length chhoti hai
                if (i >= strs[j].length()) {
                    return first.substring(0, i);
                }

                // Case 2: character mismatch
                if (strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        // Step 4: poora first word common hai
        return first;
    }
}

