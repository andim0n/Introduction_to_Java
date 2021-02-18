package m2_algorithmization.pak_2;

import m2_algorithmization.utils.MyUtil;

public class Task_6 {
    public static void main(String[] args) {

        int n = 10;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if ((j < i) || (j > n - i - 1)) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int i = n - 1; i >= n / 2; i--) {
            for (int j = 0; j < n; j++) {
                if ((j > i) || j < n - i - 1) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }

        MyUtil.printMatrix(matrix);
    }
}
