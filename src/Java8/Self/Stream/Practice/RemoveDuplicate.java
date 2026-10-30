package Java8.Self.Stream.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,6,2,1);
        List<Integer> result = list.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                        .map(k -> k * k)
                                .sorted((a,b) -> a - b)
                                        .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
