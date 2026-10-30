import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int [][] a = {{1,2,3}, {4,5,6}, {7,8,9}};

        Arrays.sort(a);
        for (int i = 0; i <a.length; i++){
            int secondMax = a.length - 2;
            System.out.println(secondMax);
        }
    }
}
