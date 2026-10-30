package PracProgram.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {9,5,8,4,7,3,6,2};
        sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int [] a, int st, int end){
        if (st >= end) return;

        int i = st;
        int j = end;
        int pivot = (st + end) / 2;

        if (i <= j) {
            while (a[i] < a[pivot]) {
                i++;
            }
            while (a[j] > a[pivot]) j--;

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
             sort(a, st, j);
             sort(a, i, end);

    }
}
