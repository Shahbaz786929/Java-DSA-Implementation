package Java8.Self.Stream.Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
//        String str = "malayalam";
//        String res = "";
//        for (int i = 0; i< str.length(); i++) {
//            for (int j = i + 1; j < str.length() ; j++) {
//                String s = str.substring(i,j);
//                if (isPolingdrom(s)){
//                    if (s.length() > res.length()){
//                        res = s;
//                    }
//                  //  System.out.println(res);
//                }
//            }
//          //  System.out.println(res);
//        }
//        System.out.println(res);
//    }
//    public static boolean isPolingdrom(String s){
//        int i = 0;
//        int j = s.length() - 1;
//        while (i < j) {
//            if (s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;


        List<String> list = Arrays.asList("apple", "banana", "cherry", "apple", "banana");

        // Step 1: Count frequency using groupingBy
        Map<String, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));

        // Step 2: Find highest frequency entry
        Map.Entry<String, Long> maxEntry = frequencyMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        // Step 3: Print result
        System.out.println("Word with highest frequency: " + maxEntry.getKey());
        System.out.println("Frequency: " + maxEntry.getValue());
    }
}
