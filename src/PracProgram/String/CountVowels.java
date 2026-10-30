package PracProgram.String;

public class CountVowels {
    public static void main(String[] args) {
        String s = "Jspider";
        String res="";
        s=s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                res+=ch;
                count++;
            }
            System.out.println(count);
            System.out.println(res);
        }
    }
}
