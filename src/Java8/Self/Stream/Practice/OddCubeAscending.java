package Java8.Self.Stream.Practice;

import java.util.*;

public class OddCubeAscending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 10);
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n*n*n)
                .sorted()
                .forEach(System.out::println);
    }
}
