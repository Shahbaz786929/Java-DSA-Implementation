package Arrays;

public class MinElement {
    public static void main(String[] args) {
        int [] nums = {8, 2, 6, 1, 9};
        System.out.println(minElement(nums));
    }
    public static int minElement (int [] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]){
                min = nums[i];
            }
        }

        return min;
    }
}
