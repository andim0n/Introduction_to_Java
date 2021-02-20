package by.epam.java.module_2.package_2;

// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import by.epam.java.module_2.util.MyUtil;

public class Task_12 {

    public static void main(String[] args) {

        int m = 5;
        int n = 7;
        int[][] matrix;

        matrix = MyUtil.generateMatrix(m, n);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (matrix[i][j] > matrix[i][k]) {

                        int b = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = b;
                    }
                }
            }
        }
        MyUtil.printMatrix(matrix, m, n);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (matrix[i][j] < matrix[i][k]) {

                        int b = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = b;
                    }
                }
            }
        }
        MyUtil.printMatrix(matrix, m, n);
    }
}
