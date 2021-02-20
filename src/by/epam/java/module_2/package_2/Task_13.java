package by.epam.java.module_2.package_2;

// 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

import by.epam.java.module_2.util.MyUtil;

public class Task_13 {

    public static void main(String[] args) {

        int m = 5;
        int n = 5;
        int[][] matrix;

        matrix = MyUtil.generateMatrix(m, n);

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (matrix[j][i] > matrix[k][i]) {

                        int b = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = b;
                    }
                }
            }
        }
        MyUtil.printMatrix(matrix, m, n);

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (matrix[j][i] < matrix[k][i]) {

                        int b = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = b;
                    }
                }
            }
        }
        MyUtil.printMatrix(matrix, m, n);
    }
}

