import java.util.Scanner;

public class CustomStringOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        result.append("G");

        if (input.length() >= 6){

            result.append(input.charAt(5));
            result.append((input.charAt(4)));
            result.append((input.charAt(3)));
            result.append(input.charAt(2));
            result.append(input.charAt(1));

        }
        System.out.println("Output :" + result.toString());

        sc.close();
    }
}
