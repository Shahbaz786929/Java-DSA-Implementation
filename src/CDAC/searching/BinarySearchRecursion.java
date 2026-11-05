
package CDAC.searching;

import java.util.Scanner;

public class BinarySearchRecursion {

    public static void main(String[] args) {

        System.out.println("Enter the size of Array...");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements in sorted order:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target value...");
        int target = sc.nextInt();

        int result = search(arr, target, 0, size - 1);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }

    public static int search(int[] arr, int key, int start, int end) {

        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (key == arr[mid])
            return mid;

        if (key < arr[mid])
            return search(arr, key, start, mid - 1);
        else
            return search(arr, key, mid + 1, end);
    }
}
