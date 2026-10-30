package Java8.Self.Stream.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 8, 30, 25);

        Optional<Integer> secondhighest =
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondhighest.get());

    }
}
