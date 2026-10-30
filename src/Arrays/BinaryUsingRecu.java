package Arrays;

public class BinaryUsingRecu {

    public static void main(String[] args) {
        int [] a = {1, 3, 5, 2, 8, 5};
        int st = 0;
        int end = a.length - 1;
        System.out.println(search(a, 8, 0, a.length - 1));
    }
    public static int search(int [] a, int key, int st, int end) {
        if (st > end) return -1;

        int mid = (st + end) / 2;
        if (key == a[mid]) return mid;
        else if (key < a[mid]) return search(a, key, st, mid - 1);
        else
            return search(a, key, mid + 1, end);
    }
}
