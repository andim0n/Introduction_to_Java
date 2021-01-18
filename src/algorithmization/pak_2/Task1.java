package algorithmization.pak_2;

import algorithmization.utils.MyUtil;

public class Task1 {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[][] array = MyUtil.setDoubleArray(n, m);

        for (int j = 1; j < m; j += 2) {
            if (array[0][j] > array[n - 1][j]) {
                for (int i = 0; i < n; i++) {
                    System.out.printf("\n%d", array[i][j]);
                }
            }
            System.out.printf("\t\t");
        }
    }
}
