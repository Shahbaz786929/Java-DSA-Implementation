package Java8.Self.Stream.Practice;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
       int [] arr = {1,2,5,4,3,6,9,8,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
           int minIndex = i;
           for (int j =  i + 1; j <arr.length; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
