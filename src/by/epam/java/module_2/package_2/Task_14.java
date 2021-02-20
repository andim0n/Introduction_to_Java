package by.epam.java.module_2.package_2;

/*
 *  14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 *  причем в каждом столбце число единиц равно номеру столбца.
 */

import by.epam.java.module_2.util.MyUtil;

import java.util.Random;

public class Task_14 {

    public static void main(String[] args) {

        int n = 10;
        int[][] matrix = new int[n][n];
        int count = 0;
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {

            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {

                if ((count < i + 1) && (rand.nextBoolean())) {

                    matrix[j][i] = 1;
                    count++;
                } else {
                    matrix[j][i] = 0;
                }
            }
            if (count != (i + 1)) {
                i--;
            }

        }
        MyUtil.printMatrix(matrix);
    }
}
