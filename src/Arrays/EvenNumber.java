package Arrays;

public class EvenNumber {
    public static void main(String[] args) {
        int [] nums = {2, 5, 8, 7, 10};
        System.out.println(findEvenNumber(nums));
    }
    public static int findEvenNumber (int [] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
