package strings.SubString;
import java.util.HashSet;
import java.util.Set;
public class LongestSubstring {
        public static void main(String[] args) {

            String str = "pwwkew";

            Set<Character> window = new HashSet<>();

            int left = 0;          // window start
            int maxLength = 0;     // answer

            for (int right = 0; right < str.length(); right++) {

                char current = str.charAt(right);

                // jab tak repeat hai, window chhoti karo
                while (window.contains(current)) {
                    window.remove(str.charAt(left));
                    left++;
                }

                // repeat nahi hai → add karo
                window.add(current);

                // window size check
                maxLength = Math.max(maxLength, right - left + 1);
            }

            System.out.println(maxLength);
        }
    }
