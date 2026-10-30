package Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4}; //o/p = 6
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);

            if (currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
