package by.epam.java.module_2.package_2;

// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import by.epam.java.module_2.util.MyUtil;

public class Task_3 {

    public static void main(String[] args) {

        int m = 5;
        int n = 7;
        int k = 3;
        int p = 4;

        int[][] matrix = MyUtil.generateMatrix(m, n);

        System.out.printf("\nRow %d: ", k);

        for (int i = 0; i < matrix[0].length; i++) {

            System.out.printf("%d\t", matrix[k - 1][i]);
        }

        System.out.printf("\n\nColumn %d: ", p);

        for (int i = 0; i < matrix.length; i++) {

            System.out.printf("\n%d", matrix[i][p - 1]);
        }
    }
}
