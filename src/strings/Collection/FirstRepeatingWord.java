package strings.Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingWord {
    public static void main(String[] args) {
        String str = "java is java and java is powerful";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String ch : str.split(" ")) {
            map.put(ch, map.getOrDefault(ch, 0 ) + 1);
        }

        for (Map.Entry<String , Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
