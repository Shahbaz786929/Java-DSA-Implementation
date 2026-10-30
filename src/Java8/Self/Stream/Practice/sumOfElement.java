package Java8.Self.Stream.Practice;
import java.util.*;
public class sumOfElement {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
         double result=list.stream().mapToInt(x->x).average().getAsDouble();
        System.out.println(result);
    }
}
