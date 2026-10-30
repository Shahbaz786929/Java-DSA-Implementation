package Arrays;

public class SecondMaxInOne_D {
    public static void main(String[] args) {
        int [] a = {9, 1, 3, 10, 5, 8};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : a){
            if (num > max) {
                secondMax = max;
                max = num;
            }
            else if (num > secondMax && num < max){
                secondMax = num;
            }
        }
        System.out.println(secondMax);
    }
}
