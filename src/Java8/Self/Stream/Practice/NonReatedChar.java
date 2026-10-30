package Java8.Self.Stream.Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonReatedChar {
    public static void main(String[] args) {
        String str = "aabbcddeff";

        String result = String.valueOf(str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(s -> s,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter( e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get());
        System.out.println(result);
    }
}
