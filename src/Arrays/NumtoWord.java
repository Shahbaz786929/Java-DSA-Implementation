package Arrays;

public class NumtoWord {
    public static void main(String[] args) {
        int n = 737238787;
        pw(n / 1000000, " Crore ");
        pw((n / 100000) % 100, " lakhs ");
        pw((n  / 1000) % 100, " thaousand ");
        pw((n / 100) % 10, " Hundred ");
        pw(n % 100, "");

    }
    public static void pw(int n, String s){
        String [] one = {};
        String [] two= {};
        if (n <= 19)
            System.out.println(one[n] + "");
        else
            System.out.println(two[n / 10] + " " + one[n % 10]);
        if (n != 0)
            System.out.println(s);
    }
}
