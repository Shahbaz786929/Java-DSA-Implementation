package Java8.Jspider.Stream;

import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ram", "sita", "zaana", "Beena" , "Dena", "Ram", "sita", "zeha");
        List<String> aslist = list.stream()
                .distinct()
                .map(i ->i.toLowerCase())
                .sorted()
                .toList();
        System.out.println(aslist);
    }
}
