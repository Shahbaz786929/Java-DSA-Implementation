package PracProgram.String;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "java is easy";
        String rev = "";
        int i = 0;
        int j = i;
        while (j < str.length()) {
            while (j < str.length() && str.charAt(j) != ' ') {
                j++;
            }
                int k = j - 1;

                while (k >= i){
                    rev += str.charAt(k);
                    k--;
                }
                rev += " ";
                j++;
                i = j;

            }
        System.out.println(rev);
        }
    }

