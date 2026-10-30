package Java8.Self.Stream.Practice;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "Java is powerful";

        String result = Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}