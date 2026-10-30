package Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.MAX_VALUE;

public class FirstRepeatingElemnt {
        public static void main(String[] args) {

            // remove largest element and remaining element print
//           List<Integer> list1 = Arrays.asList(10,50,30,20,40);
//
//       int max = list1.stream()
//                       .min(Integer::compare)
//                       .get();
//
//       List<Integer> result = list1.stream()
//                            .filter(i -> i != max)
//                                    .collect(Collectors.toList());
//
//            System.out.println(result);

            List<Integer> list = Arrays.asList(12, 3,22, 44, 66,33);
            List<Integer> result = list.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println(result);
    }

}
