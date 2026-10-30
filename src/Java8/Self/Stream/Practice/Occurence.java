package Java8.Self.Stream.Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurence {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Long> result =
                str.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));
        result.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
