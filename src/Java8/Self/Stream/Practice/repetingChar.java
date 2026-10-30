package Java8.Self.Stream.Practice;
import java.util.*;
public class repetingChar {
    public static void main(String[] args) {
//        String s1="morning";
//        Character ch=s1.chars().mapToObj(i->(char)i).filter(i->s1.indexOf(i)==s1.lastIndexOf(i)).findFirst()
//                .get();
//        System.out.println(ch);


        String str = "morning";
        Character ch = str.chars()
                          .mapToObj(i -> (char)i)
                          .filter(i ->str.indexOf(i) != str.lastIndexOf(i))
                .findFirst()
                .get();
        System.out.println(ch);
    }
}
