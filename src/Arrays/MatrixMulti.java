package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixMulti {
    public static void main(String[] args) {
        int [][] a = {{1, 1, 2},
                      {3, 2, 1},
                      {4, 5, 6}};

        int [][] b = {{1, 2, 1},
                      {3, 1, 2},
                      {4, 3, 2}};

        int [][] c = new int[a.length][a.length];
        for (int i = 0; i <a.length; i++){
            for (int j = 0; j <a[i].length; j++){
                for (int k = 0; k <a[i].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int [] n : c){
            System.out.println(Arrays.toString(n));
        }
    }
}
