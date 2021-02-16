package m2_algorithmization.pak_2;

import m2_algorithmization.utils.MyUtil;

public class Task3 {
    public static void main(String[] args) {
        int n = 5;
        int m = 7;
        int k = 3;
        int p = 4;
        int[][] array = MyUtil.generateMatrix(n, m);

        System.out.printf("\nRow %d: ", k);
        for (int i = 0; i < m; i++) {
            System.out.printf("%d\t\t", array[k][i]);
        }

        System.out.printf("\nColumn %d: ", p);
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%d", array[i][p]);
        }
    }
}
