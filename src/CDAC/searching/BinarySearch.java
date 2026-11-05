package CDAC.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int arr [] = {2, 4, 6, 8, 9};
        System.out.println("Index of Element is : " +search(arr, 9));
    }

    public static int search(int [] arr, int key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) return mid;

            if (key < arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
