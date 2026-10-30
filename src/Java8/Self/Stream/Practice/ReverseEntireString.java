package Java8.Self.Stream.Practice;
import java.util.stream.Collectors;
public class ReverseEntireString {

    public static void main(String[] args) {
        String input = "Java is powerful";

        String result = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> b + a);

        System.out.println(result);
    }
}