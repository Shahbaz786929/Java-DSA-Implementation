package Java8.Self.Stream.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GraterThanMedelAllElem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 40);

        List<Integer> result = list.stream()
                .filter(i -> i > 25)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
