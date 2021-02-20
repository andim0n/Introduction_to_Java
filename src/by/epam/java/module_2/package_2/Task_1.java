package by.epam.java.module_2.package_2;

// 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

import by.epam.java.module_2.util.MyUtil;

public class Task_1 {

    public static void main(String[] args) {

        int m = 3;
        int n = 9;
        int[][] array = MyUtil.generateMatrix(m, n);

        for (int j = 1; j < n; j += 2) {

            if (array[0][j] > array[m - 1][j]) {

                for (int i = 0; i < m; i++) {

                    System.out.printf("\n%d", array[i][j]);
                }
                System.out.println();
            }

        }
    }
}
