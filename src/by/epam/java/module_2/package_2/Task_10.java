package by.epam.java.module_2.package_2;

// 10. Найти положительные элементы главной диагонали квадратной матрицы

import by.epam.java.module_2.util.MyUtil;

public class Task_10 {

    public static void main(String[] args) {

        int n = 5;
        int[][] array;

        array = MyUtil.generateMatrix(n, n);

        for (int i = 0; i < n; i++) {

            if (array[i][i] > 0) {

                System.out.printf("%d\t", array[i][i]);
            }
        }

    }
}
