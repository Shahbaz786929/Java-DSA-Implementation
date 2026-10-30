package Java8.Self.Stream.Practice;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "grapes"
        );

        String firstUnique =
                list.stream()
                        // STEP 1: count words
                        .collect(Collectors.groupingBy(
                                s -> s,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        // STEP 2: map → stream
                        .entrySet()
                        .stream()
                        // STEP 3: filter unique
                        .filter(e -> e.getValue() == 1)
                        // STEP 4: take word
                        .map(e -> e.getKey())
                        // STEP 5: first one
                        .findFirst()
                        .orElse(null);

        System.out.println(firstUnique);
    }
}
