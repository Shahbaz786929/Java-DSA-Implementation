package Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,2};
        System.out.println(isDuplicate(arr));
    }
    public static int isDuplicate (int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int index = Math.abs(arr[i]);

            if (arr[index] < 0) {
                return index;
            }
            arr[index] = -arr[index];
        }
        return -1;
    }
}
