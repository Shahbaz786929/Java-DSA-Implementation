package strings;

public class MultiplyString {

        public String multiply(String num1, String num2) {
            int m = num1.length(), n = num2.length();
            int[] pos = new int[m + n];

            // Multiply each digit and add at the corresponding position
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                    int p1 = i + j, p2 = i + j + 1;
                    int sum = mul + pos[p2];

                    pos[p1] += sum / 10;  // carry
                    pos[p2] = sum % 10;   // current digit
                }
            }

            // Build the result string
            StringBuilder sb = new StringBuilder();
            for (int p : pos) {
                if (!(sb.length() == 0 && p == 0)) { // skip leading zeros
                    sb.append(p);
                }
            }

            return sb.length() == 0 ? "0" : sb.toString();
        }

        // Testing the code
        public static void main(String[] args) {
            MultiplyString sol = new MultiplyString();
            String num1 = "123";
            String num2 = "45";
            String result = sol.multiply(num1, num2);
            System.out.println("Result: " + result); // Output: 5535
        }


}
