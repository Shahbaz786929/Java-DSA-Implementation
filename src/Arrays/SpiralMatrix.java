package Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        int row = 0;
        int col = -1;
        char dir = 'r';

        for (int i = 1; i <= n * n; i++) {
            switch (dir) {
                case 'r': {
                    col++;
                    a[row][col] = i;
                    if (col == n - 1 || a[row][col + 1] != 0)
                        dir = 'd';
                }
                break;

                case 'd': {
                    row++;
                    a[row][col] = i;
                    if (row == n - 1 || a[row + 1][col] != 0)
                        dir = 'l';
                }
                break;

                case 'l': {
                    col--;
                    a[row][col] = i;
                    if (col == 0 || a[row][col - 1] != 0)
                        dir = 'u';
                }
                break;

                case 'u': {
                    row--;
                    a[row][col] = i;
                    if (row == 0 || a[row - 1][col] != 0)
                        dir = 'r';
                }
                break;
            }
        }

        // Print matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
