package Sorting;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr = {10, 3, 9, 1, 7, 5, 2, 4, 11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        if (arr.length == 1) return;

        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[left.length + j];
        }

        sort(left);
        sort(right);
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
