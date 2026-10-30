package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 25, 5},
                {30, 20, 15},
                {8, 40, 30}
        };

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = arr[i][j];

                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num > secondMax && num < max) {
                    secondMax = num;
                }
            }
        }
        System.out.println("Second maximum value: " + secondMax);
    }
}

