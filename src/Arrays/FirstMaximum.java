package Arrays;

public class FirstMaximum {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 25, 5},
                {30, 20, 15},
                {8, 40, 30}
        };
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}
