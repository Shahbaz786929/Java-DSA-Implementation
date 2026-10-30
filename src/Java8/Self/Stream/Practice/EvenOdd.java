package Java8.Self.Stream.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        Map<Boolean, List<Integer>> result = list.stream()
//                .collect(Collectors.partitioningBy(e -> e % 2 == 0));
//        System.out.println("Even Number " + result.get(true));
//        System.out.println("Odd Number " + result.get(false));
//    }

   // Even number
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

    List<Integer> result = list.stream()
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toList());
    System.out.println(result);
}
// Second largest number
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
//
//        Integer result = list.stream()
//                .sorted((a,b) -> b - a)
//                .skip(1)
//                .findFirst().orElse(null);
//        System.out.println(result);
//    }

//    //second smallest number
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(5, 3, 9, 1, 3, 7);
//        Integer result = list.stream()
//                .distinct()
//                .sorted()
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//        System.out.println(result);
//    }
}
