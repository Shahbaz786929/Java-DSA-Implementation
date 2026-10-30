package Java8.Self.Stream.Practice;

import java.util.*;
import java.util.stream.Collectors;

public class frequencyCount {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "java", "python", "java", "c", "java", "python"
        );

        Map<String, Long> freqMap =
                list.stream()
                        .collect(Collectors.groupingBy(
                                i -> i,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));

        freqMap.forEach((k, v) ->
                System.out.println(k + " = " + v)
        );
    }
}
