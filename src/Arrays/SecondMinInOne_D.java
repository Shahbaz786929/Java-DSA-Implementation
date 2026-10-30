package Arrays;

public class SecondMinInOne_D {
    public static void main(String[] args) {
        int [] a = {9, 1, 3, 10, 5, 8};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : a) {
            if (num < min){
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;
            }
        }
        System.out.println(secondMin);
    }
}
