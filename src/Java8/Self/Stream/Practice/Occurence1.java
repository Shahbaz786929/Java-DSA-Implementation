package Java8.Self.Stream.Practice;

import java.util.*;
import java.util.stream.*;

public class Occurence1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "java", "python", "java", "c", "java", "python", "c"
        );

        Map<String, Long> result =
                list.stream()
                        .collect(Collectors.groupingBy(
                                s -> s,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));

        result.forEach((k, v) ->
                System.out.println(k + " , " + v)
        );
    }
}
