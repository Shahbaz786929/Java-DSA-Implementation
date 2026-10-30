package PracProgram.String;

public class Alphanumaric {
    public static void main(String[] args) {
        String str = "Leraja1123@gmail.com";
        int sum = 0;

        for (int i = 0; i < str.length() - 1; i++){
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9'){
                sum += ch-'0';
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
