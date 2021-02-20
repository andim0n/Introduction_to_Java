package by.epam.java.module_2.package_2;

// 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

import by.epam.java.module_2.util.MyUtil;

public class Task_2 {

    public static void main(String[] args) {

        int n = 5;
        int[][] array = MyUtil.generateMatrix(n, n);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", array[i][i]);
        }
    }
}
