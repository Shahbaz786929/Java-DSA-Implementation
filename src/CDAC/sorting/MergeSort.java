package CDAC.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arrays : ");
        int size = sc.nextInt();

        int arr [] = new int[size];
        System.out.println("Enter the " + size + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void sort(int [] arr) {

        if (arr.length == 1) return;

        int [] left = new int[arr.length / 2];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        int right [] = new int[arr.length - left.length];
        for (int j = 0; j <right.length; j++) {
            right[j] = arr[left.length + j];
        }
        sort(left);
        sort(right);
        merge(left, right,arr);
    }

    public static void merge(int [] a, int [] b, int [] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length)
            c[k++] = a[i++];

        while (j < b.length)
            c[k++] = b[j++];
    }
}
