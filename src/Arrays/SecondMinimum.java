package Arrays;

public class SecondMinimum {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 25, 5},
                {30, 20, 15},
                {8, 40, 30}
        };

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = arr[i][j];

                if (num < min) {
                    secondMin = min;
                    min = num;
                } else if (num > min && num < secondMin) {
                    secondMin = num;
                }
            }
        }
        System.out.println("Second minimum value: " + secondMin);
    }
}

