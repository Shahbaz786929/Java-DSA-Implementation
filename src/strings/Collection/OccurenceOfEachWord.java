package strings.Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfEachWord {
    public static void main(String[] args) {
        String srt = " java is java and java is very powerful";

        Map<String , Integer> map = new LinkedHashMap<>();

        for (String ch : srt.split(" ")){
            map.put(ch, map.getOrDefault(ch , 0) + 1);
        }

        for (Map.Entry<String, Integer> enty : map.entrySet()) {
                System.out.println(enty.getKey() + " -> " + enty.getValue());

        }
    }
}
