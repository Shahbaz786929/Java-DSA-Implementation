package Java8.Self.Stream.Practice;

import java.util.*;

public class EvenOddFilter {
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(2, 5, 7, 10, 15, 20);

       numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n*n)
               .sorted(Comparator.reverseOrder())
               .forEach(System.out::println);
    }
}
