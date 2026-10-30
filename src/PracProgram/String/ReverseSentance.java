package PracProgram.String;

public class ReverseSentance {
    public static void main(String[] args) {
        String str = "java is easy";
        String rev = " ";
        int i = str.length() - 1;
        int j = i;

        while (j >= 0) {
            while (j >= 0 && str.charAt(j) != ' '){
                j--;
            }
            int k = j + 1;
            while (k <= i){
                rev += str.charAt(k);
                k++;
            }
            rev += " ";
            j--;
            i = j;

        }
        System.out.println(rev);
    }
}
