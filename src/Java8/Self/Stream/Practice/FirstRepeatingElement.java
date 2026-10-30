package Java8.Self.Stream.Practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 3, 4, 3, 5, 6);
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        Integer result = list.stream()
                .filter(i -> map.get(i) > 1)
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
