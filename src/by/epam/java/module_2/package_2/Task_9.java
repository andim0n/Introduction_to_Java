package by.epam.java.module_2.package_2;

/*
 *  9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 *  Определить, какой столбец содержит максимальную сумму.
 */

import by.epam.java.module_2.util.MyUtil;

public class Task_9 {

    public static void main(String[] args) {

        int n = 5;
        int[][] matrix;
        int[] sum = new int[n];
        int max;
        int maxI = 0;

        matrix = MyUtil.generateMatrix(n, n);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                sum[j] += matrix[i][j];
            }
        }

        max = sum[0];

        for (int i = 0; i < sum.length; i++) {

            if (sum[i] > max) {
                max = sum[i];
                maxI = i;
            }
        }
        MyUtil.printArray(sum);
        System.out.printf("\nColumn with number %d has maximum size: %d", maxI, max);
    }
}
