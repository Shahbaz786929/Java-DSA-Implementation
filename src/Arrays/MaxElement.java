package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int [] nums = {3, 7, 1, 9, 4};
        System.out.println(maxElement(nums));
    }
    public static int maxElement (int [] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
