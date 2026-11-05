package CDAC.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = sc.nextInt();

        int arr [] = new int[size];

        System.out.println("Enter array elements in sorted order:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target Value : ");
        int target = sc.nextInt();

        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Element not found : " + target);
        } else {
            System.out.println("Index of Element is : " + result);
        }

        sc.close();
    }

    public static int search(int [] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
