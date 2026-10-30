package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int [] a = { 6, 7, 5, 4, 3, 8, 9};
        System.out.println(search(a,3));
    }

    public static int search(int [] a, int key){
        for (int i = 0; i < a.length; i++){
            if (a[i] == key) return i;
        }
        return -1;
    }
}
