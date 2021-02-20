package by.epam.java.module_2.package_2;

/*
 *   15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_15 {

    public static void main(String[] args) {

        int m = 5;
        int n = 5;
        int[][] matrix;

        matrix = MyUtil.generateMatrix(m, n);
        int max = matrix[0][0];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.printf("Max element is %d", max);

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
        MyUtil.printMatrix(matrix);
    }
}
