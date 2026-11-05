package CDAC.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arrays : ");
        int size = sc.nextInt();

        int arr [] = new int[size];
        System.out.println("Enter the " + size + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr,0, size - 1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void sort(int [] arr, int start, int end) {

        if (start > end) {
            return;
        }
        int i = start;
        int j = end;
        int pivot = (start + end) / 2;

        while (i <= j) {
            while (arr[i] < arr[pivot]) i++;
            while (arr[j] > arr[pivot]) j--;

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            sort(arr, start, j);
            sort(arr, i, end);

        }
    }
}
