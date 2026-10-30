package strings;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String str = "java is very very easy";
        String[] res = str.split(" ");
        String result = ""; // new string to store unique words

        for (int i = 0; i < res.length; i++) {
            if (!result.contains(res[i] + " ")) {  // check in new string
                result += res[i] + " ";
            }
        }
        System.out.println(result.trim());
    }
}
